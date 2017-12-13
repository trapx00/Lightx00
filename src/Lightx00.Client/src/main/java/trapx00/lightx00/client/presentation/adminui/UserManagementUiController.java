package trapx00.lightx00.client.presentation.adminui;

import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import trapx00.lightx00.client.blservice.adminblservice.UserManagementBlService;
import trapx00.lightx00.client.blservice.adminblservice.UserManagementBlServiceFactory;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.financestaff.BankAccountVo;
import trapx00.lightx00.shared.queryvo.BankAccountQueryVo;
import trapx00.lightx00.shared.queryvo.UserAccountQueryVo;
import trapx00.lightx00.shared.queryvo.promotion.UsedCouponQueryVo;
import trapx00.lightx00.shared.util.DateHelper;

import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.stream.Collectors;

public class UserManagementUiController implements ExternalLoadableUiController {
    @FXML
    private JFXTextField tfSearch;
    @FXML
    private JFXButton btnSearch;
    @FXML
    private JFXTreeTableView<EmployeeInfoModel> tableEmployee;
    @FXML
    private JFXTreeTableColumn<EmployeeInfoModel, String> tcId;
    @FXML
    private JFXTreeTableColumn<EmployeeInfoModel, String> tcName;
    @FXML
    private JFXTreeTableColumn<EmployeeInfoModel, String> tcWorkDate;
    @FXML
    private JFXTreeTableColumn<EmployeeInfoModel, String> tcPosition;


    private ObservableList<EmployeeInfoModel> employeeInfoModels = FXCollections.observableArrayList();
    private UserManagementBlService blService = UserManagementBlServiceFactory.getInstance();

    public void onBtnSearchClicked(ActionEvent actionEvent) {
        updateItems();
    }

    public void initialize() {
        initTable();
        updateItems();
    }

    public void updateItems() {
        employeeInfoModels.clear();

        UserAccountQueryVo queryVo = new UserAccountQueryVo();
        queryVo.eq("name", tfSearch.getText());

        employeeInfoModels.addAll(Arrays.stream(blService.query(queryVo).map(EmployeeInfoModel::new).collect(Collectors.toList()));

    }

    @FXML
    private void initTable() {
        tcId.setCellValueFactory(cellData -> cellData.getValue().getValue().idProperty());
        tcName.setCellValueFactory(cellData -> cellData.getValue().getValue().nameProperty());
        tcWorkDate.setCellValueFactory(cellData -> new SimpleStringProperty(DateHelper.fromDate(cellData.getValue().getValue().getWorkDate())));
        tcPosition.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getPosition()));
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
        return new UiLoader("/fxml/admin/UserManagementUi.fxml").loadAndGetPackageWithoutException();
    }

    public EmployeeVo getSelected() {
        try {
            return tableEmployee.getSelectionModel().getSelectedItem().getValue().toEmployeeVo();
        } catch (Exception e) {
            new PromptDialogHelper("未选择！","请先选择一个账户！")
                    .addCloseButton("好","CHECK", null)
                    .createAndShow();
            return null;
        }

    }

    public void onBtnDeleteClicked(ActionEvent actionEvent) {
        EmployeeVo selected = getSelected();
        if (selected != null) {
            new PromptDialogHelper("确定删除",
                    String.format("您确定要删除职员(id: %d, 名称: %s)吗？", selected.getId(), selected.getName()))
                    .addCloseButton("取消","CLOSE",null)
                    .addButton("确定","CHECK",e -> {
                        blService.delete(selected);
                        new PromptDialogHelper("删除成功",String.format("职员(id: %d)已经删除！", selected.getId()))
                                .addCloseButton("好","CHECK", e2 -> {
                                    FrameworkUiManager.getCurrentDialogStack().closeCurrentAndPopAndShowNext();
                                    updateItems();
                                })
                                .createAndShow();
                    })
                    .createAndShow();
        }
    }

    public void onBtnModifyClicked(ActionEvent actionEvent) {
        EmployeeVo selected = getSelected();
        if (selected != null) {
            new EmployeeModificationUi().show(selected, this::updateItems);
        }
    }

    public void onBtnAddClicked(ActionEvent actionEvent) {
        new BankAccountAddUi().show(this::updateItems);
    }
}
