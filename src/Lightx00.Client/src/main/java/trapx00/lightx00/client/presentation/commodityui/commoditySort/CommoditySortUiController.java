package trapx00.lightx00.client.presentation.commodityui.commoditySort;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
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


    private CommoditySortBlService blService= CommoditySortBlServiceFactory.getInstance();

    @FXML
    private void initialize() {
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
       // CommodityVo[] queryResult = blService.query(queryVo);
      //  commodityModels.clear();
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
}
