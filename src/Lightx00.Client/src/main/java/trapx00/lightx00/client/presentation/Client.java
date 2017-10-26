package trapx00.lightx00.client.presentation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
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
            loader.setLocation(getClass().getResource("/fxml/loginui/LoginUi.fxml"));

            Scene scene = new Scene(loader.load());

            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.setScene(scene);

            LoginUiController controller = loader.getController();
            controller.setStage(primaryStage);

            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
