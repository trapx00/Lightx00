package trapx00.lightx00.client.presentation.logui;

import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TreeItem;
import trapx00.lightx00.client.Client;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadableUiController;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadedUiPackage;
import trapx00.lightx00.client.presentation.helpui.UiLoader;
import trapx00.lightx00.client.presentation.mainui.FrameworkUiController;
import trapx00.lightx00.shared.po.log.LogSeverity;
import trapx00.lightx00.shared.util.DateHelper;
import trapx00.lightx00.client.vo.log.LogVo;

import java.io.IOException;
import java.util.Date;

public class LogUiController implements ExternalLoadableUiController {

    public JFXTreeTableView<LogTableItemModel> logTable;
    public JFXTreeTableColumn<LogTableItemModel, String> logDateColumn;
    public JFXTreeTableColumn<LogTableItemModel, String> logSeverityColumn;
    public JFXTreeTableColumn<LogTableItemModel, String> logContentColumn;
    private ObservableList<LogTableItemModel> logTableItemModels = FXCollections.observableArrayList();
    private FrameworkUiController frameworkController;

    public void initLogItem() {
        logDateColumn.setCellValueFactory(cellData -> new SimpleStringProperty(DateHelper.fromDate(cellData.getValue().getValue().getDate())));
        logSeverityColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getSeverity().toString()));
        logContentColumn.setCellValueFactory(cellData -> cellData.getValue().getValue().contentProperty());
        TreeItem<LogTableItemModel> root = new RecursiveTreeItem<>(logTableItemModels, RecursiveTreeObject::getChildren);
        logTable.setRoot(root);
        logTable.setShowRoot(false);
    }

    public void updateItems() {
        logTableItemModels.clear();
        logTableItemModels.add(new LogTableItemModel(new LogVo(new Date(), LogSeverity.Success, "增加用户{你好，那啥}")));
    }

    public void initialize() {
        initLogItem();
        updateItems();
    }

    public static LogUiController init(FrameworkUiController frameworkUiController) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Client.class.getResource("/fxml/logui/LogUi.fxml"));
            Parent content = loader.load();
            LogUiController thisController = loader.getController();
            thisController.frameworkController = frameworkUiController;
            frameworkUiController.setContent(content);
            //frameworkUiController.titleText.setText("查看日志");
            return thisController;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/logui/LogUi.fxml").loadAndGetPackageWithoutException();
    }
}
