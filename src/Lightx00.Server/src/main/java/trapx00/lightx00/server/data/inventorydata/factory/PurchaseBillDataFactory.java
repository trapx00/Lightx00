package trapx00.lightx00.server.data.inventorydata.factory;

import trapx00.lightx00.server.data.inventorydata.mock.PurchaseBillDataControllerMock;
import trapx00.lightx00.shared.dataservice.inventorydataservice.PurchaseBillDataService;

import java.rmi.RemoteException;

public class PurchaseBillDataFactory {
    private static PurchaseBillDataService service;

    static {
        try {
            service = new PurchaseBillDataControllerMock();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static PurchaseBillDataService getService() {
        return service;
    }
}
