package trapx00.lightx00.client.bl.notificationbl.mock;

import trapx00.lightx00.client.bl.notificationbl.NotificationBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.notification.BillApprovalNotificationVo;
import trapx00.lightx00.client.vo.notification.NotificationVo;

public class NotificationBlControllerMock extends NotificationBlController {
    /**
     * Adds a notification.
     *
     * @param notification notification to be added
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage addNotification(NotificationVo notification) {
        return super.addNotification(notification);
    }

    /**
     * Updates current user's notifications
     *
     * @return current users's notifications
     */
    @Override
    public NotificationVo[] update() {
        return super.update();
    }

    /**
     * Acknowledges a notification. For a BillApprovalNotification with a bill that is approved of, it also activates the bill.
     *
     * @param notification notification
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage acknowledge(NotificationVo notification) {
        return super.acknowledge(notification);
    }

    /**
     * Abandons a bill.
     *
     * @param notification notification with a bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage abandon(BillApprovalNotificationVo notification) {
        return super.abandon(notification);
    }
}
