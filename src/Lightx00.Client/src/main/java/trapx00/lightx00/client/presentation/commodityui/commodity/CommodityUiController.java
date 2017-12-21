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
import trapx00.lightx00.client.blservice.commodityblservice.CommoditySortBlService;
import trapx00.lightx00.client.blservice.commodityblservice.CommoditySortBlServiceFactory;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.presentation.mainui.InventoryStaffUiController;
import trapx00.lightx00.client.vo.inventorystaff.CommoditySortVo;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.shared.exception.bl.UncheckedRemoteException;
import trapx00.lightx00.shared.queryvo.CommodityQueryVo;
import trapx00.lightx00.shared.queryvo.CommoditySortQueryVo;
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
    TreeItem<String> root;
    private InventoryStaffUiController inventoryStaffUiController;
    private  String currentSortId;

    public ObservableList<CommoditySelectionItemModel> commodityModels = FXCollections.observableArrayList();
    private CommodityBlService blService= CommodityBlServiceFactory.getInstance();
    private CommoditySortBlService blService1= CommoditySortBlServiceFactory.getInstance();



    @FXML
    private void initialize() {
        initTable();
        initView();
        initSearch();
    }

    private void initView(){
        root = new TreeItem<>("CommoditySort");
        root.setExpanded(true);
        tv.setRoot(root);
        tv.setShowRoot(false);
        showGoodsTree();
        tv.setOnMouseClicked(event -> {
            if (event.getClickCount() == 1) {
                currentSortId = blService1.query(new CommoditySortQueryVo().eq("name",
                        tv.getSelectionModel().getSelectedItem().getValue()))[0].getId();
                update(new CommodityQueryVo().eq("type", currentSortId
                       ));

            }
        });

    }
    public void showGoodsTree(){
        try{
            CommoditySortVo[] commoditySortVos = blService1.query(new CommoditySortQueryVo());
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
            CommoditySortVo commoditySortVo =blService1.query(new CommoditySortQueryVo().eq("name",treeItem.getValue()))[0];
            CommoditySortVo[] commoditySortVos=blService1.query(new CommoditySortQueryVo().eq("preId",commoditySortVo.getId()));
            if(commoditySortVos != null) {
                for (CommoditySortVo commoditySortVo1:commoditySortVos) {
                    TreeItem<String> treeItem1 = new TreeItem<>(commoditySortVo1.getName());
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
                    update(new CommodityQueryVo().eq("id", tfSearch.getText()));
                } else {
                    update();
                }

            }
        });
    }

    private void update() {
        update(new CommodityQueryVo().eq("type",currentSortId));
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
        tableSortColumn.setCellValueFactory(cellData->new SimpleStringProperty(cellData.getValue().getValue().getCommodityVoObjectProperty().getType()));
        commodityTable.setOnMouseClicked(event -> {
            if (event.getClickCount() == 2) {
               new CommodityDetailUi().show(getSelected(),this::update);
            }
        });

        TreeItem<CommoditySelectionItemModel> root = new RecursiveTreeItem<>(commodityModels, RecursiveTreeObject::getChildren);
        commodityTable.setRoot(root);
        commodityTable.setShowRoot(false);
        commodityTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); //支持多选，没有这句话就是不支持

    }




    public void onDeleteButtonClicked(ActionEvent actionEvent) {
        CommodityVo selected=getSelected();
        if (selected != null) {
            new PromptDialogHelper("确定删除",
                    String.format("您确定要删除商品(id: %s, 名称: %s)吗？", selected.getId(), selected.getName()))
                    .addCloseButton("取消","CLOSE",null)
                    .addButton("确定","CHECK",e -> {
                        blService.delete(selected);
                        new PromptDialogHelper("删除成功",String.format("商品(id: %s)已经删除！", selected.getId()))
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
        if(blService1.query(new CommoditySortQueryVo().idEq(currentSortId))[0].getLeaf()==1){
            new AddCommodityDialog().show(currentSortId,this::update);
        }
        else{
            PromptDialogHelper.start("添加失败","当前分类不是叶节点分类无法添加商品").addCloseButton("确定","CHECK",null)
                    .createAndShow();
        }

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
            new CommodityModificationUi().show(selected, this::update);
        }
    }


}
