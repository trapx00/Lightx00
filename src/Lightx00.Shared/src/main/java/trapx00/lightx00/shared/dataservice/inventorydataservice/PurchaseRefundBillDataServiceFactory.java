package trapx00.lightx00.shared.dataservice.inventorydataservice;

import trapx00.lightx00.shared.data.inventorydata.PurchaseRefundBillDataController;

public class PurchaseRefundBillDataServiceFactory {

    PurchaseRefundBillDataService purchaseRefundBillDataService=new PurchaseRefundBillDataController();

    public PurchaseRefundBillDataService getInstance() {
        return purchaseRefundBillDataService;
    }
}
