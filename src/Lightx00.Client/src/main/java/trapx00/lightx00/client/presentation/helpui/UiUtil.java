package trapx00.lightx00.client.presentation.helpui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import trapx00.lightx00.client.presentation.mainui.FrameworkUiController;
import trapx00.lightx00.shared.po.employee.EmployeePosition;
import trapx00.lightx00.shared.vo.EmployeeVo;

import java.io.IOException;

public class UiUtil {
    private static Stage stage;

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        UiUtil.stage = stage;
    }


}
