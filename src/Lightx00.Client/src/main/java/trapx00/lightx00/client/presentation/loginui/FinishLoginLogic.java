package trapx00.lightx00.client.presentation.loginui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import trapx00.lightx00.client.Client;
import trapx00.lightx00.client.presentation.helpui.UiUtil;
import trapx00.lightx00.client.presentation.mainui.FrameworkUiController;
import trapx00.lightx00.client.vo.EmployeeVo;

import java.io.IOException;

public class FinishLoginLogic {
    public static void finishLogin(EmployeeVo employeeVo) {
        try {
            UiUtil.closeStage();
            Stage newStage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Client.class.getResource("/fxml/mainui/FrameworkUi.fxml"));
            Scene scene = new Scene(loader.load());

            FrameworkUiController controller = loader.getController();

            newStage.initStyle(StageStyle.UNDECORATED);

            newStage.setScene(scene);
            newStage.setHeight(900);
            newStage.setWidth(1600);

            controller.setEmployee(employeeVo);
            controller.setStage(newStage);
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
