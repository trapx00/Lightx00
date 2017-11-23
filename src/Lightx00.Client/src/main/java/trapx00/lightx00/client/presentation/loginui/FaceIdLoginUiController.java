package trapx00.lightx00.client.presentation.loginui;

import com.github.sarxos.webcam.Webcam;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDialog;
import javafx.application.Platform;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import trapx00.lightx00.client.bl.loginbl.factory.FaceIdAuthenticationBlServiceFactory;
import trapx00.lightx00.client.blservice.loginblservice.FaceIdAuthenticationBlService;
import trapx00.lightx00.client.presentation.helpui.PromptDialogHelper;
import trapx00.lightx00.client.vo.EmployeeVo;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class FaceIdLoginUiController {
    public JFXButton loginButton;
    public JFXButton cancelButton;
    public VBox cameraPane;
    public ImageView cameraImage;
    public JFXComboBox cbCameraOptions;
    public StackPane rootPane;
    private BufferedImage grabbedImage;
    private ObjectProperty<Image> imageProperty = new SimpleObjectProperty<>();
    private FaceIdAuthenticationBlService blService = FaceIdAuthenticationBlServiceFactory.getService();

    private Webcam selWebCam;
    private boolean stopCamera = false;
    private String cameraListPromptText = "选择一个相机";

    private class WebCamInfo {

        private String webCamName;
        private int webCamIndex;

        public String getWebCamName() {
            return webCamName;
        }

        public void setWebCamName(String webCamName) {
            this.webCamName = webCamName;
        }

        public int getWebCamIndex() {
            return webCamIndex;
        }

        public void setWebCamIndex(int webCamIndex) {
            this.webCamIndex = webCamIndex;
        }

        @Override
        public String toString() {
            return webCamName;
        }
    }

    public void initialize() {
        initializeCamera();
    }

    public void initializeCamera() {
        ObservableList<WebCamInfo> options = FXCollections.observableArrayList();
        int webCamCounter = 0;
        for (Webcam webcam : Webcam.getWebcams()) {
            WebCamInfo webCamInfo = new WebCamInfo();
            webCamInfo.setWebCamIndex(webCamCounter);
            webCamInfo.setWebCamName(webcam.getName());
            options.add(webCamInfo);
            webCamCounter++;
        }
        cbCameraOptions.setItems(options);
        cbCameraOptions.setPromptText(cameraListPromptText);
        cbCameraOptions.getSelectionModel().selectedItemProperty().addListener((ChangeListener<WebCamInfo>) (arg0, arg1, arg2) -> {
            if (arg2 != null) {
                System.out.println("WebCam Index: " + arg2.getWebCamIndex() + ": WebCam Name:" + arg2.getWebCamName());
                initializeWebCam(arg2.getWebCamIndex());
            }
        });
    }

    public byte[] acquireImage() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(grabbedImage, "jpg", baos);
            return baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return new byte[0];
        }
    }

    public void onLoginButtonClicked(ActionEvent actionEvent) {
        stopCamera(actionEvent);
        JFXDialog dialog = PromptDialogHelper.start("登录中","登录中")
            .create(rootPane);
        dialog.show();
        EmployeeVo employeeVo = blService.authenticate(acquireImage());
        dialog.close();
        if (employeeVo == null) {
            PromptDialogHelper.start("登录失败","登录失败！请重新尝试！")
                .addCloseButton("好", "CHECK", e -> startCamera(actionEvent))
                .create(rootPane).show();
        } else {
            closeCamera();
            disposeCamera(actionEvent);
            FinishLoginLogic.finishLogin(employeeVo);

        }
    }

    protected void initializeWebCam(final int webCamIndex) {

        Task<Void> webCamInitializer = new Task<Void>() {

            @Override
            protected Void call() throws Exception {

                if (selWebCam == null) {
                    selWebCam = Webcam.getWebcams().get(webCamIndex);
                    selWebCam.open();
                } else {
                    closeCamera();
                    selWebCam = Webcam.getWebcams().get(webCamIndex);
                    selWebCam.open();
                }
                startWebCamStream();
                return null;
            }

        };

        new Thread(webCamInitializer).start();
        loginButton.setDisable(false);
    }

    protected void startWebCamStream() {
        Task<Void> task = new Task<Void>() {
            @Override
            protected Void call() throws Exception {

                while (!stopCamera) {
                    try {
                        if ((grabbedImage = selWebCam.getImage()) != null) {

                            Platform.runLater(() -> {
                                final Image mainiamge = SwingFXUtils
                                    .toFXImage(grabbedImage, null);
                                imageProperty.set(mainiamge);
                            });

                            grabbedImage.flush();

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                return null;
            }

        };
        Thread th = new Thread(task);
        th.setDaemon(true);
        th.start();
        cameraImage.imageProperty().bind(imageProperty);

    }

    private void setStage(Stage stage) {

    }

    private void closeCamera() {
        if (selWebCam != null) {
            selWebCam.close();
        }
    }

    public void stopCamera(ActionEvent event) {
        stopCamera = true;
    }

    public void startCamera(ActionEvent event) {
        stopCamera = false;
        startWebCamStream();
    }

    public void disposeCamera(ActionEvent event) {
        stopCamera = true;
        closeCamera();
    }
}
