package trapx00.lightx00.client.presentation.mainui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.effects.JFXDepthManager;
import de.jensd.fx.glyphs.materialicons.MaterialIconView;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import trapx00.lightx00.client.presentation.draftui.DraftUiController;
import trapx00.lightx00.client.presentation.financeui.TradeHistoryUiController;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.presentation.logui.LogUiController;
import trapx00.lightx00.client.presentation.notificationui.NotificationUiController;
import trapx00.lightx00.shared.util.DateHelper;
import trapx00.lightx00.client.vo.EmployeeVo;

import java.io.IOException;

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
    public Text titleText;
    protected EmployeeVo employeeVo;
    private Object subController;
    private DialogStack dialogStack = new DialogStack();

    public void setStage(Stage stage) {
        this.stage = stage;
        StageManager.setStage(stage);
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

    public void onDraftFunctionButtonClicked(ActionEvent event) {
        switchFunction(DraftUiController.class, "草稿");
    }

    public void onLogButtonClicked(ActionEvent actionEvent) {
        switchFunction(LogUiController.class, "日志");
    }

    public void onNotificationFunctionButtonClicked(ActionEvent actionEvent) {
        switchFunction(NotificationUiController.class, "通知");

    }

    /**
     * 切换功能界面的方法。
     * @param clazz 对应功能界面的类对象
     * @param title 标题名称
     */
    public void switchFunction(Class<? extends ExternalLoadableUiController> clazz, String title) {
        if (!clazz.isAssignableFrom(subController.getClass())) {
            try {
                ExternalLoadedUiPackage externalLoadedUiPackage = clazz.newInstance().load();
                subController = externalLoadedUiPackage.getController();
                this.contentPane.getChildren().clear();
                this.contentPane.getChildren().add(externalLoadedUiPackage.getComponent());
                this.titleText.setText(title);
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public DialogStack getDialogStack() {
        return dialogStack;
    }
}
