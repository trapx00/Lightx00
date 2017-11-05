package trapx00.lightx00.shared.dataservice.notificationdataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.notification.NotificationPo;

public interface NotificationDataService {

    /**
     * Updates current user's notification.
     * @return current user's notification
     */
    NotificationPo[] update();

    /**
     * Acknowledges a notification.
     * @param notification notification to be acknowledged
     * @return whether the operation is done successfully
     */

    ResultMessage acknowledge(NotificationPo notification);
}
