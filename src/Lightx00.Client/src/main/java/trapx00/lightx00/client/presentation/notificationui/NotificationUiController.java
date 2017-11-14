package trapx00.lightx00.client.presentation.notificationui;

import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TreeItem;
import trapx00.lightx00.client.Client;
import trapx00.lightx00.client.presentation.helpui.PromptDialogHelper;
import trapx00.lightx00.client.presentation.helpui.ReadOnlyPairTableHelper;
import trapx00.lightx00.client.vo.financestaff.FinanceStaffVo;
import trapx00.lightx00.shared.po.notification.NotificationType;
import trapx00.lightx00.client.presentation.mainui.FrameworkUiController;
import trapx00.lightx00.shared.util.DateHelper;

import java.io.IOException;
import java.util.Date;

public class NotificationUiController {

    public JFXButton selectAllButton;
    public JFXButton deleteButton;
    public JFXTreeTableView<NotificationModel> notificationTable;
    public JFXTreeTableColumn<NotificationModel, String> tableDateColumn;
    public JFXTreeTableColumn<NotificationModel, String> tableTypeColumn;
    public JFXTreeTableColumn<NotificationModel, String> tableIdColumn;
    public JFXTreeTableColumn<NotificationModel,String> tableReadColumn;
    public JFXButton readButton;

    private FrameworkUiController frameworkController;

    public ObservableList<NotificationModel> notificationModels = FXCollections.observableArrayList();

    public NotificationUiController() { }

    public void initialize(){
        initNotifyItem();
        updateItems();
    }

    public void updateItems(){
        notificationModels.clear();
        notificationModels.add(new NotificationModel(new Date(), NotificationType.BillApproval, "TEST1", new FinanceStaffVo("李二",  "test", new Date(),
                "张三"),"未读"));
        notificationModels.add(new NotificationModel(new Date(), NotificationType.BillApproval, "TEST2", new FinanceStaffVo("李二",  "test", new Date(),
                 "张三"),"未读"));
    }

    public void initNotifyItem() {
        tableDateColumn.setCellValueFactory(cellData -> new SimpleStringProperty(DateHelper.fromDate(cellData.getValue().getValue().getDate())));
        tableTypeColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getType().toString()));
        tableIdColumn.setCellValueFactory(cellData -> cellData.getValue().getValue().idProperty());
        tableReadColumn.setCellValueFactory(cellData->cellData.getValue().getValue().readTypeProperty());
        TreeItem<NotificationModel> root = new RecursiveTreeItem<>(notificationModels, RecursiveTreeObject::getChildren);
        notificationTable.setRoot(root);
        notificationTable.setShowRoot(false);
    }

    public static NotificationUiController init(FrameworkUiController frameworkUiController) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Client.class.getResource("/fxml/notificationui/NotificationUi.fxml"));
            Parent content = loader.load();
            NotificationUiController notifyUiController = loader.getController();
            notifyUiController.frameworkController = frameworkUiController;
            frameworkUiController.setContent(content);
            return notifyUiController;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    public void onRefreshButtonClicked(ActionEvent actionEvent) {

        updateItems();
    }

    public void onDeleteButtonClicked(ActionEvent actionEvent) {
        int index = notificationTable.getSelectionModel().getFocusedIndex();
        NotificationModel model = notificationTable.getRoot().getChildren().get(index).getValue();
        JFXDialog dialog = PromptDialogHelper.start("确定要删除这个通知吗？","你选择了通知"+model.getId())
                .addTable(ReadOnlyPairTableHelper.start()
                        .addPair("ID", model.getId())
                        .addPair("该通知状态", model.getType().toString())
                        .addPair("时间", DateHelper.fromDate(model.getDate()))
                        .create())
                .addCloseButton("确定", "CHECK",e -> deleteItem(index))
                .addCloseButton("取消", "CLOSE", null)
                .create(frameworkController.dialogContainer);
        dialog.show();
    }

    public void modifyReadType(int index){
        NotificationModel temp=notificationModels.get(index);
        temp.setReadType("已读");
        notificationModels.remove(index);
        notificationModels.add(temp);
    }

    public void deleteItem(int index){

        notificationModels.remove(index);
    }

    public void onReadButtonClicked(ActionEvent actionEvent) {
        int index = notificationTable.getSelectionModel().getFocusedIndex();
        NotificationModel model = notificationTable.getRoot().getChildren().get(index).getValue();
        JFXDialog dialog = PromptDialogHelper.start("消息详细内容","你选择了通知"+model.getId())
                .addTable(ReadOnlyPairTableHelper.start()
                        .addPair("ID", model.getId())
                        .addPair("该通知状态", model.getType().toString())
                        .addPair("时间", DateHelper.fromDate(model.getDate()))
                        .addPair("详细内容","你的某某某单据通过审查")
                        .create())
                .addCloseButton("确定", "CHECK",e->modifyReadType(index))
                .create(frameworkController.dialogContainer);
        dialog.show();
    }
}
