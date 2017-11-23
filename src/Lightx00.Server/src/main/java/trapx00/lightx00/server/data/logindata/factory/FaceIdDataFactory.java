package trapx00.lightx00.server.data.logindata.factory;

import trapx00.lightx00.server.data.logindata.FaceIdDataController;
import trapx00.lightx00.shared.dataservice.logindataservice.FaceIdAuthenticationDataService;

import java.rmi.RemoteException;

public class FaceIdDataFactory {
    private static FaceIdAuthenticationDataService dataService;

    static {
        try {
            dataService = new FaceIdDataController();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static FaceIdAuthenticationDataService getDataService() {
        return dataService;
    }
}
