package trapx00.lightx00.client.datafactory.inventorydataservicefactory;

import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryCheckDataService;
import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryGiftDataService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class InventoryGiftDataServiceFactory {
    private InventoryGiftDataService inventoryGiftDataService;

    public InventoryGiftDataServiceFactory(){
        try {
            inventoryGiftDataService =(InventoryGiftDataService) Naming.lookup("rmi://localhost:8888/InventoryGiftDataService");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public  InventoryGiftDataService getInstance() {
        return inventoryGiftDataService;
    }


}
