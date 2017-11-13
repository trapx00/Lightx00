package trapx00.lightx00.server.data.inventorydata.factory;

import trapx00.lightx00.server.data.inventorydata.mock.PurchaseBillDataControllerMock;
import trapx00.lightx00.server.data.inventorydata.mock.PurchaseRefundBillDataControllerMock;
import trapx00.lightx00.shared.dataservice.inventorydataservice.PurchaseBillDataService;
import trapx00.lightx00.shared.dataservice.inventorydataservice.PurchaseRefundBillDataService;

import java.rmi.RemoteException;

public class PurchaseRefundBillDataFactory {
    private static PurchaseRefundBillDataService service;

    static {
        try {
            service = new PurchaseRefundBillDataControllerMock();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static PurchaseRefundBillDataService getService() {
        return service;
    }
}
