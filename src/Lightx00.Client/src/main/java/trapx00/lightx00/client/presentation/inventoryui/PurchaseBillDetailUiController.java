package trapx00.lightx00.client.presentation.inventoryui;

import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TreeItem;
import trapx00.lightx00.client.presentation.clientui.ClientInfoUi;
import trapx00.lightx00.client.presentation.clientui.ClientSelectionItemModel;
import trapx00.lightx00.client.presentation.clientui.factory.ClientInfoUiFactory;
import trapx00.lightx00.client.presentation.financeui.cashbill.CashBillItemModel;
import trapx00.lightx00.client.presentation.helpui.BillDetailUi;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadedUiPackage;
import trapx00.lightx00.client.presentation.helpui.UiLoader;
import trapx00.lightx00.client.vo.BillVo;

public class PurchaseBillDetailUiController extends BillDetailUi {
    @FXML
    private JFXTextField tfBillId;
    @FXML
    private JFXTextField tfOperatorId;
    @FXML
    private JFXTextField tfClientId;
    @FXML
    private JFXTextField tfRepository;
    @FXML
    private JFXTextField tfBillTotal;
    @FXML
    private JFXTextField tfComment;
    @FXML
    private JFXTreeTableView<CommodityItemModel> tbCommodityList;
    @FXML
    private JFXTreeTableColumn<CommodityItemModel, String> tcCommodityIdColumn;
    @FXML
    private JFXTreeTableColumn<CommodityItemModel, String> tcCommodityNameColumn;
    @FXML
    private JFXTreeTableColumn<CommodityItemModel, String> tcCommodityTypeColumn;
    @FXML
    private JFXTreeTableColumn<CommodityItemModel, String> tcCommodityNumberColumn;
    @FXML
    private JFXTreeTableColumn<CommodityItemModel, String> tcCommodityPriceColumn;
    @FXML
    private JFXTreeTableColumn<CommodityItemModel, String> tcCommodityTotalColumn;
    @FXML
    private JFXTreeTableColumn<CommodityItemModel, String> tcCommodityCommentColumn;

    private ObservableList<CommodityItemModel> commodityItemModelObservableList = FXCollections.observableArrayList();
    private ClientInfoUi clientInfoUi = ClientInfoUiFactory.getClientInfoUi();
    @Override
    public ExternalLoadedUiPackage showContent(BillVo arg) {
        return null;
    }

    public void initialize() {
        tcCommodityIdColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getCommodityItemObjectProperty().getCommodityId()));
        tcCommodityNameColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getCommodityItemObjectProperty().getName()));
        tcCommodityTypeColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getCommodityItemObjectProperty().getType()));
        tcCommodityNumberColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getCommodityItemObjectProperty().getNumber()+""));
        tcCommodityPriceColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getCommodityItemObjectProperty().getPrice()+""));
        tcCommodityTotalColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getCommodityItemObjectProperty().getTotal()+""));
        tcCommodityCommentColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getCommodityItemObjectProperty().getComment()));
        TreeItem<CommodityItemModel> root = new RecursiveTreeItem<>(commodityItemModelObservableList, RecursiveTreeObject::getChildren);
        tbCommodityList.setRoot(root);
        tbCommodityList.setShowRoot(false);

    }

    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/inventoryui/PurchaseBillDetailUi.fxml").loadAndGetPackageWithoutException();
    }
}
