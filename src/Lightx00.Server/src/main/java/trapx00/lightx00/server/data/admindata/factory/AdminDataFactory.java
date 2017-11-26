package trapx00.lightx00.server.data.admindata.factory;

import trapx00.lightx00.server.data.admindata.LoginService;
import trapx00.lightx00.server.data.admindata.UserManagementDataController;
import trapx00.lightx00.server.data.admindata.mock.UserManagementDataControllerMock;
import trapx00.lightx00.shared.dataservice.admindataservice.UserManagementDataService;

import java.rmi.RemoteException;

public class AdminDataFactory {
    private static UserManagementDataController service;

    static {
        try {
            service = new UserManagementDataController();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static UserManagementDataService getUserManagementDataService() {
        return service;
    }

    public static LoginService getLoginService() {
        return service;
    }
}
