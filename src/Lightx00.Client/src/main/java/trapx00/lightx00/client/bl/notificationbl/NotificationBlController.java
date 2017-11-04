package trapx00.lightx00.client.bl.notificationbl;

import trapx00.lightx00.client.blservice.notificationblservice.NotificationBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.notification.BillApprovalNotificationVo;
import trapx00.lightx00.shared.vo.notification.NotificationVo;

public class NotificationBlController implements NotificationBlService, NotificationService {
    /**
     * Updates current user's notifications
     * @return current users's notifications
     */
    @Override
    public NotificationVo[] update() {
        return new NotificationVo[0];
    }

    /**
     * Acknowledges a notification. For a BillApprovalNotification with a bill that is approved of, it also activates the bill
     * @param notification notification
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage acknowledge(NotificationVo notification) {
        return null;
    }

    /**
     * Activates a bill that has been approved of.
     * @param notification notification with a bill that has been approved of
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage activate(BillApprovalNotificationVo notification) {
        return null;
    }


    /**
     * Abandons a bill.
     * @param notification notification with a bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage abandon(BillApprovalNotificationVo notification) {
        return null;
    }

    /**
     * Adds a notification.
     * @param notification notification to be added
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage addNotification(NotificationVo notification) {
        return null;
    }
}
