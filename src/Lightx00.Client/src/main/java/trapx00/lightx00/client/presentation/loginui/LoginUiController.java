package trapx00.lightx00.client.presentation.loginui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.effects.JFXDepthManager;
import com.jfoenix.validation.RequiredFieldValidator;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import trapx00.lightx00.client.bl.loginbl.factory.LoginBlFactory;
import trapx00.lightx00.client.blservice.loginblservice.LoginBlService;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.admin.AdminVo;

import java.util.Date;

public class LoginUiController implements ExternalLoadableUiController {
    public JFXPasswordField passwordField;
    public JFXTextField usernameField;
    public JFXButton cancelButton;
    public StackPane dialogContainer;
    public BorderPane rootPane;
    public JFXButton loginButton;
    private LoginBlService blService = LoginBlFactory.getController();

    public void initializeBorderlessStuff() {
        Stage stage = StageManager.getStage();
        BorderlessStageHelper.makeDraggable(stage, rootPane);
        BorderlessStageHelper.makeResizeable(stage);
    }

    public void initialize() {
        RequiredFieldValidator usernameValidator = new RequiredFieldValidator();
        usernameValidator.setMessage("请输入用户名");
        usernameField.getValidators().add(usernameValidator);

        RequiredFieldValidator passwordValidator = new RequiredFieldValidator();
        passwordValidator.setMessage("请输入密码");
        passwordField.getValidators().add(passwordValidator);

        usernameField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                usernameField.validate();
            }
        });

        passwordField.focusedProperty().addListener(((observable, oldValue, newValue) -> {
            if (!newValue) {
                passwordField.validate();
            }
        }));

    }

    private boolean validate() {
        return usernameField.validate() & passwordField.validate();
    }

    public void onLoginButtonClicked() {
        if (validate()) {
            EmployeeVo employeeVo = blService.login(usernameField.getText(), passwordField.getText());
            if (employeeVo != null) {
                finishLogin(employeeVo);
            } else {
                new PromptDialogHelper("登录失败！","用户名和/或密码无效！")
                    .addCloseButton("好的","CHECK",null)
                    .createAndShow();
            }

        }
    }

    private void finishLogin(EmployeeVo employeeVo) {
        FinishLoginLogic.finishLogin(employeeVo);
    }

    public void onBtnCancelClicked(ActionEvent actionEvent) {
        StageManager.closeStage();
    }

    public void onBtnFaceIdClicked(ActionEvent actionEvent) {
        ExternalLoadedUiPackage externalLoadedUiPackage = new FaceIdLoginUiController().load();
        Scene newScene = new Scene(externalLoadedUiPackage.getComponent());
        StageManager.changeScene(newScene);
    }

    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/loginui/LoginUi.fxml").loadAndGetPackageWithoutException();
    }
}
