package trapx00.lightx00.client.bl.inventorybl.factory;

import trapx00.lightx00.client.bl.inventorybl.InventoryBillService;
import trapx00.lightx00.client.bl.inventorybl.InventoryWarningBlController;
import trapx00.lightx00.client.bl.inventorybl.mock.InventoryWarningBlControllerMock;

public class BillQueryServiceFactory {
    private static InventoryBillService inventoryBillService =new InventoryWarningBlControllerMock();

    public static InventoryBillService getInventoryBillService(){
        return inventoryBillService;
    }
}
