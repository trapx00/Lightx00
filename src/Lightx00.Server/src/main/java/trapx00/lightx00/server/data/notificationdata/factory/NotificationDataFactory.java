package trapx00.lightx00.server.data.notificationdata.factory;

import trapx00.lightx00.server.data.notificationdata.NotificationDataController;
import trapx00.lightx00.server.data.notificationdata.mock.NotificationDataControllerMock;
import trapx00.lightx00.shared.dataservice.notificationdataservice.NotificationDataService;

import java.rmi.RemoteException;

public class NotificationDataFactory {
    private static NotificationDataService service;

    static {
        try {
            service = new NotificationDataController();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static NotificationDataService getService() {
        return service;
    }
}
