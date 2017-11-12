package trapx00.lightx00.server.data.notificationdata.factory;

import trapx00.lightx00.server.data.notificationdata.mock.NotificationDataControllerMock;
import trapx00.lightx00.shared.dataservice.notificationdataservice.NotificationDataService;

public class NotificationDataFactory {
    private static NotificationDataService service = new NotificationDataControllerMock();

    public static NotificationDataService getService() {
        return service;
    }
}
