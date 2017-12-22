package trapx00.lightx00.client.presentation.promotionui;

import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import trapx00.lightx00.client.blservice.promotionblservice.ComSalePromotionBlService;
import trapx00.lightx00.client.blservice.promotionblservice.ComSalePromotionBlServiceFactory;
import trapx00.lightx00.client.presentation.commodityui.commodity.CommoditySelection;
import trapx00.lightx00.client.presentation.commodityui.factory.CommodityUiFactory;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.client.vo.manager.promotion.ComSalePromotionVo;
import trapx00.lightx00.shared.exception.bl.UncheckedRemoteException;
import trapx00.lightx00.shared.exception.presentation.NotCompleteException;
import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.util.BillHelper;

import java.io.IOException;
import java.util.Date;

public class ComSalePromotionUiController implements DraftContinueWritableUiController, ExternalLoadableUiController {
    public JFXTextField tfId;
    public JFXTextField tfStartDate;
    public JFXTextField tfEndDate;
    public JFXTextField tfSalePrice;
    public JFXTreeTableView<PromotionCommodityModel> tbPromotionCommodity;
    public JFXTreeTableColumn<PromotionCommodityModel, String> tcId;
    public JFXTreeTableColumn<PromotionCommodityModel, String> tcName;
    public JFXTreeTableColumn<PromotionCommodityModel, String> tcPrice;
    public JFXTreeTableColumn<PromotionCommodityModel, String> tcAmount;
    public JFXButton btnAdd;
    public JFXButton btnDelete;
    public JFXButton btnSubmit;
    public JFXButton btnDraft;
    public JFXButton btnReset;
    public Label lbTotal;


    private ObjectProperty<Date> startDate = new SimpleObjectProperty<>();
    private ObjectProperty<Date> endDate = new SimpleObjectProperty<>();

    private ComSalePromotionBlService blService = ComSalePromotionBlServiceFactory.getInstance();

    private CommoditySelection commoditySelection = CommodityUiFactory.getCommoditySelectionUi();

    private ObservableList<PromotionCommodityModel> promotionCommodityModelObservableList = FXCollections.observableArrayList();

    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/managerui/ComSalePromotionUi.fxml").loadAndGetPackageWithoutException();
    }


    /**
     * Start continuing write a draft. Returns a ExternalLoadableUiController. It can be used to set the stage without casting to specific ui controller.
     * Overrides to return a specific ui controller.
     *
     * @param draft draft
     * @return a ExternalLoadableUiController
     */
    @Override
    public ExternalLoadedUiPackage continueWriting(Draftable draft) {
        /**
         * 草稿功能实现。
         * 和对应单据详细界面一样，通过传入的参数初始化对应的控件元素信息。
         */
        ComSalePromotionVo comSalePromotion = (ComSalePromotionVo) draft;
        ExternalLoadedUiPackage externalLoadedUiPackage = load();
        ComSalePromotionUiController comSalePromotionDetailUi = externalLoadedUiPackage.getController();
        comSalePromotionDetailUi.tfId.setText(comSalePromotion.getId());
        comSalePromotionDetailUi.startDate.setValue(comSalePromotion.getStartDate());
        comSalePromotionDetailUi.endDate.setValue(comSalePromotion.getEndDate());
        comSalePromotionDetailUi.tfSalePrice.setText(String.valueOf(comSalePromotion.getOnSalePrice()));
        comSalePromotionDetailUi.addPromotionCommodities(comSalePromotion.getPromotionCommodities());
        return externalLoadedUiPackage;
    }

    public void initialize() {
        tcId.setCellValueFactory(cellData -> cellData.getValue().getValue().idProperty());
        tcName.setCellValueFactory(cellData -> cellData.getValue().getValue().nameProperty());
        tcPrice.setCellValueFactory(cellData -> new SimpleStringProperty(BillHelper.toFixed(cellData.getValue().getValue().getPrice())));
        tcAmount.setCellValueFactory(cellData -> new SimpleStringProperty(BillHelper.toFixed(cellData.getValue().getValue().getAmount())));

        promotionCommodityModelObservableList.addListener((ListChangeListener<PromotionCommodityModel>) c -> {
            lbTotal.setText(BillHelper.toFixed(promotionCommodityModelObservableList.stream().mapToDouble(PromotionCommodityModel::getAmount).sum()));
        });

        TreeItem<PromotionCommodityModel> root = new RecursiveTreeItem<>(promotionCommodityModelObservableList, RecursiveTreeObject::getChildren);
        tbPromotionCommodity.setRoot(root);
        tbPromotionCommodity.setShowRoot(false);
        tbPromotionCommodity.setEditable(true);
        tbPromotionCommodity.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    private ComSalePromotionVo getCurrentComSalePromotionVo() {
        if (tfId.getText().length() == 0) {
            PromptDialogHelper.start("提交失败！","请先获得促销策略编号。")
                    .addCloseButton("好的","CHECK", null)
                    .createAndShow();
            throw new NotCompleteException();
        }

        else if (tfStartDate == null || tfEndDate == null) {
            PromptDialogHelper.start("提交失败！","请输入有效的促销策略生效时间区间。")
                    .addCloseButton("好的","CHECK", null)
                    .createAndShow();
            throw new NotCompleteException();
        }

        else if (tfSalePrice == null ) {
            PromptDialogHelper.start("提交失败！","请输入组合包售卖价格。")
                    .addCloseButton("好的","CHECK", null)
                    .createAndShow();
            throw new NotCompleteException();
        }
        return new ComSalePromotionVo(
                tfId.getText(),
                startDate.getValue(),
                endDate.getValue(),
                PromotionState.Waiting,
                promotionCommodityModelObservableList.stream().map(PromotionCommodityModel::toPromotionCommodity).toArray(PromotionCommodity[]::new),
                Integer.valueOf(tfSalePrice.getText())
        );
    }

    public void onBtnSubmitClicked() {
        try {
            blService.submit(getCurrentComSalePromotionVo());
            PromptDialogHelper.start("提交成功！", "促销策略已经提交。")
                    .addCloseButton("好的", "CHECK", e -> onBtnResetClicked())
                    .createAndShow();
        } catch (NotCompleteException ignored) {
        } catch (UncheckedRemoteException e) {
            PromptDialogHelper.start("提交失败！","网络错误。详细信息：\n" + e.getRemoteException().getMessage())
                    .addCloseButton("好的","CHECK", null)
                    .createAndShow();
        }
    }

    public void onBtnDraftClicked() {
        try {
            blService.saveAsDraft(getCurrentComSalePromotionVo());
            PromptDialogHelper.start("保存草稿成功","促销策略已经保存为草稿。")
                    .addCloseButton("好的","CHECK", e -> onBtnResetClicked())
                    .createAndShow();
        } catch (NotCompleteException ignored) {
        } catch (UncheckedRemoteException e) {
            PromptDialogHelper.start("提交失败！","网络错误。详细信息：\n" + e.getRemoteException().getMessage())
                    .addCloseButton("好的","CHECK", null)
                    .createAndShow();
        }
    }

    public void onBtnResetClicked() {
        tfId.setText("");
        tfStartDate.setText("");
        tfEndDate.setText("");
        tfSalePrice.setText("");
        promotionCommodityModelObservableList.clear();
    }

    public void onBtnAddCommodityClicked() {
        commoditySelection.showCommoditySelectDialog(
                vo -> promotionCommodityModelObservableList.add(new PromotionCommodityModel(new PromotionCommodity(vo.getId(), vo.getName(),vo.getRetailPrice(),1)))
        );
    }

    public void onBtnDeleteCommodityClicked () {
        try {
            int index = tbPromotionCommodity.getSelectionModel().getSelectedIndex();
            promotionCommodityModelObservableList.remove(index);
        } catch (Exception ignored) {

        }
    }
    public void addPromotionCommodities (PromotionCommodity[] promotionCommodities) {
        for (PromotionCommodity commodity : promotionCommodities) {
            promotionCommodityModelObservableList.add(
                    new PromotionCommodityModel(commodity));
        }

    }

}
