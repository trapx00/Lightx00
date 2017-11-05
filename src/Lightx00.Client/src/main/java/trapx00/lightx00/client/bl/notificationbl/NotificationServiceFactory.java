package trapx00.lightx00.client.bl.notificationbl;

import trapx00.lightx00.client.bl.notificationbl.NotificationBlController;
import trapx00.lightx00.client.bl.notificationbl.NotificationService;

public class NotificationServiceFactory {
    /**
     * Gets a NotificationService instance
     * @return a NotificationService instance
     */
    public static NotificationService getInstance() {
        return new NotificationBlController();
    }
}
