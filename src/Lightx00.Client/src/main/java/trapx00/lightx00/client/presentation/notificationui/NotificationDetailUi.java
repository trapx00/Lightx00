package trapx00.lightx00.client.presentation.notificationui;

import com.jfoenix.controls.JFXDialog;
import javafx.scene.layout.StackPane;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadableUiController;
import trapx00.lightx00.client.presentation.helpui.FrameworkUiManager;
import trapx00.lightx00.client.vo.notification.NotificationVo;

import java.util.function.Consumer;
@SuppressWarnings("unchecked")
public abstract class NotificationDetailUi<T extends NotificationVo> implements ExternalLoadableUiController, trapx00.lightx00.client.presentation.helpui.ContentDisplayUi<T> {
    protected Consumer<T> onAcknowledgeClicked = x -> x.operationService().activate(x);
    protected Consumer<T> onIgnoreClicked = x -> FrameworkUiManager.getCurrentDialogStack().closeCurrentAndPopAndShowNext();


}
