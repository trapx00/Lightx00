package trapx00.lightx00.client.presentation.commodityui.commoditySort;

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
import trapx00.lightx00.client.blservice.commodityblservice.CommoditySortBlService;
import trapx00.lightx00.client.blservice.commodityblservice.CommoditySortBlServiceFactory;
import trapx00.lightx00.client.presentation.commodityui.commodity.AddCommodityDialog;
import trapx00.lightx00.client.presentation.commodityui.commodity.CommoditySelectionItemModel;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.vo.inventorystaff.CommoditySortVo;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.shared.exception.bl.UncheckedRemoteException;
import trapx00.lightx00.shared.po.inventorystaff.CommoditySortItem;
import trapx00.lightx00.shared.queryvo.CommodityQueryVo;
import trapx00.lightx00.shared.queryvo.CommoditySortQueryVo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CommoditySortUiController  implements ExternalLoadableUiController {
    public JFXButton selectAllButton;
    public JFXButton deleteButton;
    public TreeView<String> tv;
    public JFXButton addCommodityButton;
    public JFXTextField tfSearch;
    public JFXTextField tfOperator;
    public JFXTextField tfDate;
    public JFXTextField tfId;
    public JFXTreeTableView<CommoditySortModel> commodityTable;
    public JFXTreeTableColumn<CommoditySortModel, String> tableNameColumn;
    public ObservableList<CommoditySortModel> commodityModels = FXCollections.observableArrayList();


    TreeItem<String> root;
    private CommoditySortBlService blService= CommoditySortBlServiceFactory.getInstance();

    @FXML
    private void initialize() {
        initView();
        initSearch();
        initTable();
    }
    public void initTable(){
        tableNameColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getCommoditySortVoObjectProperty().getName()));

        TreeItem<CommoditySortModel> root1 = new RecursiveTreeItem<>(commodityModels, RecursiveTreeObject::getChildren);
        commodityTable.setRoot(root1);
        commodityTable.setShowRoot(false);
        commodityTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); //支持多选，没有这句话就是不支持

        update();
    }
    private void initView(){
        root = new TreeItem<>("CommoditySort");
        root.setExpanded(true);
        tv.setRoot(root);
        tv.setShowRoot(false);
        showGoodsTree();
    }

    public void showGoodsTree(){
        try{
            CommoditySortVo[] commoditySortVos = blService.getAllCommoditySort();
            CommoditySortVo t;
            for (CommoditySortVo goodskindsVO : commoditySortVos) {
                t = goodskindsVO;
                if (t.getPreId() == null) {
                    TreeItem<String> treeItem = new TreeItem<>(t.getName());
                    root.getChildren().add(treeItem);
                    treeItem.setExpanded(true);
                    showkinds(treeItem);
                }
            }
        }catch (UncheckedRemoteException e){

        }

    }
    private void showkinds(TreeItem<String> treeItem)  {
        try{
            CommoditySortVo commoditySortVo =blService.query(new CommoditySortQueryVo().eq("name",treeItem.getValue()))[0];
            CommoditySortItem[] temp;
            if(commoditySortVo.getCommoditySortItems() != null) {
                temp = commoditySortVo.getCommoditySortItems();
                for (CommoditySortItem aTemp : temp) {
                    TreeItem<String> treeItem1 = new TreeItem<>(aTemp.getName());
                    treeItem1.setExpanded(true);
                    treeItem.getChildren().add(treeItem1);
                    showkinds(treeItem1);
                }
            }
        }catch (UncheckedRemoteException e){

        }


    }

    private void initSearch() {
        tfSearch.setOnKeyPressed(e -> {
            if (e.getCode().equals(KeyCode.ENTER)) {
                if (tfSearch.getText().length() > 0) {
                    update(new CommoditySortQueryVo().eq("id", tfSearch.getText()));
                } else {
                    update();
                }

            }
        });
    }
    private void update() {
        update(new CommoditySortQueryVo());
    }

    private void update(CommoditySortQueryVo queryVo) {
      //  CommoditySortVo[] queryResult = blService.query(queryVo);
      // commodityModels.clear();
        //commodityModels.addAll(Arrays.stream(queryResult).map(CommoditySelectionItemModel::new).collect(Collectors.toList()));
    }



    public void onRefreshButtonClicked(ActionEvent actionEvent) {
        update();
    }

    public void onDeleteButtonClicked(ActionEvent actionEvent) {

    }
    public void onAddButtonClicked(ActionEvent actionEvent){

    }

    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/inventoryui/commodity/CommoditySortUi.fxml").loadAndGetPackageWithoutException();
    }

    public void onBtnModifyClicked(ActionEvent actionEvent) {
       ;
    }
}
