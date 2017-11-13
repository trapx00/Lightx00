package trapx00.lightx00.server.data.saledata.factory;

import trapx00.lightx00.server.data.saledata.mock.SaleBillDataControllerMock;
import trapx00.lightx00.shared.dataservice.saledataservice.SaleBillDataService;

public class SaleBillDataFactory {
    private static SaleBillDataService saleBillDataService=new SaleBillDataControllerMock();

    public static SaleBillDataService getSaleBillDataService() {
        return saleBillDataService;
    }
}
