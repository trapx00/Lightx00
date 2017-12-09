package trapx00.lightx00.client.presentation.loginui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import trapx00.lightx00.client.Client;
import trapx00.lightx00.client.presentation.helpui.FrameworkUiManager;
import trapx00.lightx00.client.presentation.helpui.StageManager;
import trapx00.lightx00.client.presentation.mainui.FrameworkUiController;
import trapx00.lightx00.client.vo.EmployeeVo;

import java.io.IOException;

public class FinishLoginLogic {
    public static void finishLogin(EmployeeVo employeeVo) {
        try {
            StageManager.closeStage();
            Stage newStage = new Stage();
            FXMLLoader loader = new FXMLLoader();
<<<<<<< HEAD
            loader.setLocation(Client.class.getResource("/fxml/mainui/InventoryStaffUI.fxml"));
=======
            loader.setLocation(Client.class.getResource("/fxml/financeui/FinanceStaffFrameworkUi.fxml"));
>>>>>>> origin/chenjunda
            Scene scene = new Scene(loader.load());

            FrameworkUiController controller = loader.getController();

            FrameworkUiManager.setFrameworkUiController(controller);

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
