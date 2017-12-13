package trapx00.lightx00.client.presentation.adminui;

import com.jfoenix.controls.JFXTextField;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadableUiController;

public class EmployeeModificationUi implements ExternalLoadableUiController {
    public JFXTextField tfId;
    public JFXTextField tfWorkDate;
    public JFXTextField tfNewName;
    public JFXTextField tfOldName;
    public JFXTextField tfNewPosition;
    public JFXTextField tfOldPosition;
    public JFXTextField tfNewPassword;
    public JFXTextField tfOldName;
    public JFXTextField tfNewName;
    public JFXTextField tfOldName;


    private BankAccountManagementBlService blService = BankAccountManagementBlServiceFactory.getInstance();
    private Runnable runnable;
    private BankAccountVo oldBankAccount;
    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/bankaccountui/BankAccountModificationUi.fxml").loadAndGetPackageWithoutException();
    }

    public void show(BankAccountVo oldBankAccount, Runnable runnable) {
        ExternalLoadedUiPackage uiPackage = load();
        BankAccountModificationUi ui = uiPackage.getController();
        ui.oldBankAccount = oldBankAccount;
        ui.tfOldName.setText(oldBankAccount.getName());
        ui.tfId.setText(String.valueOf(oldBankAccount.getId()));
        PromptDialogHelper.start("","").setContent(uiPackage.getComponent()).createAndShow();
        ((BankAccountModificationUi)uiPackage.getController()).runnable = runnable;
    }

    public void initialize() {
        RequiredFieldValidator validator = new RequiredFieldValidator();
        validator.setMessage("请输入新用户名。");
        tfNewName.getValidators().add(validator);
        tfNewName.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                tfNewName.validate();
            }
        });
    }



    public void onBtnSubmitClicked(ActionEvent actionEvent) {
        if (tfNewName.validate()) {
            oldBankAccount.setName(tfNewName.getText());
            blService.modify(oldBankAccount);
            PromptDialogHelper.start("修改成功！","用户名已经修改成功。")
                    .addCloseButton("好","CHECK",e -> close())
                    .createAndShow();
        }
    }

    public void onBtnCancelClicked(ActionEvent actionEvent) {
        close();
    }

    private void close() {
        FrameworkUiManager.getCurrentDialogStack().closeCurrentAndPopAndShowNext();
        runnable.run();
    }
}
