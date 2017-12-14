package trapx00.lightx00.client.presentation.adminui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import trapx00.lightx00.client.blservice.adminblservice.UserManagementBlService;
import trapx00.lightx00.client.blservice.adminblservice.UserManagementBlServiceFactory;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.admin.AdminVo;
import trapx00.lightx00.client.vo.financestaff.FinanceStaffVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryStaffVo;
import trapx00.lightx00.client.vo.manager.ManagerVo;
import trapx00.lightx00.client.vo.salestaff.SaleStaffVo;
import trapx00.lightx00.shared.exception.presentation.NotCompleteException;
import trapx00.lightx00.shared.po.employee.EmployeePosition;
import trapx00.lightx00.shared.po.employee.EmployeeState;
import trapx00.lightx00.shared.po.salestaff.SaleStaffType;
import trapx00.lightx00.shared.util.DateHelper;

public class EmployeeAddUi implements ExternalLoadableUiController {
    @FXML private JFXTextField tfId;
    @FXML private JFXTextField tfName;
    @FXML private JFXTextField tfPassword;
    @FXML private JFXDatePicker tfWorkDate;
    @FXML private JFXComboBox<EmployeePosition> tfPosition;
    @FXML private JFXComboBox<EmployeeState> tfState;
    @FXML private JFXComboBox<String> tfRoot;
    @FXML private JFXComboBox<SaleStaffType> tfSaleType;
    @FXML private JFXButton btnSubmit;
    @FXML private JFXButton btnCancel;

    private UserManagementBlService blService = UserManagementBlServiceFactory.getInstance();
    private Runnable runnable;
    private ObservableList<String> root = FXCollections.observableArrayList("否","是");
    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/adminui/EmployeeAddUi.fxml").loadAndGetPackageWithoutException();
    }

    public void show(Runnable runnable) {
        ExternalLoadedUiPackage uiPackage = load();
        PromptDialogHelper.start("","").setContent(uiPackage.getComponent()).createAndShow();
        ((EmployeeAddUi)uiPackage.getController()).runnable = runnable;
    }

    @FXML
    public void initialize() {
        tfPosition = new JFXComboBox<>(FXCollections.observableArrayList(EmployeePosition.values()));
        tfState = new JFXComboBox<>(FXCollections.observableArrayList(EmployeeState.values()));
        tfRoot= new JFXComboBox<>(root);
        tfRoot.setEditable(false);
        tfSaleType = new JFXComboBox<>(FXCollections.observableArrayList(SaleStaffType.values()));
        tfSaleType.setEditable(false);
        tfPosition.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) ->{
            if(newValue.equals(EmployeePosition.SaleStaff)) {
                tfRoot.setEditable(true);
                tfSaleType.setEditable(true);
            }
            else if(newValue.equals(EmployeePosition.FinanceStaff)) {
                tfRoot.setEditable(true);
            }
        });
    }

    private EmployeeVo getCurrentEmployeeVo() {
        switch (tfPosition.getValue()) {
            case Admin:
                return new AdminVo(tfId.getText(),tfName.getText(),DateHelper.fromLocalDate(tfWorkDate.getValue()),tfPassword.getText(),tfState.getValue());
            case Manager:
                return new ManagerVo(tfId.getText(),tfName.getText(),DateHelper.fromLocalDate(tfWorkDate.getValue()),tfPassword.getText(),tfState.getValue());
            case InventoryStaff:
                return new InventoryStaffVo(tfId.getText(),tfName.getText(),DateHelper.fromLocalDate(tfWorkDate.getValue()),tfPassword.getText(),tfState.getValue());
            case FinanceStaff:
                return new FinanceStaffVo(tfId.getText(),tfName.getText(),DateHelper.fromLocalDate(tfWorkDate.getValue()),tfPassword.getText(),tfState.getValue(),boolRoot(tfRoot.getVisibleRowCount()));
            case SaleStaff:
                return new SaleStaffVo(tfId.getText(),tfName.getText(),DateHelper.fromLocalDate(tfWorkDate.getValue()),tfPassword.getText(),tfState.getValue(),boolRoot(tfRoot.getVisibleRowCount()),tfSaleType.getValue());
            default:
                throw new NotCompleteException();
        }

    }

    public void onBtnSubmitClicked() {
        if (tfName.getText().length() == 0) {
            PromptDialogHelper.start("提交失败！", "请先输入职员姓名。")
                    .addCloseButton("好的", "CHECK", null)
                    .createAndShow();
            throw new NotCompleteException();
        }
        else if (tfPassword.getText().length() == 0) {
            PromptDialogHelper.start("提交失败！", "请先输入职员登录密码。")
                    .addCloseButton("好的", "CHECK", null)
                    .createAndShow();
            throw new NotCompleteException();
        }
        else if (tfWorkDate.getValue().toString().length() == 0) {
            PromptDialogHelper.start("提交失败！", "请先输入职员入职时间。")
                    .addCloseButton("好的", "CHECK", null)
                    .createAndShow();
            throw new NotCompleteException();
        }
        else if (tfPosition.getValue().toString().length() == 0) {
            PromptDialogHelper.start("提交失败！", "请先输入职员就职单位。")
                    .addCloseButton("好的", "CHECK", null)
                    .createAndShow();
            throw new NotCompleteException();
        }
        else if (tfState.getValue().toString().length() == 0) {
            PromptDialogHelper.start("提交失败！", "请先输入职员就职状态。")
                    .addCloseButton("好的", "CHECK", null)
                    .createAndShow();
            throw new NotCompleteException();
        }
        else {
            blService.add(getCurrentEmployeeVo());
            PromptDialogHelper.start("创建成功！","已经创建一位新的职员。")
                    .addCloseButton("好的","CHECK",e -> close())
                    .createAndShow();
        }
    }

    public void onBtnCancelClicked() {
        close();
    }

    private void close() {
        FrameworkUiManager.getCurrentDialogStack().closeCurrentAndPopAndShowNext();
        runnable.run();
    }

    private boolean boolRoot(int index){
        return index!=0;
    }
}
