package trapx00.lightx00.client.presentation.adminui;

import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import trapx00.lightx00.client.blservice.adminblservice.UserManagementBlService;
import trapx00.lightx00.client.blservice.adminblservice.UserManagementBlServiceFactory;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.shared.queryvo.UserAccountQueryVo;
import trapx00.lightx00.shared.util.DateHelper;

public class UserManagementUiController implements ExternalLoadableUiController {
    public JFXTextField tfSearch;
    public JFXButton btnSearch;
    public JFXTreeTableView<EmployeeInfoModel> tableEmployee;
    public JFXTreeTableColumn<EmployeeInfoModel, String> tcId;
    public JFXTreeTableColumn<EmployeeInfoModel, String> tcName;
    public JFXTreeTableColumn<EmployeeInfoModel, String> tcWorkDate;
    public JFXTreeTableColumn<EmployeeInfoModel, String> tcPosition;
    public JFXButton btnAdd;
    public JFXButton btnModify;
    public JFXButton btnDelete;

    private ObservableList<EmployeeInfoModel> employeeInfoModels = FXCollections.observableArrayList();
    private UserManagementBlService blService = UserManagementBlServiceFactory.getInstance();

    public void onBtnSearchClicked() {
        updateItems();
    }

    public void initialize() {
        initTable();
        updateItems();
    }

    private void updateItems() {
        employeeInfoModels.clear();
        UserAccountQueryVo queryVo = new UserAccountQueryVo();
        EmployeeVo[] result = blService.query(queryVo);
        for(EmployeeVo employeeVo:result) {
            employeeInfoModels.add(new EmployeeInfoModel(employeeVo));
        }

    }

    private void initTable() {
        tcId.setCellValueFactory(cellData -> cellData.getValue().getValue().idProperty());
        tcName.setCellValueFactory(cellData -> cellData.getValue().getValue().nameProperty());
        tcWorkDate.setCellValueFactory(cellData -> new SimpleStringProperty(DateHelper.fromDate(cellData.getValue().getValue().getWorkDate())));
        tcPosition.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getPosition().toString()));
        TreeItem<EmployeeInfoModel> root = new RecursiveTreeItem<>(employeeInfoModels, RecursiveTreeObject::getChildren);
        tableEmployee.setRoot(root);
        tableEmployee.setShowRoot(false);
        tableEmployee.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/adminui/UserManagementUi.fxml").loadAndGetPackageWithoutException();
    }

    public EmployeeVo getSelected() {
        try {
            return tableEmployee.getSelectionModel().getSelectedItem().getValue().toEmployeeVo();
        } catch (Exception e) {
            new PromptDialogHelper("未选择！","请先选择一个职员！")
                    .addCloseButton("好","CHECK", null)
                    .createAndShow();
            return null;
        }
    }

    public void onBtnDeleteClicked() {
        EmployeeVo selected = getSelected();
        if (selected != null) {
            new PromptDialogHelper("确定删除？", "警告：删除操作不可撤销且可能会影响相关单据。")
                    .addCloseButton("取消","CLOSE",null)
                    .addButton("确定","CHECK",e -> {
                        blService.delete(selected);
                        new PromptDialogHelper("删除成功","")
                                .addCloseButton("好","CHECK", e2 -> {
                                    FrameworkUiManager.getCurrentDialogStack().closeCurrentAndPopAndShowNext();
                                    updateItems();
                                })
                                .createAndShow();
                    })
                    .createAndShow();
        }
    }

    public void onBtnModifyClicked() {
        EmployeeVo selected = getSelected();
        if (selected != null) {
            new EmployeeModificationUi().show(selected, this::updateItems);
        }
    }

    public void onBtnAddClicked() {
        new EmployeeAddUi().show(this::updateItems);
    }
}
