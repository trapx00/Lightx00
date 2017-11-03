package trapx00.lightx00.client.bl.notificationbl;

public class NotificationServiceFactory {
    /**
     * Gets a NotificationService instance
     * @return a NotificationService instance
     */
    public static NotificationService getInstance() {
        return new NotificationBlController();
    }
}
