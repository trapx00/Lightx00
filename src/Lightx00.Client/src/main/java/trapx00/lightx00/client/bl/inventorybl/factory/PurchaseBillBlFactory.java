package trapx00.lightx00.client.bl.inventorybl.factory;

import trapx00.lightx00.client.bl.inventorybl.PurchaseBillBlController;
import trapx00.lightx00.client.bl.inventorybl.mock.PurchaseBillBlControllerMock;

public class PurchaseBillBlFactory {

    private static PurchaseBillBlController purchaseBillBlController=new PurchaseBillBlControllerMock();

    public static PurchaseBillBlController getPurchaseBillBlController() {
        return purchaseBillBlController;
    }
}
