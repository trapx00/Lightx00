package trapx00.lightx00.server.data.admindata.factory;

import trapx00.lightx00.server.data.admindata.FaceIdRegistrationDataController;
import trapx00.lightx00.shared.dataservice.admindataservice.FaceIdRegistrationDataService;

import java.rmi.RemoteException;

public class FaceIdRegistrationDataFactory {
    private static FaceIdRegistrationDataService service;

    public static FaceIdRegistrationDataService getService() {
        return service;
    }

    static {
        try {
            service = new FaceIdRegistrationDataController();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
