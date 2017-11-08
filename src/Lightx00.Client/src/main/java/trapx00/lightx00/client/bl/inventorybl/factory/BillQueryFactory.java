package trapx00.lightx00.client.bl.inventorybl.factory;

import trapx00.lightx00.client.bl.inventorybl.InventoryBillService;
import trapx00.lightx00.client.bl.inventorybl.InventoryWarningBlController;

public class BillQueryFactory {
    private static InventoryBillService inventoryBillService =new InventoryWarningBlController();

    public static InventoryBillService getInventoryBillService(){
        return inventoryBillService;
    }
}
