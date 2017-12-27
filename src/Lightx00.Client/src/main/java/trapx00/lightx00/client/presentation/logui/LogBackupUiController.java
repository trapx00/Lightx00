package trapx00.lightx00.client.presentation.logui;

import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import trapx00.lightx00.client.blservice.logblservice.LogBackupBlService;
import trapx00.lightx00.client.blservice.logblservice.LogBackupBlServiceFactory;
import trapx00.lightx00.client.blservice.logblservice.LogBlService;
import trapx00.lightx00.client.blservice.logblservice.LogBlServiceFactory;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadableUiController;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadedUiPackage;
import trapx00.lightx00.client.presentation.helpui.PromptDialogHelper;
import trapx00.lightx00.client.presentation.helpui.UiLoader;
import trapx00.lightx00.client.vo.log.LogVo;
import trapx00.lightx00.shared.queryvo.LogBackupVo;
import trapx00.lightx00.shared.queryvo.LogQueryVo;
import trapx00.lightx00.shared.util.DateHelper;

public class LogBackupUiController implements ExternalLoadableUiController {

    public JFXTreeTableView<LogBackupTableItemModel> logBackupTable;
    public JFXTreeTableColumn<LogBackupTableItemModel, String> logDateColumn;
    public JFXTreeTableColumn<LogBackupTableItemModel, String> logContentColumn;
    private ObservableList<LogBackupTableItemModel> logBackupTableItemModels = FXCollections.observableArrayList();
    private LogBackupBlService logBackupBlService = LogBackupBlServiceFactory.getInstance();

    public void initLogItem() {
        logDateColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getLogBackupVo().getDate()));
        logContentColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getLogBackupVo().getUrl()));
        TreeItem<LogBackupTableItemModel> root = new RecursiveTreeItem<>(logBackupTableItemModels, RecursiveTreeObject::getChildren);
        logBackupTable.setRoot(root);
        logBackupTable.setShowRoot(false);
    }

    public void updateItems() {
        LogBackupVo[] logBackupVos = logBackupBlService.fetchCloudLog();
        System.out.println("run here");
        if (logBackupVos != null) {
            for (LogBackupVo logBackupVo : logBackupVos) {
                logBackupTableItemModels.add(new LogBackupTableItemModel(logBackupVo));
            }
        }
    }

    public void initialize() {
        initLogItem();
        updateItems();
    }


    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/logui/LogBackupUi.fxml").loadAndGetPackageWithoutException();
    }
}
