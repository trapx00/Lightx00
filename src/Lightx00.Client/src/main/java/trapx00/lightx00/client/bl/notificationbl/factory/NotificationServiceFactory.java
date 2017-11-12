package trapx00.lightx00.client.bl.notificationbl.factory;

import trapx00.lightx00.client.bl.notificationbl.NotificationBlController;
import trapx00.lightx00.client.bl.notificationbl.NotificationService;
import trapx00.lightx00.client.bl.notificationbl.mock.NotificationBlControllerMock;

public class NotificationServiceFactory {
    private static NotificationService notificationService = new NotificationBlControllerMock();

    /**
     * Gets a NotificationService instance
     * @return a NotificationService instance
     */
    public static NotificationService getNotificationService() {
        return notificationService;
    }
}