package trapx00.lightx00.server.data.financedata.factory;

import trapx00.lightx00.server.data.financedata.mock.PaymentBillDataControllerMock;
import trapx00.lightx00.shared.dataservice.financedataservice.PaymentBillDataService;

public class PaymentBillDataFactory {
    private static PaymentBillDataService service = new PaymentBillDataControllerMock();

    public static PaymentBillDataService getService() {
        return service;
    }
}
