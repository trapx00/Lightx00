package trapx00.lightx00.server.data.saledata.factory;

import trapx00.lightx00.shared.dataservice.saledataservice.SaleRefundBillDataService;
import trapx00.lightx00.shared.dataservicestub.saledataservice.SaleRefundBillDataServiceStub;

public class SaleRefundBillDataFactory {
    private static SaleRefundBillDataService saleRefundBillDataService=new SaleRefundBillDataServiceStub();

    public static SaleRefundBillDataService getSaleRefundBillDataService() {
        return saleRefundBillDataService;
    }
}
