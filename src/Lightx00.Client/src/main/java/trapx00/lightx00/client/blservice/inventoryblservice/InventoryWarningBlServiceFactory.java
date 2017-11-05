package trapx00.lightx00.client.blservice.inventoryblservice;

import trapx00.lightx00.client.bl.inventorybl.InventoryWarningBlController;

public class InventoryWarningBlServiceFactory {
    private static  InventoryWarningBlService instance =new InventoryWarningBlController();
    /**
     * Gets a InventoryWarningBlServiceinstance.
     * @return InventoryWarningBlService instance
     */
    public static InventoryWarningBlService getInstance() {
        return instance;
    }
}
