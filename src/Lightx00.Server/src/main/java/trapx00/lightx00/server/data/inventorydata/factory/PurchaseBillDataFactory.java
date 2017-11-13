package trapx00.lightx00.server.data.inventorydata.factory;

import trapx00.lightx00.server.data.inventorydata.mock.PurchaseBillDataControllerMock;
import trapx00.lightx00.shared.dataservice.inventorydataservice.PurchaseBillDataService;

public class PurchaseBillDataFactory {
    private static PurchaseBillDataService purchaseBillDataService = new PurchaseBillDataControllerMock();

    public static PurchaseBillDataService getPurchaseBillDataService() {
        return purchaseBillDataService;
    }
}
