package trapx00.lightx00.client.presentation.commodityui;

import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.presentation.mainui.InventoryStaffUiController;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.shared.po.inventorystaff.CommodityItem;
import trapx00.lightx00.shared.util.DateHelper;


import java.util.ArrayList;
import java.util.Date;

public class CommodityUiController implements ExternalLoadableUiController {


    public JFXButton selectAllButton;
    public JFXButton deleteButton;
    public JFXTreeTableView<CommodityItemModel> commodityTable;
    public JFXTreeTableColumn<CommodityItemModel, String> tableNameColumn;
    public JFXTreeTableColumn<CommodityItemModel, String> tableSortColumn;
    public JFXTreeTableColumn<CommodityItemModel, String> tableAmountColumn;
    public JFXTreeTableColumn<CommodityItemModel, String> tableIdColumn;
    public JFXTreeTableColumn<CommodityItemModel, String> tableDateColumn;
    public JFXButton addCommodityButton;
    public Label lbResult;

    private InventoryStaffUiController inventoryStaffUiController;

    public ObservableList<CommodityItemModel> commodityModels = FXCollections.observableArrayList();



    public void initialize() {
        initCommodityItem();
        updateItems();
    }

    public void updateItems() {
        CommodityVo commoditVo=new CommodityVo("123","SmallLed","Led",34
        ,new Date(),"No.1","No.2",43,53,44,
        45,45);
        commodityModels.clear();
        commodityModels.add(new CommodityItemModel(commoditVo));
        commodityModels.add(new CommodityItemModel(commoditVo));
        commodityModels.add(new CommodityItemModel(commoditVo));
        commodityModels.add(new CommodityItemModel(commoditVo));

    }

    public void initCommodityItem() {
        tableDateColumn.setCellValueFactory(cellData -> new SimpleStringProperty(DateHelper.fromDate(cellData.getValue().getValue().getProductionDate())));
        tableNameColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getName()));
        tableIdColumn.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getValue().getId())));
        tableAmountColumn.setCellValueFactory(cellData->new SimpleStringProperty(String.valueOf(cellData.getValue().getValue().getAmount())));

        TreeItem<CommodityItemModel> root = new RecursiveTreeItem<>(commodityModels, RecursiveTreeObject::getChildren);
        commodityTable.setRoot(root);
        commodityTable.setShowRoot(false);
    }


    public void onRefreshButtonClicked(ActionEvent actionEvent) {
        updateItems();
    }

    public void onDeleteButtonClicked(ActionEvent actionEvent) {
        int index = commodityTable.getSelectionModel().getFocusedIndex();
        CommodityItemModel model = commodityTable.getRoot().getChildren().get(index).getValue();
        JFXDialog dialog = PromptDialogHelper.start("确定要删除这个商品吗？","你选择了商品" + model.getId())
                .addTable(ReadOnlyPairTableHelper.start()
                        .addPair("ID", String.valueOf(model.getId()))
                        .addPair("名称", model.getName())
                        .addPair("时间", DateHelper.fromDate(model.getProductionDate()))
                        .create())
                .addCloseButton("确定", "CHECK",e -> deleteItem(index))
                .addCloseButton("取消", "CLOSE", null)
                .create(inventoryStaffUiController.dialogContainer);
        dialog.show();
    }

    public void deleteItem(int index) {
        commodityModels.remove(index);
    }

    public void onAddButtonClicked(ActionEvent actionEvent){
        updateItems();
    }

    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/inventoryui/CommodityUi.fxml").loadAndGetPackageWithoutException();
    }

    public void onBtnSelectClicked(ActionEvent actionEvent) {
        /**
         * 这里是new的，应该提供工厂。工厂应该直接new一个回来。
         */
        new CommoditySelectingDialog().showSelectLogDialog(new ArrayList<>(), list -> {
            /**
             * 这个函数就是如何处理选择结束后的数据。参数list就是用户选择的内容。
             * 如果用户按了取消，就不会调用
             */
            StringBuilder result = new StringBuilder("你选择了ID是");
            list.forEach(x -> result.append(x.getId()).append("、"));

            lbResult.setText(result.append("的商品").toString());
        });
    }


}
