package trapx00.lightx00.client.presentation.inventoryui.check;

import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import trapx00.lightx00.client.blservice.inventoryblservice.InventoryCheckBlService;
import trapx00.lightx00.client.blservice.inventoryblservice.InventoryCheckBlServiceFactory;
import trapx00.lightx00.client.presentation.bankaccountui.BankAccountModel;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadableUiController;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadedUiPackage;
import trapx00.lightx00.client.presentation.helpui.UiLoader;
import trapx00.lightx00.client.vo.inventorystaff.InventoryViewItem;
import trapx00.lightx00.shared.util.DateHelper;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class InventoryPictureUiController implements ExternalLoadableUiController {

    @FXML private JFXButton btnFilter;
    @FXML private JFXTreeTableView<InventoryPictureModel> tableView;
    @FXML private JFXTreeTableColumn<InventoryPictureModel, String> tcId;
    @FXML private JFXTreeTableColumn<InventoryPictureModel, String> tcName;
    @FXML private JFXTreeTableColumn<InventoryPictureModel, String> tcType;
    @FXML private JFXTreeTableColumn<InventoryPictureModel, Double> tcAmount;
    @FXML private JFXTreeTableColumn<InventoryPictureModel, Double> tcPrice;
    @FXML private JFXTreeTableColumn<InventoryPictureModel, String> tcBatch;
    @FXML private JFXTreeTableColumn<InventoryPictureModel, String> tcBatchNo;
    @FXML private JFXTreeTableColumn<InventoryPictureModel, String> tcProductionTime;

    private ObservableList<InventoryPictureModel> viewModels = FXCollections.observableArrayList();
     private InventoryCheckBlService blService= InventoryCheckBlServiceFactory.getInstance();

    public void onBtnFilterClicked(ActionEvent actionEvent) {
        updateItems();
    }

    public void onBtnExportClicked(ActionEvent actionEvent){
        updateItems();
    }

    public void initialize() {
        initTable();
        updateItems();
    }
    public void updateItems() {
        viewModels.clear();

        viewModels.addAll(Arrays.stream(blService.getInventoryPicture().getItems()).map(InventoryPictureModel::new).collect(Collectors.toList()));
    }

    @FXML
    private void initTable() {
        tcId.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getInventoryPictureModel().getId()));
        tcName.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getInventoryPictureModel().getName()));
        tcType.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getInventoryPictureModel().getType()));
        tcAmount.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getValue().getInventoryPictureModel().getAmount()));
        tcPrice.setCellValueFactory(cellData->new SimpleObjectProperty<>(cellData.getValue().getValue().getInventoryPictureModel().getPrice()));
        tcBatch.setCellValueFactory(cellData->new SimpleStringProperty(cellData.getValue().getValue().getInventoryPictureModel().getBatch()));
        tcBatchNo.setCellValueFactory(cellData->new SimpleStringProperty(cellData.getValue().getValue().getInventoryPictureModel().getBatchNo()));
        tcProductionTime.setCellValueFactory(cellData -> new SimpleStringProperty(DateHelper.fromDate(cellData.getValue().getValue().getInventoryPictureModel().getDate())));

        TreeItem<InventoryPictureModel> root = new RecursiveTreeItem<>(viewModels, RecursiveTreeObject::getChildren);
        tableView.setRoot(root);
        tableView.setShowRoot(false);
        tableView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/inventoryui/check/InventoryPictureUi.fxml").loadAndGetPackageWithoutException();
    }
}
