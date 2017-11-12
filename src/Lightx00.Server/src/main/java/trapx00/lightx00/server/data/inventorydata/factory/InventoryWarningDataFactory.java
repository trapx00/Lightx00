package trapx00.lightx00.server.data.inventorydata.factory;

import trapx00.lightx00.server.data.inventorydata.mock.InventoryWarningDataControllerMock;
import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryWarningDataService;

public class InventoryWarningDataFactory {

    private static InventoryWarningDataService service=new InventoryWarningDataControllerMock();

    public static InventoryWarningDataService getService(){
        return service;
    }
}
