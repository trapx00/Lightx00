package trapx00.lightx00.client.presentation.commodityui;

import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import javafx.scene.input.KeyCode;
import trapx00.lightx00.client.blservice.commodityblservice.CommodityBlService;
import trapx00.lightx00.client.blservice.commodityblservice.CommodityBlServiceFactory;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.presentation.mainui.InventoryStaffUiController;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.shared.queryvo.CommodityQueryVo;
import trapx00.lightx00.shared.util.DateHelper;


import java.util.Arrays;
import java.util.stream.Collectors;

public class CommodityUiController implements ExternalLoadableUiController {


    public JFXButton selectAllButton;
    public JFXButton deleteButton;
    public JFXTreeTableView<CommoditySelectionItemModel> commodityTable;
    public JFXTreeTableColumn<CommoditySelectionItemModel, String> tableNameColumn;
    public JFXTreeTableColumn<CommoditySelectionItemModel, String> tableSortColumn;
    public JFXTreeTableColumn<CommoditySelectionItemModel, String> tableAmountColumn;
    public JFXTreeTableColumn<CommoditySelectionItemModel, String> tableIdColumn;
    public JFXTreeTableColumn<CommoditySelectionItemModel, String> tableDateColumn;
    public JFXButton addCommodityButton;
    @FXML
    private JFXTextField tfSearch;

    private InventoryStaffUiController inventoryStaffUiController;

    public ObservableList<CommoditySelectionItemModel> commodityModels = FXCollections.observableArrayList();
    private CommodityBlService blService= CommodityBlServiceFactory.getInstance();



    @FXML
    private void initialize() {
        initTable();
        initSearch();
        update();

    }
    private void initSearch() {
        tfSearch.setOnKeyPressed(e -> {
            if (e.getCode().equals(KeyCode.ENTER)) {
                if (tfSearch.getText().length() > 0) {
                    update(new CommodityQueryVo().eq("id", tfSearch.getText()));
                } else {
                    update();
                }

            }
        });
    }

    private void update() {
        update(new CommodityQueryVo());
    }

    private void update(CommodityQueryVo queryVo) {
        CommodityVo[] queryResult = blService.query(queryVo);
        commodityModels.clear();
        commodityModels.addAll(Arrays.stream(queryResult).map(CommoditySelectionItemModel::new).collect(Collectors.toList()));
    }


    @FXML
    private void initTable() {
        tableDateColumn.setCellValueFactory(cellData -> new SimpleStringProperty(DateHelper.fromDate(cellData.getValue().getValue().getCommodityVoObjectProperty().getProductionDate())));
        tableNameColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getCommodityVoObjectProperty().getName()));
        tableIdColumn.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getValue().getCommodityVoObjectProperty().getId())));
        tableAmountColumn.setCellValueFactory(cellData->new SimpleStringProperty(String.valueOf(cellData.getValue().getValue().getCommodityVoObjectProperty().getAmount())));

        TreeItem<CommoditySelectionItemModel> root = new RecursiveTreeItem<>(commodityModels, RecursiveTreeObject::getChildren);
        commodityTable.setRoot(root);
        commodityTable.setShowRoot(false);
        commodityTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); //支持多选，没有这句话就是不支持
    }



    public void onRefreshButtonClicked(ActionEvent actionEvent) {
        update();
    }

    public void onDeleteButtonClicked(ActionEvent actionEvent) {
        int index = commodityTable.getSelectionModel().getFocusedIndex();
        CommoditySelectionItemModel model = commodityTable.getRoot().getChildren().get(index).getValue();
        JFXDialog dialog = PromptDialogHelper.start("确定要删除这个商品吗？","你选择了商品" + model.getCommodityVoObjectProperty().getId())
                .addTable(ReadOnlyPairTableHelper.start()
                        .addPair("ID", String.valueOf(model.getCommodityVoObjectProperty().getId()))
                        .addPair("名称", model.getCommodityVoObjectProperty().getName())
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
        new AddCommodityDialog().show(item -> {
            commodityModels.add(new CommoditySelectionItemModel(item));
        });

    }

    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/inventoryui/commodity/CommodityUi.fxml").loadAndGetPackageWithoutException();
    }



}
