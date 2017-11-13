package trapx00.lightx00.server.data.financedata.factory;

import trapx00.lightx00.server.data.financedata.mock.ReceivalBillDataControllerMock;
import trapx00.lightx00.shared.dataservice.financedataservice.ReceivalBillDataService;

import java.rmi.RemoteException;

public class ReceivalBillDataFactory {
    private static ReceivalBillDataService service;

    static {
        try {
            service = new ReceivalBillDataControllerMock();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static ReceivalBillDataService getService() {
        return service;
    }
}
