package trapx00.lightx00.server.data.saledata.factory;

import trapx00.lightx00.server.data.saledata.mock.SaleRefundBillDataControllerMock;
import trapx00.lightx00.shared.dataservice.saledataservice.SaleRefundBillDataService;

import java.rmi.RemoteException;

public class SaleRefundBillDataFactory {
    private static SaleRefundBillDataService service;

    static {
        try {
            service = new SaleRefundBillDataControllerMock();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static SaleRefundBillDataService getService() {
        return service;
    }
}
