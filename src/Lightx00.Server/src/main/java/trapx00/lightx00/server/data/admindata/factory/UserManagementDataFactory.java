package trapx00.lightx00.server.data.admindata.factory;

import trapx00.lightx00.server.data.admindata.mock.UserManagementDataControllerMock;
import trapx00.lightx00.shared.dataservice.admindataservice.UserManagementDataService;

import java.rmi.RemoteException;

public class UserManagementDataFactory {
    private static UserManagementDataService service;

    static {
        try {
            service = new UserManagementDataControllerMock();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static UserManagementDataService getService() {
        return service;
    }
}
