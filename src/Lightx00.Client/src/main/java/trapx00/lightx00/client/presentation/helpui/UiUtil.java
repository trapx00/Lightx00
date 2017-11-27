package trapx00.lightx00.client.presentation.helpui;

import com.sun.org.apache.bcel.internal.generic.NEW;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UiUtil {
    private static Stage stage;

    public static void setStage(Stage stage) {
        UiUtil.stage = stage;
    }

    public static void closeStage() {
        stage.close();
    }

    public static void changeScene(Scene newScene) {
        stage.setScene(newScene);
        stage.sizeToScene();
    }

}
