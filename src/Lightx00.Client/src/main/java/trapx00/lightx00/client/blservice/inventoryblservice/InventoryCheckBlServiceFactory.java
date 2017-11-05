package trapx00.lightx00.client.blservice.inventoryblservice;

import trapx00.lightx00.client.bl.inventorybl.InventoryCheckBlController;

public class InventoryCheckBlServiceFactory {

    public static InventoryCheckBlService getInstance(){
        return new InventoryCheckBlController();
    }
}
