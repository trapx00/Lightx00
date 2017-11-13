package trapx00.lightx00.server.data.inventorydata.factory;

import trapx00.lightx00.server.data.inventorydata.mock.InventoryCheckDataControllerMock;
import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryCheckDataService;

import java.rmi.RemoteException;

public class InventoryCheckDataFactory {

    private static InventoryCheckDataService controller;

    static{
        try {
            controller = new InventoryCheckDataControllerMock();
        }catch (RemoteException e){
            e.printStackTrace();
        }
    }

    public static InventoryCheckDataService getService(){
        return controller;
    }
}
