package trapx00.lightx00.server.data.financedata.factory;

import trapx00.lightx00.server.data.financedata.mock.ReceivalBillDataControllerMock;
import trapx00.lightx00.shared.dataservice.financedataservice.ReceivalBillDataService;

public class ReceivalBillDataFactory {
    private static ReceivalBillDataService service = new ReceivalBillDataControllerMock();

    public static ReceivalBillDataService getService() {
        return service;
    }
}
