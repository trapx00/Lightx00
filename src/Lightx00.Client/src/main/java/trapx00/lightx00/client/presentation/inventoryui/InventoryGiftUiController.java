package trapx00.lightx00.client.presentation.inventoryui;

import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import trapx00.lightx00.client.blservice.inventoryblservice.InventoryGiftBlService;
import trapx00.lightx00.client.blservice.inventoryblservice.InventoryGiftBlServiceFactory;
import trapx00.lightx00.client.presentation.commodityui.CommoditySelection;
import trapx00.lightx00.client.presentation.commodityui.factory.CommodityUiFactory;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.Reversible;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryGiftVo;
import trapx00.lightx00.shared.exception.bl.UncheckedRemoteException;
import trapx00.lightx00.shared.exception.database.NoMoreBillException;
import trapx00.lightx00.shared.exception.presentation.NotCompleteException;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;
import trapx00.lightx00.shared.util.DateHelper;

import java.util.Date;
import java.util.List;

public class InventoryGiftUiController implements DraftContinueWritableUiController, ExternalLoadableUiController,ReversibleUi {

    public JFXTextField tfOperator;
    public JFXTextField tfDate;
    public JFXTextField tfId;
    public JFXButton btnAdd;
    public JFXButton btnDelete;
    public JFXTreeTableView<InventoryGiftItemModel> inventoryGiftItems;
    public JFXTreeTableColumn<InventoryGiftItemModel, String> tcName;
    public JFXTreeTableColumn<InventoryGiftItemModel, String> tcPrice;
    public JFXTreeTableColumn<InventoryGiftItemModel, String> tcAmount;

    private ObjectProperty<List<CommodityVo>> currentCommodity = new SimpleObjectProperty<>();
    private ObjectProperty<Date> currentDate = new SimpleObjectProperty<>();
    private ObjectProperty<EmployeeVo> currentEmployee = new SimpleObjectProperty<>();

    private ObservableList<InventoryGiftItemModel> inventoryGiftItemModelObservableList = FXCollections.observableArrayList();
    private InventoryGiftBlService blService= InventoryGiftBlServiceFactory.getInstance();
    private CommoditySelection commoditySelection= CommodityUiFactory.getCommoditySelectionUi();

    /**
     * Start continuing write a draft. Returns a External loaded ui package.
     * Overrides to return a specific ui controller.
     *
     * @param draft draft
     * @return External loaded ui package including a controller and the component.
     */
    @Override
    public ExternalLoadedUiPackage continueWriting(Draftable draft) {
        /**
         * 草稿功能实现。
         * 和对应单据详细界面一样，通过传入的参数初始化对应的控件元素信息。
         */
        InventoryGiftVo inventoryGiftVo = (InventoryGiftVo) draft;
        ExternalLoadedUiPackage externalLoadedUiPackage = load();
        InventoryGiftUiController inventoryGiftUiController = (InventoryGiftUiController) externalLoadedUiPackage.getController();
        inventoryGiftUiController.tfId.setText(inventoryGiftVo.getId());
        inventoryGiftUiController.tfDate.setText(DateHelper.fromDate(inventoryGiftVo.getDate()));
        inventoryGiftUiController.tfOperator.setText(inventoryGiftVo.getOperatorId());
        inventoryGiftUiController.addGiftItems(inventoryGiftVo.getGifts());
        return externalLoadedUiPackage;
    }

    public void initialize() {
        tcName.setCellValueFactory(cellData -> new SimpleStringProperty(CommodityUiFactory.getCommoditySelectionUi().queryId(cellData.getValue().getValue().getPromotionCommodityObjectProperty().getCommodityId()).getName()));
        tcAmount.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getValue().getPromotionCommodityObjectProperty().getAmount())));
        tcPrice.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getValue().getPromotionCommodityObjectProperty().getUnitPrice())));


        currentDate.addListener(((observable, oldValue, newValue) -> {
            tfDate.setText(newValue == null ? "" : DateHelper.fromDate(newValue));
        }));

        currentEmployee.addListener(((observable, oldValue, newValue) -> {
            tfOperator.setText(newValue == null ? "" : newValue.getName());
        }));

        TreeItem<InventoryGiftItemModel> root = new RecursiveTreeItem<>(inventoryGiftItemModelObservableList, RecursiveTreeObject::getChildren);
        inventoryGiftItems.setRoot(root);
        inventoryGiftItems.setShowRoot(false);
        inventoryGiftItems.setEditable(true);
        inventoryGiftItems.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }


    public void addGiftItems(PromotionCommodity[] promotionCommodities) {
        for (PromotionCommodity promotionCommodity : promotionCommodities) {
            inventoryGiftItemModelObservableList.add(new InventoryGiftItemModel(promotionCommodity));
        }

    }
    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/inventoryui/InventoryGiftUi.fxml").loadAndGetPackageWithoutException();
    }

    @Override
    public ExternalLoadedUiPackage revertReversible(Reversible reversible) {
        return null;
    }

    public void onBtnAddItemClicked() {
        CommodityUiFactory.getCommoditySelectionUi()
                .showCommoditySelectDialog(vo -> this.currentCommodity.setValue(vo));
        CommodityVo[] commodityVo=currentCommodity.get().stream().toArray(CommodityVo[]::new);
        for(CommodityVo commodityVo1:commodityVo){
            PromotionCommodity promotionCommodity=new PromotionCommodity();
            promotionCommodity.setCommodityId(commodityVo1.getId());
            promotionCommodity.setAmount(commodityVo1.getAmount());
            promotionCommodity.setUnitPrice(commodityVo1.getRetailPrice());
            inventoryGiftItemModelObservableList.add(new InventoryGiftItemModel(
                    promotionCommodity));

        }
    }

    public void onBtnDeleteItemClicked() {
        try {
            int index = inventoryGiftItems.getSelectionModel().getSelectedIndex();
            inventoryGiftItemModelObservableList.remove(index);
        } catch (Exception ignored) {

        }
    }

    private InventoryGiftVo getCurrentGiftVo() {
        if (tfId.getText().length() == 0 || currentEmployee == null || currentDate == null) {
            PromptDialogHelper.start("提交失败！","请选点击自动填写信息以自动填写ID、日期和操作员信息。")
                    .addCloseButton("好的","CHECK", null)
                    .createAndShow();
            throw new NotCompleteException();
        }

        return new InventoryGiftVo(
                tfId.getText(),
                currentDate.getValue(),
                BillState.Draft,
                inventoryGiftItemModelObservableList.stream().map(InventoryGiftItemModel::getPromotionCommodityObjectProperty).toArray(PromotionCommodity[]::new),
                currentEmployee.getValue().getId()
        );
    }

    public void onBtnSubmitClicked() {
        try {
            blService.sumbit(getCurrentGiftVo());
            PromptDialogHelper.start("提交成功！", "你的单据已经提交成功")
                    .addCloseButton("好的", "CHECK", null)
                    .createAndShow();
        } catch (NotCompleteException ignored) {
        } catch (UncheckedRemoteException e) {
            PromptDialogHelper.start("提交失败！","网络错误。详细信息：\n" + e.getRemoteException().getMessage())
                    .addCloseButton("好的","CHECK", null)
                    .createAndShow();
        }
    }

    public void onBtnSaveAsDraftClicked() {
        try {
            blService.saveAsDraft(getCurrentGiftVo());
            PromptDialogHelper.start("提交成功！","你的单据已经提交成功")
                    .addCloseButton("好的","CHECK", null)
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
        tfOperator.setText("");
        tfDate.setText("");
        currentDate.setValue(null);
        currentEmployee.setValue(null);
        currentCommodity.setValue(null);
        inventoryGiftItemModelObservableList.clear();
    }

    public void onBtnAutofillClicked() {
        try {
            tfId.setText(blService.getId());
            currentDate.setValue(new Date());
            currentEmployee.setValue(FrameworkUiManager.getCurrentEmployee());
        } catch (NoMoreBillException e) {
            PromptDialogHelper.start("ID不够！","当日ID已经达到99999，无法增加新的单据。")
                    .addCloseButton("好的","CHECK", null)
                    .createAndShow();
        }

    }


}
