package trapx00.lightx00.server.data.saledata.factory;

import trapx00.lightx00.server.data.saledata.mock.SaleBillDataControllerMock;
import trapx00.lightx00.shared.dataservice.saledataservice.SaleBillDataService;

import java.rmi.RemoteException;

public class SaleBillDataFactory {
    private static SaleBillDataService service;

    static {
        try {
            service = new SaleBillDataControllerMock();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static SaleBillDataService getService() {
        return service;
    }
}
