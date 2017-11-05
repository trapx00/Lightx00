package trapx00.lightx00.client.blservice.notificationblservice;

import trapx00.lightx00.client.bl.notificationbl.NotificationBlController;

public class NotificationBlServiceFactory {
    private NotificationBlService instance = new NotificationBlController();

    public NotificationBlService getInstance() {
        return instance;
    }
}
