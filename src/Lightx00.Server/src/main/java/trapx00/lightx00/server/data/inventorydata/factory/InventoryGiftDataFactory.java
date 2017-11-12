package trapx00.lightx00.server.data.inventorydata.factory;

import trapx00.lightx00.server.data.inventorydata.mock.InventoryGiftDataControllerMock;
import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryGiftDataService;

public class InventoryGiftDataFactory {

    private static InventoryGiftDataService service=new InventoryGiftDataControllerMock();

    public static InventoryGiftDataService getService(){
        return service;
    }

}
