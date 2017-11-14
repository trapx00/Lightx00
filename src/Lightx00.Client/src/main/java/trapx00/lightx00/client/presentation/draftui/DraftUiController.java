package trapx00.lightx00.client.presentation.draftui;

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
import trapx00.lightx00.client.presentation.mainui.FrameworkUiController;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.util.DateHelper;

import java.io.IOException;
import java.util.Date;

public class DraftUiController {
    public JFXButton selectAllButton;
    public JFXButton deleteButton;
    public JFXTreeTableView<DraftTableItemModel> draftTable;
    public JFXTreeTableColumn<DraftTableItemModel, String> tableDateColumn;
    public JFXTreeTableColumn<DraftTableItemModel, String> tableTypeColumn;
    public JFXTreeTableColumn<DraftTableItemModel, String> tableIdColumn;
    public JFXButton continueWriteButton;

    private FrameworkUiController frameworkController;

    public ObservableList<DraftTableItemModel> draftModels = FXCollections.observableArrayList();

    public DraftUiController() { }

    public void initialize() {
        initDraftItem();
        updateItems();
    }

    public void updateItems() {
        draftModels.clear();
        draftModels.add(new DraftTableItemModel(new Date(), BillType.SaleBill, "TEST"));
        draftModels.add(new DraftTableItemModel(new Date(), BillType.SaleBill, "TEST2"));
    }

    public void initDraftItem() {
        tableDateColumn.setCellValueFactory(cellData -> new SimpleStringProperty(DateHelper.fromDate(cellData.getValue().getValue().getDate())));
        tableTypeColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getType().toString()));
        tableIdColumn.setCellValueFactory(cellData -> cellData.getValue().getValue().idProperty());
        TreeItem<DraftTableItemModel> root = new RecursiveTreeItem<>(draftModels, RecursiveTreeObject::getChildren);
        draftTable.setRoot(root);
        draftTable.setShowRoot(false);
    }

    public static DraftUiController init(FrameworkUiController frameworkUiController) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Client.class.getResource("/fxml/draftui/DraftUi.fxml"));
            Parent content = loader.load();
            DraftUiController draftUiController = loader.getController();
            draftUiController.frameworkController = frameworkUiController;
            frameworkUiController.setContent(content);
            //frameworkUiController.titleText.setText("管理草稿箱");
            return draftUiController;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    public void onRefreshButtonClicked(ActionEvent actionEvent) {
        updateItems();
    }

    public void onDeleteButtonClicked(ActionEvent actionEvent) {
        int index = draftTable.getSelectionModel().getFocusedIndex();
        DraftTableItemModel model = draftTable.getRoot().getChildren().get(index).getValue();
        JFXDialog dialog = PromptDialogHelper.start("确定要删除这个单据吗？","你选择了单据"+model.getId())
                .addTable(ReadOnlyPairTableHelper.start()
                        .addPair("ID", model.getId())
                        .addPair("单据类型", model.getType().toString())
                        .addPair("时间", DateHelper.fromDate(model.getDate()))
                        .create())
                .addCloseButton("确定", "CHECK",e -> deleteItem(index))
                .addCloseButton("取消", "CLOSE", null)
                .create(frameworkController.dialogContainer);
        dialog.show();
    }

    public void deleteItem(int index) {
        draftModels.remove(index);
    }

    public void onContinueWriteButtonClicked(ActionEvent actionEvent) {
        try {
            DraftTableItemModel model = draftTable.getSelectionModel().getSelectedItem().getValue();
            PromptDialogHelper.start("确认继续填写这个单据吗","")
                    .addTable(
                            ReadOnlyPairTableHelper.start()
                                    .addPair("单据编号",model.getId())
                                    .addPair("操作员","操作员1")
                                    .addPair("银行账户","银行账户1")
                                    .addPair("条目","条目1")
                                    .addPair("总额","200.00")
                                    .addPair("备注","备注")
                                    .create())
                    .addCloseButton("取消","CLOSE",null)
                    .addCloseButton("确定","CHECK",null)
                    .create(frameworkController.dialogContainer).show();
        } catch (Exception ex) {
            PromptDialogHelper.start("错误","请至少选一个条目。")
                    .addCloseButton("好的","DONE",null)
                    .create(frameworkController.dialogContainer).show();
        }

    }
}
