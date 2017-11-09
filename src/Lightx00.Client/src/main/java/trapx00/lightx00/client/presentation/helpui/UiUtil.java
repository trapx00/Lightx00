package trapx00.lightx00.client.presentation.helpui;

import javafx.stage.Stage;

public class UiUtil {
    private static Stage stage;

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        UiUtil.stage = stage;
    }


}
