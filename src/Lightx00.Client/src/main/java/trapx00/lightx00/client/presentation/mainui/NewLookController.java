package trapx00.lightx00.client.presentation.mainui;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.effects.JFXDepthManager;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class NewLookController {
    public StackPane baseStackPane;
    public JFXDrawer drawer;
    public static int DEPTH =3;
    public GridPane titleBar;
    public GridPane bottomBar;
    public Pane contentPane;

    public void initialize(){
        JFXDepthManager.setDepth(drawer, DEPTH);
        JFXDepthManager.setDepth(titleBar, DEPTH);
        JFXDepthManager.setDepth(bottomBar,DEPTH);
        JFXDepthManager.setDepth(contentPane, DEPTH);
    }
}
