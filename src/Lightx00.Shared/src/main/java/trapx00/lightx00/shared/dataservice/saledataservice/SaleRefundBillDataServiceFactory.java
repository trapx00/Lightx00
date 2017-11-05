package trapx00.lightx00.shared.dataservice.saledataservice;

import trapx00.lightx00.shared.data.saledata.SaleRefundBillController;

public class SaleRefundBillDataServiceFactory {

    SaleRefundBillDataService saleRefundBillDataService=new SaleRefundBillController();

    public SaleRefundBillDataService getInstance() {
        return saleRefundBillDataService;
    }
}
