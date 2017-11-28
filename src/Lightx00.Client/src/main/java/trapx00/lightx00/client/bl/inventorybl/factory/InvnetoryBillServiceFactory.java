package trapx00.lightx00.client.bl.inventorybl.factory;

import trapx00.lightx00.client.bl.inventorybl.InventoryBillService;
import trapx00.lightx00.client.bl.inventorybl.InventoryWarningBlController;
import trapx00.lightx00.client.bl.inventorybl.mock.InventoryBillServiceControllerMock;
import trapx00.lightx00.client.bl.inventorybl.mock.InventoryWarningBlControllerMock;

public class InvnetoryBillServiceFactory {
    private static InventoryBillService inventoryBillService =new InventoryBillServiceControllerMock();

    public static InventoryBillService getInventoryBillService(){
        return inventoryBillService;
    }
}
