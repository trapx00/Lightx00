package trapx00.lightx00.client.presentation.helpui;

import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import com.sun.istack.internal.NotNull;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.Region;
import trapx00.lightx00.client.vo.log.LogVo;
import trapx00.lightx00.shared.po.log.LogSeverity;
import trapx00.lightx00.shared.util.DateHelper;

import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 *  弹出框示例。一定要继承SelectingDialog
 */
public class SampleSelectingDialog extends SelectingDialog {
    @FXML private JFXTreeTableView<LogSelectionItemModel> logTable;
    @FXML private JFXTreeTableColumn<LogSelectionItemModel, String> logDateColumn;
    @FXML private JFXTreeTableColumn<LogSelectionItemModel, String> logSeverityColumn;
    @FXML private JFXTreeTableColumn<LogSelectionItemModel, String> logContentColumn;
    @FXML private JFXButton btnSelect;
    @FXML private JFXButton btnClose;
    private Consumer<List<LogVo>> callback;

    private ObservableList<LogSelectionItemModel> logTableItemModels = FXCollections.observableArrayList();
    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/helpui/SampleSelectingDialog.fxml").loadAndGetPackageWithoutException();
    }

    @FXML
    private void initialize() {
        initLogItem();

        logTableItemModels.add(new LogSelectionItemModel(new LogVo(1, new Date(), LogSeverity.Success, "1")));
        logTableItemModels.add(new LogSelectionItemModel(new LogVo(2, new Date(), LogSeverity.Failure, "2")));

    }



    @FXML
    private void initLogItem() {
        logDateColumn.setCellValueFactory(cellData -> new SimpleStringProperty(DateHelper.fromDate(cellData.getValue().getValue().getLogVoObjectProperty().getDate())));
        logSeverityColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getLogVoObjectProperty().getSeverity().toString()));
        logContentColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getLogVoObjectProperty().getContent()));
        TreeItem<LogSelectionItemModel> root = new RecursiveTreeItem<>(logTableItemModels, RecursiveTreeObject::getChildren);
        logTable.setRoot(root);
        logTable.setShowRoot(false);
        logTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); //支持多选，没有这句话就是不支持
    }

    /**
     * 获得当前已经选择的日志。如果没有选择的，那么这个是空List（不是null！！！）
     * @return 当前已经选择的项
     */
    private List<LogVo> getSelected() {
        return logTable.getSelectionModel().getSelectedItems().stream()
            .map(x -> x.getValue().getLogVoObjectProperty())
            .collect(Collectors.toList());
    }

    /**
     * 设置目前选择的。用于刚开始的时候初始化已经选择的项。
     * @param selected 已经选择的项
     */
    private void setSelected(@NotNull List<LogVo> selected) {
        List<Integer> ids = selected.stream().map(LogVo::getId).collect(Collectors.toList());
        for (int i = 0; i < logTable.getCurrentItemsCount(); i++) {
            if (ids.contains(logTable.getTreeItem(i).getValue().getLogVoObjectProperty().getId())) {
                logTable.getSelectionModel().select(i);
            }
        }
    }


    /**
     * 重点方法。也是外界调用的方法。
     * @param defaultSelection 默认选中的方法
     * @param callback 选择结束后的回调函数。如果用户点了取消按钮，那么直接退出，不会触发回调函数。
     *                 用法参见……
     *
     */
    public void showSelectLogDialog(@NotNull List<LogVo> defaultSelection, Consumer<List<LogVo>> callback) {
        ExternalLoadedUiPackage uiPackage = load();
        SampleSelectingDialog controller = (SampleSelectingDialog) uiPackage.getController();
        controller.setSelected(defaultSelection);
        controller.callback = callback;
        JFXDialog dialog = PromptDialogHelper.start("","").create();
        dialog.setContent((Region) uiPackage.getComponent());
        FrameworkUiManager.getCurrentDialogStack().pushAndShow(dialog);
    }

    @FXML
    private void onBtnSelectClicked(ActionEvent actionEvent) {
        if (callback != null) {
            callback.accept(getSelected()); //选择结束，调用回调方法。
        }
        onClose(); //一定要调用这个来把弹出框关了。
    }

    @FXML
    private void onBtnCloseClicked(ActionEvent actionEvent) {
        onClose();
    }
}
