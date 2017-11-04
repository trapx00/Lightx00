package trapx00.lightx00.client.blservice.notificationblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.notification.BillApprovalNotificationVo;
import trapx00.lightx00.shared.vo.notification.NotificationVo;

public interface NotificationBlService {
    /**
     * Updates current user's notifications
     * @return current users's notifications
     */
    NotificationVo[] update();

    /**
     * Acknowledges a notification. For a BillApprovalNotification with a bill that is approved of, it also activates the bill.
     * @param notification notification
     * @return whether the operation is done successfully
     */
    ResultMessage acknowledge(NotificationVo notification);

    /**
     * Abandons a bill.
     * @param notification notification with a bill
     * @return whether the operation is done successfully
     */
    ResultMessage abandon(BillApprovalNotificationVo notification);

}
