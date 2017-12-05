package trapx00.lightx00.client.presentation.loginui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import trapx00.lightx00.client.bl.loginbl.factory.FaceIdAuthenticationBlServiceFactory;
import trapx00.lightx00.client.blservice.loginblservice.FaceIdAuthenticationBlService;
import trapx00.lightx00.client.presentation.helpui.PromptDialogHelper;
import trapx00.lightx00.client.presentation.helpui.StageManager;
import trapx00.lightx00.client.presentation.helpui.webcam.WebCamView;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.shared.exception.faceid.MultipleFacesException;
import trapx00.lightx00.shared.exception.faceid.NetworkException;
import trapx00.lightx00.shared.exception.faceid.NoFaceDetectedException;

public class FaceIdLoginUiController {
    public JFXButton loginButton;
    public JFXButton cancelButton;
    public StackPane rootPane;
    public WebCamView webCamView;
    private FaceIdAuthenticationBlService blService = FaceIdAuthenticationBlServiceFactory.getService();

    public void initialize() {
        loginButton.setDisable(true);
        webCamView.setOnCameraInitialized(() -> loginButton.setDisable(false));
    }

    public void onLoginButtonClicked(ActionEvent actionEvent) {
        stopCamera(actionEvent);
        JFXDialog dialog = PromptDialogHelper.start("登录中","登录中")
            .create(rootPane);
        Task<Void> task = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                try {
                    EmployeeVo employeeVo = blService.authenticate(webCamView.acquireImage());
                    dialog.close();
                    if (employeeVo == null) {
                        showPromptDialog("登录失败！","未知错误！");
                    } else {
                        Platform.runLater(() -> {
                            PromptDialogHelper.start("登录成功", String.format("登录成功！确认将以%s（id: %s）的身份登录！", employeeVo.getName(), employeeVo.getId()))
                                .addCloseButton("好", "CHECK", e -> {
                                    closeCamera();
                                    disposeCamera(actionEvent);
                                    FinishLoginLogic.finishLogin(employeeVo);
                                })
                                .addCloseButton("不对！这不是我！","CLOSE", e -> startCamera())
                                .create(rootPane).show();
                        });

                    }
                } catch (MultipleFacesException e) {
                    dialog.close();
                    Platform.runLater(() -> showPromptDialog("登录失败！", String.format("检测到%d张脸。只允许一张脸！", e.getNumOfFaces())));
                } catch (NoFaceDetectedException e) {
                    dialog.close();
                    Platform.runLater(() -> showPromptDialog("登录失败！", "未检测到脸！"));
                } catch (NetworkException e) {
                    dialog.close();
                    Platform.runLater(() -> showPromptDialog("网络错误！", "请联系技术人员。HTTP响应码：" + e.getStatusCode()));
                }
                return null;
            }
        };
        Thread th = new Thread(task);
        th.setDaemon(true);
        dialog.show();
        th.setUncaughtExceptionHandler((eh, x) -> System.out.println(x.toString()));
        th.start();

    }

    public void showPromptDialog(String title, String content) {
        PromptDialogHelper.start(title, content)
            .addCloseButton("好","CHECK",e -> startCamera())
            .create(rootPane)
            .show();
    }

    private void closeCamera() {
        webCamView.closeCamera();
    }

    public void stopCamera(ActionEvent event) {
        webCamView.stopCamera();
    }

    public void startCamera() {
        webCamView.startCamera();
    }

    public void disposeCamera(ActionEvent event) {
        webCamView.disposeCamera();
    }

    public void onCancelButtonClicked(ActionEvent actionEvent) {
        StageManager.closeStage();
    }
}
