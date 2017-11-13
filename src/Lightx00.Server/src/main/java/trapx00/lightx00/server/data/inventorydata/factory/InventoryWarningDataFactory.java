package trapx00.lightx00.server.data.inventorydata.factory;

import trapx00.lightx00.server.data.inventorydata.mock.InventoryWarningDataControllerMock;
import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryWarningDataService;

import java.rmi.RemoteException;

public class InventoryWarningDataFactory {

    private static InventoryWarningDataService controller;

    static{
        try {
            controller = new InventoryWarningDataControllerMock();
        }catch (RemoteException e){
            e.printStackTrace();
        }
    }

    public static InventoryWarningDataService getService(){
        return controller;
    }
}
