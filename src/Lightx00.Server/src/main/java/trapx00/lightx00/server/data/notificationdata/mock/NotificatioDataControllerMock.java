package trapx00.lightx00.server.data.notificationdata.mock;

import trapx00.lightx00.server.data.notificationdata.NotificationDataController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.notification.NotificationPo;

public class NotificatioDataControllerMock extends NotificationDataController {
    /**
     * Updates current user's notification.
     *
     * @return current user's notification
     */
    @Override
    public NotificationPo[] update() {
        return super.update();
    }

    /**
     * Acknowledges a notification.
     *
     * @param notification notification to be acknowledged
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage acknowledge(NotificationPo notification) {
        return super.acknowledge(notification);
    }
}
