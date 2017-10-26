package trapx00.lightx00.client.presentation.mainui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.effects.JFXDepthManager;
import de.jensd.fx.glyphs.materialicons.MaterialIconView;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import trapx00.lightx00.client.presentation.draftui.DraftUiController;
import trapx00.lightx00.client.presentation.helpui.BorderlessStageHelper;
import trapx00.lightx00.client.presentation.helpui.UiUtil;
import trapx00.lightx00.shared.util.DateHelper;
import trapx00.lightx00.shared.vo.EmployeeVo;

import java.util.Timer;
import java.util.TimerTask;

public class FrameworkUiController {
    public StackPane dialogContainer;
    public GridPane drawer;
    public static final int DEPTH = 3;
    public GridPane titleBar;
    public GridPane bottomBar;
    public Pane contentPane;
    public JFXButton closeButton;
    public Stage stage;
    public Text timeText;
    public JFXButton maximizeButton;
    public JFXButton minimizeButton;
    public MaterialIconView maximizeButtonGlyph;
    public Label promptLabel;
    protected EmployeeVo employeeVo;

    public void setStage(Stage stage) {
        this.stage = stage;
        UiUtil.setStage(stage);
        BorderlessStageHelper.makeResizeable(stage);
        BorderlessStageHelper.makeDraggable(stage, titleBar);
    }

    public void setEmployee(EmployeeVo employee) {
        this.employeeVo = employee;
        promptLabel.setText("欢迎你！" + employee.getName());
    }

    public void initialize() {
        JFXDepthManager.setDepth(drawer, DEPTH);
        JFXDepthManager.setDepth(titleBar, DEPTH);
        JFXDepthManager.setDepth(bottomBar, DEPTH);
        JFXDepthManager.setDepth(contentPane, DEPTH);
        closeButton.setOnMouseClicked(e -> stage.close());
        minimizeButton.setOnMouseClicked(e -> stage.setIconified(true));
        maximizeButton.setOnMouseClicked(e -> {
            if (stage.isMaximized()) {
                stage.setMaximized(false);
                maximizeButtonGlyph.setGlyphName("KEYBOARD_ARROW_UP");
            } else {
                stage.setMaximized(true);
                maximizeButtonGlyph.setGlyphName("KEYBOARD_ARROW_DOWN");
            }

        });

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.millis(1000),
                        event -> timeText.setText(DateHelper.fromTimestamp(System.currentTimeMillis()))
                )
        );
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }


    public void setContent(Node content) {
        contentPane.getChildren().clear();
        contentPane.getChildren().add(content);
    }

    public void onDraftFunctionButtonClicked() {
        DraftUiController.init(this);
    }


}
