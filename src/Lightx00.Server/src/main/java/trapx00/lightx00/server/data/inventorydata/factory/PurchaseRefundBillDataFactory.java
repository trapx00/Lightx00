package trapx00.lightx00.server.data.inventorydata.factory;

import trapx00.lightx00.server.data.inventorydata.mock.PurchaseBillDataControllerMock;
import trapx00.lightx00.server.data.inventorydata.mock.PurchaseRefundBillDataControllerMock;
import trapx00.lightx00.shared.dataservice.inventorydataservice.PurchaseBillDataService;
import trapx00.lightx00.shared.dataservice.inventorydataservice.PurchaseRefundBillDataService;

public class PurchaseRefundBillDataFactory {
    private static PurchaseRefundBillDataService purchaseRefundBillDataService = new PurchaseRefundBillDataControllerMock();

    public static PurchaseRefundBillDataService getPurchaseRefundBillDataService() {
        return purchaseRefundBillDataService;
    }
}
