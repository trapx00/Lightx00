package trapx00.lightx00.server.data.financedata.factory;

import trapx00.lightx00.server.data.financedata.mock.CashBillDataControllerMock;
import trapx00.lightx00.shared.dataservice.financedataservice.CashBillDataService;

import java.rmi.RemoteException;

public class CashBillDataFactory {
    private static CashBillDataService service;

    static {
        try {
            service = new CashBillDataControllerMock();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static CashBillDataService getService() {
        return service;
    }
}
