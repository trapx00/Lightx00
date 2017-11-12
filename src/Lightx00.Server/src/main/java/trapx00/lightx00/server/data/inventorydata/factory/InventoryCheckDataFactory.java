package trapx00.lightx00.server.data.inventorydata.factory;

import trapx00.lightx00.server.data.inventorydata.mock.InventoryCheckDataControllerMock;
import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryCheckDataService;

public class InventoryCheckDataFactory {

    private static InventoryCheckDataService service=new InventoryCheckDataControllerMock();

    public static InventoryCheckDataService getService(){
        return service;
    }
}
