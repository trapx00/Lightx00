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
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.layout.Region;
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

public class ClientUiController extends SelectingDialog implements DraftContinueWritableUiController, ClientInfoUi, ExternalLoadableUiController {

    @FXML
    private TreeTableView<ClientSelectionItemModel> clientTable;
    @FXML
    private TreeTableColumn<ClientSelectionItemModel,String> clientIdColumn;
    @FXML
    private TreeTableColumn<ClientSelectionItemModel,String> clientNameColumn;
    @FXML
    private TreeTableColumn<ClientSelectionItemModel,String> clientTypeColumn;
    @FXML
    private TreeTableColumn<ClientSelectionItemModel,String> clientLevelColumn;
    @FXML
    private TreeTableColumn<ClientSelectionItemModel,String> clientPhoneColumn;
    private Consumer<ClientVo> callback;

    private ObservableList<ClientSelectionItemModel> clientSelectionItemModels= FXCollections.observableArrayList();
    /**
     * show the select client dialog
     *
     * @param callback call back function
     */
    public void showClientSelectDialog(Consumer<ClientVo> callback) {
        ExternalLoadedUiPackage uiPackage = load();
        ClientUiController controller = (ClientUiController) uiPackage.getController();
        controller.callback = callback;
        JFXDialog dialog = PromptDialogHelper.start("","").create();
        dialog.setContent((Region) uiPackage.getComponent());
        FrameworkUiManager.getCurrentDialogStack().pushAndShow(dialog);
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
                new SaleStaffVo(null,null,null,null,null,null))));
    }

    @FXML
    private void initLogItem() {
        clientIdColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getClientVoObjectProperty().getId()));
        clientNameColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getClientVoObjectProperty().getName()));
        clientTypeColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getClientVoObjectProperty().getClientType().toString()));
        clientLevelColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getClientVoObjectProperty().getClientLevel()+""));
        clientPhoneColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getClientVoObjectProperty().getPhone()));
        TreeItem<ClientSelectionItemModel> root = new RecursiveTreeItem<>(clientSelectionItemModels, RecursiveTreeObject::getChildren);
        clientTable.setRoot(root);
        clientTable.setShowRoot(false);
    }

    /**
     * Start continuing write a draft. Returns a ExternalLoadableUiController. It can be used to set the stage without casting to specific ui controller.
     * Overrides to return a specific ui controller.
     *
     * @param draft draft
     * @return a ExternalLoadableUiController
     */
    @Override
    public ExternalLoadedUiPackage continueWriting(Draftable draft) {
        return null;
    }

    /**
     * 获得当前已经选择的日志。如果没有选择的，那么这个是空List（不是null！！！）
     * @return 当前已经选择的项
     */
    private List<ClientVo> getSelected() {
        return clientTable.getSelectionModel().getSelectedItems().stream()
                .map(x -> x.getValue().getClientVoObjectProperty())
                .collect(Collectors.toList());
    }

    /**
     * 设置目前选择的。用于刚开始的时候初始化已经选择的项。
     * @param selected 已经选择的项
     */
    private void setSelected(@NotNull List<ClientVo> selected) {
        List<String> ids = selected.stream().map(ClientVo::getId).collect(Collectors.toList());
        clientTable.getSelectionModel().select(Integer.parseInt(ids.get(0)));
    }

    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return null;
    }

    @FXML
    private void onBtnSelectClicked(ActionEvent actionEvent) {
        if (callback != null) {
            callback.accept(getSelected().get(0)); //选择结束，调用回调方法。
        }
        onClose(); //一定要调用这个来把弹出框关了。
    }

    @FXML
    private void onBtnCloseClicked(ActionEvent actionEvent) {
        onClose();
    }

    /**
     * query the whole clientvo by id
     *
     * @param id
     * @return the whole clientvo
     */
    @Override
    public ClientVo queryById(String id) {
        return null;
    }
}
