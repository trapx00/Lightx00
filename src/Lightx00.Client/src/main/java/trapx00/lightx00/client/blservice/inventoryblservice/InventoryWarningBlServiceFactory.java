package trapx00.lightx00.client.blservice.inventoryblservice;

import trapx00.lightx00.client.bl.inventorybl.InventoryWarningBlController;

public class InventoryWarningBlServiceFactory {

    public static InventoryWarningBlService getInstance() {
        return new InventoryWarningBlController();
    }
}
