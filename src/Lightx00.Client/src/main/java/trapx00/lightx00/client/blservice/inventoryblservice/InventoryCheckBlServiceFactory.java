package trapx00.lightx00.client.blservice.inventoryblservice;

import trapx00.lightx00.client.bl.inventorybl.InventoryCheckBlController;
import trapx00.lightx00.client.bl.inventorybl.factory.InventoryCheckServiceFactory;

public class InventoryCheckBlServiceFactory {


    /**
     * Gets a InventoryCheckBlService instance.
     * @return InventoryCheckBlService instance
     */
    public static InventoryCheckBlService getInstance(){
        return InventoryCheckServiceFactory.getInventoryCheckBlController();
    }
}
