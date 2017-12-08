package trapx00.lightx00.client.presentation.inventoryui;

import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.presentation.logui.LogTableItemModel;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.client.vo.Reversible;
import trapx00.lightx00.client.vo.inventorystaff.InventoryGiftVo;
import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;
import trapx00.lightx00.shared.util.DateHelper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class InventoryGiftUiController implements DraftContinueWritableUiController, ExternalLoadableUiController,ReversibleUi {

    public JFXTextField tfBillState;
    public JFXTextField tfOperator;
    public JFXTextField tfDate;
    public JFXTextField tfId;
    public JFXButton cButton;
    public JFXTreeTableView<InventoryGiftItemModel> inventoryGiftItems;
    public JFXTreeTableColumn<InventoryGiftItemModel, String> tcName;
    public JFXTreeTableColumn<InventoryGiftItemModel, String> tcPrice;
    public JFXTreeTableColumn<InventoryGiftItemModel, String> tcAmount;
    public Label lbResult;

    private ObservableList<InventoryGiftItemModel> inventoryGiftItemModelObservableList = FXCollections.observableArrayList();

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
        inventoryGiftUiController.tfBillState.setText(inventoryGiftVo.getState().toString());
        inventoryGiftUiController.tfOperator.setText(inventoryGiftVo.getOperatorId());
        inventoryGiftUiController.addGiftItems(inventoryGiftVo.getGifts());
        return externalLoadedUiPackage;
    }

    public void initItem() {
        tcName.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getPromotionCommodityObjectProperty().getCommodityId()));
        tcAmount.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getValue().getPromotionCommodityObjectProperty().getAmount())));
        tcPrice.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getValue().getPromotionCommodityObjectProperty().getUnitPrice())));
        TreeItem<InventoryGiftItemModel> root = new RecursiveTreeItem<>(inventoryGiftItemModelObservableList, RecursiveTreeObject::getChildren);
        inventoryGiftItems.setRoot(root);
        inventoryGiftItems.setShowRoot(false);
    }

    public void updateItems() {
        PromotionCommodity promotionCommodity=new PromotionCommodity();
        promotionCommodity.setCommodityId("12");
        promotionCommodity.setAmount(123);
        promotionCommodity.setUnitPrice(150);
        inventoryGiftItemModelObservableList.clear();
        inventoryGiftItemModelObservableList.add(new InventoryGiftItemModel(promotionCommodity));
    }

    public void initialize() {
        initItem();
        updateItems();
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

    public void onBtnSelectClicked(ActionEvent actionEvent) {
        /**
         * 这里是new的，应该提供工厂。工厂应该直接new一个回来。
         */
        new SelectingGift().showSelectLogDialog(new ArrayList<>(), list -> {
            /**
             * 这个函数就是如何处理选择结束后的数据。参数list就是用户选择的内容。
             * 如果用户按了取消，就不会调用
             */
            StringBuilder result = new StringBuilder("你选择了ID是");
            list.forEach(x -> result.append(x.getId()).append("、"));

            lbResult.setText(result.append("的赠送单").toString());
        });
    }

    @Override
    public ExternalLoadedUiPackage revertReversible(Reversible reversible) {
        return null;
    }
}
