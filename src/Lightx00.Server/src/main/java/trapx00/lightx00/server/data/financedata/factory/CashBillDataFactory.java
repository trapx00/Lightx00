package trapx00.lightx00.server.data.financedata.factory;

import trapx00.lightx00.server.data.financedata.mock.CashBillDataControllerMock;
import trapx00.lightx00.shared.dataservice.financedataservice.CashBillDataService;

public class CashBillDataFactory {
    private static CashBillDataService service = new CashBillDataControllerMock();

    public static CashBillDataService getService() {
        return service;
    }
}
