package trapx00.lightx00.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sun.plugin.util.UIUtil;
import trapx00.lightx00.client.presentation.helpui.UiUtil;
import trapx00.lightx00.client.presentation.loginui.FaceIdLoginUiController;
import trapx00.lightx00.client.presentation.loginui.LoginUiController;

import java.io.IOException;

public class Client extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/loginui/FaceIdLogin.fxml"));

            Scene scene = new Scene(loader.load());

            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.setScene(scene);

            UiUtil.setStage(primaryStage);

            FaceIdLoginUiController controller = loader.getController();

            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
