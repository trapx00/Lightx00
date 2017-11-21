package trapx00.lightx00.server.data.draftdata.factory;

import trapx00.lightx00.server.data.draftdata.mock.DraftDataControllerMock;
import trapx00.lightx00.shared.dataservice.draftdataservice.DraftManagementDataService;

import java.rmi.RemoteException;

public class DraftDataFactory {
    private static DraftManagementDataService service;

    static {
        try {
            service = new DraftDataControllerMock();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static DraftManagementDataService getService() {
        return service;
    }
}
