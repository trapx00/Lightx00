package trapx00.lightx00.server.data.admindata.factory;

import trapx00.lightx00.server.data.admindata.mock.UserManagementDataControllerMock;
import trapx00.lightx00.shared.dataservice.admindataservice.UserManagementDataService;

import java.rmi.RemoteException;

public class AdminDataFactory {
    private static UserManagementDataService controller;

    static {
        try{
            controller = new UserManagementDataControllerMock();
        }catch (RemoteException e){
            e.printStackTrace();
        }
    }

    public static UserManagementDataService getController() {
        return controller;
    }
}
