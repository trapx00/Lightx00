package trapx00.lightx00.client.blservice.inventoryblservice;

import trapx00.lightx00.client.bl.inventorybl.InventoryGiftBlController;

public class InventoryGiftBlServiceFactory {

    public static InventoryGiftBlService getInstance(){
        return  new InventoryGiftBlController();
    }
}
