package trapx00.lightx00.client.presentation.logui;

import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import trapx00.lightx00.client.Client;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadableUiController;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadedUiPackage;
import trapx00.lightx00.client.presentation.helpui.SampleSelectingDialog;
import trapx00.lightx00.client.presentation.helpui.UiLoader;
import trapx00.lightx00.client.presentation.mainui.FrameworkUiController;
import trapx00.lightx00.shared.po.log.LogSeverity;
import trapx00.lightx00.shared.util.DateHelper;
import trapx00.lightx00.client.vo.log.LogVo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class LogUiController implements ExternalLoadableUiController {

    public JFXTreeTableView<LogTableItemModel> logTable;
    public JFXTreeTableColumn<LogTableItemModel, String> logDateColumn;
    public JFXTreeTableColumn<LogTableItemModel, String> logSeverityColumn;
    public JFXTreeTableColumn<LogTableItemModel, String> logContentColumn;
    public Label lbResult;
    private ObservableList<LogTableItemModel> logTableItemModels = FXCollections.observableArrayList();


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


    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/logui/LogUi.fxml").loadAndGetPackageWithoutException();
    }

    public void onBtnSelectClicked(ActionEvent actionEvent) {
        /**
         * 这里是new的，应该提供工厂。工厂应该直接new一个回来。
         */
        new SampleSelectingDialog().showSelectLogDialog(new ArrayList<>(), list -> {
            /**
             * 这个函数就是如何处理选择结束后的数据。参数list就是用户选择的内容。
             * 如果用户按了取消，就不会调用
             */
            StringBuilder result = new StringBuilder("你选择了ID是");
            list.forEach(x -> result.append(x.getId()).append("、"));

            lbResult.setText(result.append("的日志").toString());
        });
    }
}
