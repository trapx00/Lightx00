package trapx00.lightx00.client.presentation.loginui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.effects.JFXDepthManager;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import trapx00.lightx00.client.bl.loginbl.factory.LoginBlFactory;
import trapx00.lightx00.client.blservice.loginblservice.LoginBlService;
import trapx00.lightx00.client.presentation.helpui.BorderlessStageHelper;
import trapx00.lightx00.client.presentation.helpui.PromptDialogHelper;
import trapx00.lightx00.client.presentation.helpui.UiUtil;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.admin.AdminVo;

import java.util.Date;

public class LoginUiController {
    public JFXTextField passwordField;
    public JFXTextField usernameField;
    public JFXButton cancelButton;
    public StackPane dialogContainer;
    public BorderPane rootPane;
    public JFXButton loginButton;


    private JFXDepthManager depthManager;
    private LoginBlService blService = LoginBlFactory.getController();

    int depth = 5;

    public void setStage(Stage stage) {
        UiUtil.setStage(stage);
        BorderlessStageHelper.makeDraggable(stage, rootPane);
        BorderlessStageHelper.makeResizeable(stage);
        cancelButton.setOnMouseClicked(e -> stage.close());
    }

    public void initialize() {
        JFXDepthManager.setDepth(rootPane, depth);

    }

    public void onLoginButtonClicked() {
        if (usernameField.getText().length() == 0) {
            new PromptDialogHelper("登录失败！","请输入用户名！")
                    .addCloseButton("好的","CHECK",null)
                    .create(dialogContainer)
                    .show();
        } else {
            finishLogin(new AdminVo("Admin","123123",new Date(),"123123"));
        }
    }

    public void finishLogin(EmployeeVo employeeVo) {
        FinishLoginLogic.finishLogin(employeeVo);
    }

}
