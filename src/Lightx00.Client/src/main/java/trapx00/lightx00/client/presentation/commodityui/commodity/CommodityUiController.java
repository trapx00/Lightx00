package trapx00.lightx00.client.presentation.commodityui.commodity;

import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
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
    public TreeView<String>tv;
    public JFXButton btnModify;
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
        initView();
        initSearch();
    }

    private void initView(){
        TreeItem<String> item = new TreeItem<>("Commodity");
        tv.setRoot(item);
        item.setExpanded(false);
        TreeItem<String> i1 = new TreeItem<>("LightSort1");
        TreeItem<String> i2 = new TreeItem<>("LightSort2");
        TreeItem<String> i3 = new TreeItem<>("Led");
        item.getChildren().addAll(i1,i2,i3);
        TreeItem<String> i4 = new TreeItem<>("荡寇风云");
        TreeItem<String> i5 = new TreeItem<>("变形金刚5");
        i1.setExpanded(false);
        i1.getChildren().addAll(i4,i5);
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

        commodityTable.setOnMouseClicked(event -> {
            if (event.getClickCount() == 2) {
               // CommodityVo selected = getSelected();

            }
        });

        TreeItem<CommoditySelectionItemModel> root = new RecursiveTreeItem<>(commodityModels, RecursiveTreeObject::getChildren);
        commodityTable.setRoot(root);
        commodityTable.setShowRoot(false);
        commodityTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); //支持多选，没有这句话就是不支持
    }



    public void onRefreshButtonClicked(ActionEvent actionEvent) {
        update();
    }

    public void onDeleteButtonClicked(ActionEvent actionEvent) {
        CommodityVo selected=getSelected();
        if (selected != null) {
            new PromptDialogHelper("确定删除",
                    String.format("您确定要删除商品(id: %d, 名称: %s)吗？", selected.getId(), selected.getName()))
                    .addCloseButton("取消","CLOSE",null)
                    .addButton("确定","CHECK",e -> {
                        blService.delete(selected);
                        new PromptDialogHelper("删除成功",String.format("商品(id: %d)已经删除！", selected.getId()))
                                .addCloseButton("好","CHECK", e2 -> {
                                    FrameworkUiManager.getCurrentDialogStack().closeCurrentAndPopAndShowNext();
                                    update();
                                })
                                .createAndShow();
                    })
                    .createAndShow();
        }
    }

    public void onAddButtonClicked(ActionEvent actionEvent){
        new AddCommodityDialog().show(this::update);

    }

    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/inventoryui/commodity/CommodityUi.fxml").loadAndGetPackageWithoutException();
    }

    public CommodityVo getSelected() {
        try {
            return commodityTable.getSelectionModel().getSelectedItem().getValue().getCommodityVoObjectProperty();
        } catch (Exception e) {
            new PromptDialogHelper("未选择！","请先选择一个商品！")
                    .addCloseButton("好","CHECK", null)
                    .createAndShow();
            return null;
        }

    }

    public void onBtnModifyClicked(ActionEvent actionEvent) {
        CommodityVo selected = getSelected();
        if (selected != null) {
         //   new CommodityModificationUi().show(selected, this::updateItems);
        }
    }


}
