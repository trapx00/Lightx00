package trapx00.lightx00.client.presentation.promotionui.detail;

import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import trapx00.lightx00.client.blservice.promotionblservice.ClientPromotionBlService;
import trapx00.lightx00.client.blservice.promotionblservice.ClientPromotionBlServiceFactory;
import trapx00.lightx00.client.presentation.commodityui.commodity.CommoditySelection;
import trapx00.lightx00.client.presentation.commodityui.factory.CommodityUiFactory;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.presentation.promotionui.PromotionCommodityModel;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.client.vo.manager.promotion.ClientPromotionVo;
import trapx00.lightx00.shared.exception.bl.UncheckedRemoteException;
import trapx00.lightx00.shared.exception.presentation.NotCompleteException;
import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.util.BillHelper;
import trapx00.lightx00.shared.util.DateHelper;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class ClientPromotionUiController implements DraftContinueWritableUiController, ExternalLoadableUiController {
    public JFXTextField tfId;
    public JFXDatePicker tfStartDate;
    public JFXDatePicker tfEndDate;
    public JFXTextField tfClientLevel;
    public JFXTextField tfSalePrice;
    public JFXTextField tfCouponPrice;
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

    private ClientPromotionBlService blService = ClientPromotionBlServiceFactory.getInstance();

    private CommoditySelection commoditySelection = CommodityUiFactory.getCommoditySelectionUi();

    private ObservableList<PromotionCommodityModel> promotionCommodityModelObservableList = FXCollections.observableArrayList();

    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/managerui/ClientPromotionUi.fxml").loadAndGetPackageWithoutException();
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
        ClientPromotionVo clientPromotion = (ClientPromotionVo) draft;
        ExternalLoadedUiPackage externalLoadedUiPackage = load();
        ClientPromotionUiController continueWriting = externalLoadedUiPackage.getController();
        continueWriting.tfId.setText(clientPromotion.getId());
        continueWriting.tfStartDate.setValue(DateToLocalDate(clientPromotion.getStartDate()));
        continueWriting.tfEndDate.setValue(DateToLocalDate(clientPromotion.getEndDate()));
        continueWriting.tfClientLevel.setText(String.valueOf(clientPromotion.getClientLevel()));
        continueWriting.tfCouponPrice.setText(String.valueOf(clientPromotion.getCouponPrice()));
        continueWriting.addPromotionCommodities(clientPromotion.getPromotionCommodities());
        return externalLoadedUiPackage;
    }

    public void initialize() {
        tfId.setText(blService.getId());
        tfClientLevel.setText("0");
        tfSalePrice.setText("0");
        tfCouponPrice.setText("0");

        tcId.setCellValueFactory(cellData -> cellData.getValue().getValue().idProperty());
        tcName.setCellValueFactory(cellData -> cellData.getValue().getValue().nameProperty());
        tcPrice.setCellValueFactory(cellData -> new SimpleStringProperty(BillHelper.toFixed(cellData.getValue().getValue().getPrice())));
        tcAmount.setCellValueFactory(cellData -> new SimpleStringProperty(BillHelper.toFixed(cellData.getValue().getValue().getAmount())));

        TreeItem<PromotionCommodityModel> root = new RecursiveTreeItem<>(promotionCommodityModelObservableList, RecursiveTreeObject::getChildren);
        tbPromotionCommodity.setRoot(root);
        tbPromotionCommodity.setShowRoot(false);
        tbPromotionCommodity.setEditable(true);
        tbPromotionCommodity.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    private ClientPromotionVo getCurrentClientPromotionVo() {
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

        else if (tfClientLevel == null ) {
            PromptDialogHelper.start("提交失败！","请选择客户等级。")
                    .addCloseButton("好的","CHECK", null)
                    .createAndShow();
            throw new NotCompleteException();
        }

        if(tfSalePrice.getText().length()== 0)
            tfSalePrice.setText("0");
        return new ClientPromotionVo(
                tfId.getText(),
                DateHelper.fromLocalDate(tfStartDate.getValue()),
                DateHelper.fromLocalDate(tfEndDate.getValue()),
                PromotionState.Waiting,
                Integer.valueOf(tfClientLevel.getText()),
                Integer.valueOf(tfCouponPrice.getText()),
                promotionCommodityModelObservableList.stream().map(PromotionCommodityModel::toPromotionCommodity).toArray(PromotionCommodity[]::new),
                Integer.valueOf(tfSalePrice.getText())
        );
    }

    public void onBtnSubmitClicked() {
        try {
            blService.submit(getCurrentClientPromotionVo());
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
            blService.saveAsDraft(getCurrentClientPromotionVo());
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
        tfStartDate.setValue(null);
        tfEndDate.setValue(null);
        tfClientLevel.setText("");
        tfCouponPrice.setText("");
        promotionCommodityModelObservableList.clear();
    }

    public void onBtnAddGiftClicked() {
        commoditySelection.showCommoditySelectDialog(
                vo -> promotionCommodityModelObservableList.add(new PromotionCommodityModel(new PromotionCommodity(vo.getId(), vo.getName(),vo.getRetailPrice(),1)))
        );
    }

    public void onBtnDeleteGiftClicked () {
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

    private LocalDate DateToLocalDate(Date date) {
        Instant instant = date.toInstant();
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        return localDateTime.toLocalDate();
    }
}