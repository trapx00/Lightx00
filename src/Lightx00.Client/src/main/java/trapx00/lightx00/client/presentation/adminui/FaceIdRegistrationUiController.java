package trapx00.lightx00.client.presentation.adminui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;
import trapx00.lightx00.client.blservice.adminblservice.FaceIdRegistrationBlService;
import trapx00.lightx00.client.blservice.adminblservice.FaceIdRegistrationBlServiceFactory;
import trapx00.lightx00.client.presentation.helpui.PromptDialogHelper;
import trapx00.lightx00.client.presentation.helpui.UiUtil;
import trapx00.lightx00.client.presentation.helpui.webcam.WebCamView;
import trapx00.lightx00.shared.exception.faceid.MultipleFacesException;
import trapx00.lightx00.shared.exception.faceid.NetworkException;
import trapx00.lightx00.shared.exception.faceid.NoFaceDetectedException;
import trapx00.lightx00.shared.po.ResultMessage;

public class FaceIdRegistrationUiController {
    public JFXButton btnCancel;
    public JFXButton btnRegister;
    public JFXTextField tfEmployeeId;
    public WebCamView webCamView;
    public StackPane rootPane;
    private FaceIdRegistrationBlService blService = FaceIdRegistrationBlServiceFactory.getService();

    public void onBtnRegisterClicked(ActionEvent actionEvent) {
        JFXDialog dialog = PromptDialogHelper.start("注册中", "注册中，请稍等").create(rootPane);
        dialog.show();
        Task task = new Task() {
            @Override
            protected Object call() throws Exception {
                try {
                    ResultMessage rm = blService.register(tfEmployeeId.getText(), webCamView.acquireImage());
                    dialog.close();
                    if (rm.equals(ResultMessage.Success)) {
                        showPromptDialog("注册成功",String.format("您已给ID为%s的职员注册Face ID。", tfEmployeeId.getId()));
                    } else {
                        showPromptDialog("注册失败！", "未知错误");
                    }
                } catch (MultipleFacesException e) {
                    showPromptDialog("注册失败！", String.format("检测到%d张脸。只允许一张脸！", e.getNumOfFaces()));
                } catch (NoFaceDetectedException e) {
                    showPromptDialog("注册失败！", "未检测到脸！");
                } catch (NetworkException e) {
                    showPromptDialog("注册失败！", "请联系技术人员！HTTP响应码：" + e.getStatusCode());
                }
                return null;
            }
        };
        Thread th = new Thread(task);
        th.setDaemon(true);
        th.start();

    }

    public void showPromptDialog(String title, String content) {
        Platform.runLater(() -> PromptDialogHelper.start(title, content)
            .addCloseButton("好","CHECK",null)
            .create(rootPane)
            .show());
    }


    @FXML
    public void initialize() {
        btnRegister.setDisable(true);
        webCamView.setOnCameraInitialized(() -> btnRegister.setDisable(false));
    }


    public void onBtnCancelClicked(ActionEvent actionEvent) {
        UiUtil.closeStage();
    }
}
