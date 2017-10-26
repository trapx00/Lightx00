package trapx00.lightx00.client.presentation.loginui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.effects.JFXDepthManager;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import trapx00.lightx00.client.presentation.helpui.BorderlessStageHelper;
import trapx00.lightx00.client.presentation.helpui.PromptDialogHelper;
import trapx00.lightx00.client.presentation.helpui.UiUtil;
import trapx00.lightx00.client.presentation.mainui.FrameworkUiController;
import trapx00.lightx00.shared.vo.EmployeeVo;
import trapx00.lightx00.shared.vo.admin.AdminVo;

import java.io.IOException;
import java.util.Date;

public class LoginUiController {
    public JFXTextField passwordField;
    public JFXTextField usernameField;
    public JFXButton cancelButton;
    public StackPane dialogContainer;
    public BorderPane rootPane;
    public JFXButton loginButton;


    private JFXDepthManager depthManager;
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
        try {
            UiUtil.getStage().close();
            Stage newStage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/mainui/FrameworkUi.fxml"));
            Scene scene = new Scene(loader.load());

            FrameworkUiController controller = loader.getController();

            newStage.initStyle(StageStyle.UNDECORATED);

            newStage.setScene(scene);
            newStage.sizeToScene();

            controller.setEmployee(employeeVo);
            controller.setStage(newStage);
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
