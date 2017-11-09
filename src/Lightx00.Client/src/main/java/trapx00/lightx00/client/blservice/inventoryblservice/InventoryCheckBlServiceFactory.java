package trapx00.lightx00.client.blservice.inventoryblservice;

import trapx00.lightx00.client.bl.inventorybl.InventoryCheckBlController;

public class InventoryCheckBlServiceFactory {

    private static  InventoryCheckBlService instance =new InventoryCheckBlController();
    /**
     * Gets a InventoryCheckBlService instance.
     * @return InventoryCheckBlService instance
     */
    public static InventoryCheckBlService getInstance(){
        return instance;
    }
}
