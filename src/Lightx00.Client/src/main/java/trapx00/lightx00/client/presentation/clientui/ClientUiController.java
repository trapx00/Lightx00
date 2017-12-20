package trapx00.lightx00.client.presentation.clientui;

import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import com.sun.istack.internal.NotNull;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.layout.Region;
import trapx00.lightx00.client.blservice.clientblservice.ClientBlService;
import trapx00.lightx00.client.blservice.clientblservice.ClientBlServiceFactory;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.client.vo.log.LogVo;
import trapx00.lightx00.client.vo.salestaff.ClientVo;
import trapx00.lightx00.client.vo.salestaff.SaleStaffVo;
import trapx00.lightx00.shared.po.client.ClientType;
import trapx00.lightx00.shared.po.log.LogSeverity;
import trapx00.lightx00.shared.util.DateHelper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ClientUiController implements ClientInfoUi, ExternalLoadableUiController {

    @FXML
    private TreeTableView<ClientSelectionItemModel> clientTable;
    @FXML
    private TreeTableColumn<ClientSelectionItemModel, String> clientIdColumn;
    @FXML
    private TreeTableColumn<ClientSelectionItemModel, String> clientNameColumn;
    @FXML
    private TreeTableColumn<ClientSelectionItemModel, String> clientTypeColumn;
    @FXML
    private TreeTableColumn<ClientSelectionItemModel, String> clientLevelColumn;
    @FXML
    private TreeTableColumn<ClientSelectionItemModel, String> clientPhoneColumn;

    private ObservableList<ClientSelectionItemModel> clientSelectionItemModels = FXCollections.observableArrayList();

    private ClientBlService blService= ClientBlServiceFactory.getInstance();

    /**
     * show the select client dialog
     *
     * @param callback call back function
     */
    public void showClientSelectDialog(Consumer<ClientVo> callback) {
        ExternalLoadedUiPackage uiPackage = load();
        ClientUiController controller = (ClientUiController) uiPackage.getController();
        JFXDialog dialog = PromptDialogHelper.start("", "").create();
        dialog.setContent((Region) uiPackage.getComponent());
        dialog.show();
    }

    @FXML
    private void initialize() {
        initLogItem();

        clientSelectionItemModels.add(new ClientSelectionItemModel(new ClientVo("0",
                ClientType.Retailer,
                1,
                "xiaoming",
                "12345678",
                "12345678",
                "210000",
                "12345679@qq.com",
                123,
                456,
                789,
                "1")));
    }

    private void initLogItem() {
        clientIdColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getClientVoObjectProperty().getId()));
        clientNameColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getClientVoObjectProperty().getName()));
        clientTypeColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getClientVoObjectProperty().getClientType().toString()));
        clientLevelColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getClientVoObjectProperty().getClientLevel() + ""));
        clientPhoneColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getClientVoObjectProperty().getPhone()));
        TreeItem<ClientSelectionItemModel> root = new RecursiveTreeItem<>(clientSelectionItemModels, RecursiveTreeObject::getChildren);
        clientTable.setRoot(root);
        clientTable.setShowRoot(false);
    }

    /**
     * 获得当前已经选择的日志。如果没有选择的，那么这个是空List（不是null！！！）
     *
     * @return 当前已经选择的项
     */
    private List<ClientVo> getSelected() {
        return clientTable.getSelectionModel().getSelectedItems().stream()
                .map(x -> x.getValue().getClientVoObjectProperty())
                .collect(Collectors.toList());
    }

    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/clientui/ClientUi.fxml").loadAndGetPackageWithoutException();
    }

    @FXML
    private void onBtnAddClicked(ActionEvent actionEvent) {

    }

    @FXML
    private void onBtnModifyClicked(ActionEvent actionEvent) {

    }

    @FXML
    private void onBtnDeleteClicked(ActionEvent actionEvent) {

    }

    @FXML
    private void onBtnSelectClicked(ActionEvent actionEvent) {

    }

    @FXML
    private void onBtnCloseClicked(ActionEvent actionEvent) {
        FrameworkUiManager.switchBackToHome();
    }

    /**
     * query the whole clientvo by id
     *
     * @param id
     * @return the whole clientvo
     */
    @Override
    public ClientVo queryById(String id) {
        return blService.queryById(id);
    }
}
