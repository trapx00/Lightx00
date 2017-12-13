package trapx00.lightx00.client.presentation.helpui;

import com.jfoenix.controls.JFXDialog;
import javafx.scene.layout.StackPane;
import trapx00.lightx00.client.presentation.mainui.FrameworkUiController;
import trapx00.lightx00.client.vo.EmployeeVo;

public class FrameworkUiManager {
    private static FrameworkUiController frameworkUiController;

    public static FrameworkUiController getFrameworkUiController() {
        return frameworkUiController;
    }

    public static void setFrameworkUiController(FrameworkUiController frameworkUiController) {
        FrameworkUiManager.frameworkUiController = frameworkUiController;
    }

    public static DialogStack getCurrentDialogStack() {
        return frameworkUiController.getDialogStack();
    }

    public static JFXDialog createDialog(PromptDialogHelper promptDialogHelper) {
        return promptDialogHelper.create(frameworkUiController.dialogContainer);
    }

    public static StackPane getDialogContainer() {
        return frameworkUiController.dialogContainer;
    }

    public static EmployeeVo getCurrentEmployee() {
        return frameworkUiController.getEmployeeVo();
    }

    public static void switchBackToHome() {
        frameworkUiController.switchBackToHome();
    }

}
