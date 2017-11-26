package trapx00.lightx00.server.data.draftdata.factory;

import trapx00.lightx00.server.data.draftdata.DraftDataController;
import trapx00.lightx00.server.data.draftdata.mock.DraftDataControllerMock;
import trapx00.lightx00.shared.dataservice.draftdataservice.DraftDataService;

import java.rmi.RemoteException;

public class DraftDataFactory {
    private static DraftDataService service;

    static {
        try {
            service = new DraftDataController();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static DraftDataService getService() {
        return service;
    }
}
