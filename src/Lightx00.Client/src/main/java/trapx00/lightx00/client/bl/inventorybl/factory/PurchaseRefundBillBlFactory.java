package trapx00.lightx00.client.bl.inventorybl.factory;

import trapx00.lightx00.client.bl.inventorybl.PurchaseRefundBillBlController;
import trapx00.lightx00.client.bl.inventorybl.mock.PurchaseRefundBillBlControllerMock;

public class PurchaseRefundBillBlFactory {

    private static PurchaseRefundBillBlController purchaseRefundBillBlController=new PurchaseRefundBillBlControllerMock();

    public static PurchaseRefundBillBlController getPurchaseRefundBillBlController() {
        return purchaseRefundBillBlController;
    }
}
