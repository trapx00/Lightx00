package trapx00.lightx00.client.presentation.mainui;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.controls.JFXRippler;
import javafx.fxml.FXML;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class FrameworkUI {
    @FXML private JFXDrawer mainDrawer;


    @FXML private Pane logPane;
    @FXML private Pane userPane;
    @FXML private Pane logBasePane;
    @FXML private Pane userBasePane;
    @FXML private GridPane bottomPane;

    public void initialize() {
        JFXRippler logPaneRipper = new JFXRippler(logPane);

        JFXRippler userPaneRipper = new JFXRippler(userPane);
        logBasePane.getChildren().add(logPaneRipper);
        userBasePane.getChildren().add(userPaneRipper);

    }

}
