package trapx00.lightx00.client.presentation.draftui;

import com.jfoenix.controls.JFXDrawer;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import sun.plugin.javascript.navig.Anchor;
import trapx00.lightx00.client.presentation.Client;
import trapx00.lightx00.client.presentation.mainui.FrameworkUiController;

import java.io.IOException;

public class DraftUiController {
    private FrameworkUiController frameworkController;

    public static void selected(FrameworkUiController controller) {
        new DraftUiController(controller);
    }

    public DraftUiController() { }

    public DraftUiController(FrameworkUiController controller) {
        this.frameworkController = controller;
        initContentPane();
    }

    public void initContentPane() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Client.class.getResource("/fxml/draftui/DraftUi.fxml"));
            Parent content = loader.load();
            frameworkController.addContent(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
