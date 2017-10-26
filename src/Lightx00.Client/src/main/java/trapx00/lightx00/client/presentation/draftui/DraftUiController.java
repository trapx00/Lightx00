package trapx00.lightx00.client.presentation.draftui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import trapx00.lightx00.client.presentation.Client;
import trapx00.lightx00.client.presentation.helpui.PromptDialogHelper;
import trapx00.lightx00.client.presentation.mainui.FrameworkUiController;

import java.awt.*;
import java.io.IOException;

public class DraftUiController {
    private FrameworkUiController frameworkController;

    public DraftUiController() { }


    public static DraftUiController init(FrameworkUiController frameworkUiController) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Client.class.getResource("/fxml/draftui/DraftUi.fxml"));
            Parent content = loader.load();
            DraftUiController draftUiController = loader.getController();
            draftUiController.frameworkController = frameworkUiController;
            frameworkUiController.setContent(content);
            return draftUiController;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void onCircleClicked() {
        new PromptDialogHelper("你点了圈圈","你点了圈圈")
                .addCloseButton("好的",null)
                .create(frameworkController.dialogContainer)
                .show();

    }



}
