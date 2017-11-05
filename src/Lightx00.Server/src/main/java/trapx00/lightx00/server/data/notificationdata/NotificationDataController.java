package trapx00.lightx00.server.data.notificationdata;

import trapx00.lightx00.shared.dataservice.notificationdataservice.NotificationDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.notification.NotificationPo;

public class NotificationDataController implements NotificationDataService {
    /**
     * Updates current user's notification.
     *
     * @return current user's notification
     */
    @Override
    public NotificationPo[] update() {
        return new NotificationPo[0];
    }

    /**
     * Acknowledges a notification.
     *
     * @param notification notification to be acknowledged
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage acknowledge(NotificationPo notification) {
        return null;
    }
}
