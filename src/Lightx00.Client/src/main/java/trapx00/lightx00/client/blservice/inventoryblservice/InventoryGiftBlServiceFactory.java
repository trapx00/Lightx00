package trapx00.lightx00.client.blservice.inventoryblservice;

import trapx00.lightx00.client.bl.inventorybl.InventoryGiftBlController;

public class InventoryGiftBlServiceFactory {

    private static  InventoryGiftBlService instance =new InventoryGiftBlController();
    /**
     * Gets a InventoryGiftBlService instance.
     * @return InventoryGiftBlService instance
     */
    public static InventoryGiftBlService getInstance(){
        return  instance;
    }
}
