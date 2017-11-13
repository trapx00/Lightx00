package trapx00.lightx00.server.data.financedata.factory;

import trapx00.lightx00.server.data.financedata.mock.InitialEstablishmentDataControllerMock;
import trapx00.lightx00.shared.dataservice.financedataservice.InitialEstablishmentDataService;

import java.rmi.RemoteException;

public class InitialEstablishmentDataFactory {
    private static InitialEstablishmentDataService service;

    static {
        try {
            service = new InitialEstablishmentDataControllerMock();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static InitialEstablishmentDataService getService() {
        return service;
    }
}
