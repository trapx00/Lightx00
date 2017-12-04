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
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import trapx00.lightx00.client.Client;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadedUiPackage;
import trapx00.lightx00.client.presentation.helpui.PromptDialogHelper;
import trapx00.lightx00.client.presentation.helpui.ReadOnlyPairTableHelper;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.financestaff.CashBillVo;
import trapx00.lightx00.client.vo.financestaff.FinanceStaffVo;
import trapx00.lightx00.client.vo.notification.billapproval.BillApprovalNotificationVo;
import trapx00.lightx00.client.vo.notification.others.OtherNotificationVo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.client.presentation.mainui.FrameworkUiController;
import trapx00.lightx00.shared.po.financestaff.CashBillItem;
import trapx00.lightx00.shared.util.DateHelper;

import java.io.IOException;
import java.util.Date;

@SuppressWarnings("unchecked")
public class NotificationUiController {

    public JFXButton selectAllButton;
    public JFXButton deleteButton;
    public JFXTreeTableView<NotificationModel> notificationTable;
    public JFXTreeTableColumn<NotificationModel, String> tableDateColumn;
    public JFXTreeTableColumn<NotificationModel, String> tableTypeColumn;
    public JFXTreeTableColumn<NotificationModel, String> tableIdColumn;
    public JFXButton readButton;
    public JFXTreeTableColumn<NotificationModel, String> tableSenderColumn;
    public StackPane dialogContainer;
    private EmployeeVo employeeVo = new FinanceStaffVo("123","123",new Date(),"123","123");
    private OtherNotificationVo testVo = new OtherNotificationVo(1, new Date(), employeeVo, new EmployeeVo[] {employeeVo}, "test content\n123");
    private BillApprovalNotificationVo testBillApprovalVo = new BillApprovalNotificationVo(2, new Date(), employeeVo, new EmployeeVo[] {employeeVo},
        new CashBillVo("123",new Date(), BillState.Approved, "123","123",
            new CashBillItem[] {
            new CashBillItem("item1", 10, "test1"),
                new CashBillItem("item2", 10, "test2")
            }));

    private FrameworkUiController frameworkController;

    public ObservableList<NotificationModel> notificationModels = FXCollections.observableArrayList();

    public NotificationUiController() { }

    public void initialize(){
        initNotifyItem();
        updateItems();
    }

    public void updateItems(){
        notificationModels.clear();
        notificationModels.add(new NotificationModel(testVo));
        notificationModels.add(new NotificationModel(testBillApprovalVo));
    }

    public void initNotifyItem() {
        tableDateColumn.setCellValueFactory(cellData -> new SimpleStringProperty(DateHelper.fromDate(cellData.getValue().getValue().getVoObjectProperty().getDate())));
        tableTypeColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getVoObjectProperty().getType().toString()));
        tableIdColumn.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getValue().getVoObjectProperty().getId())));
        tableSenderColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getVoObjectProperty().getSender().getName()));
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
        JFXDialog dialog = PromptDialogHelper.start("确定要删除这个通知吗？","你选择了通知"+model.getVoObjectProperty().getId())
                .addTable(ReadOnlyPairTableHelper.start()
                    .addPair("ID", String.valueOf(model.getVoObjectProperty().getId()))

                    .addPair("时间", DateHelper.fromDate(model.getVoObjectProperty().getDate()))
                    .addPair("类型", model.getVoObjectProperty().getType().toString())
                    .addPair("发送者", model.getVoObjectProperty().getSender().getName())
                .create())
                .addCloseButton("确定", "CHECK",e -> deleteItem(index))
                .addCloseButton("取消", "CLOSE", null)
                .create(frameworkController.dialogContainer);
        dialog.show();
    }

    public void deleteItem(int index){

        notificationModels.remove(index);
    }

    public void onReadButtonClicked(ActionEvent actionEvent) {
        int index = notificationTable.getSelectionModel().getFocusedIndex();
        NotificationModel model = notificationTable.getRoot().getChildren().get(index).getValue();
        JFXDialog dialog = PromptDialogHelper.start("消息详细内容","你选择了通知").create(frameworkController.dialogContainer);
        ExternalLoadedUiPackage uiPackage = model.getVoObjectProperty().notificationDetailUi().showContent(model.getVoObjectProperty());
        NotificationDetailUi controller = (NotificationDetailUi) uiPackage.getController();
        controller.setFatherDialogContainer(frameworkController.dialogContainer);
        controller.setCurrentDialog(dialog);
        dialog.setContent((Region) uiPackage.getComponent());
        dialog.show();
    }
}
