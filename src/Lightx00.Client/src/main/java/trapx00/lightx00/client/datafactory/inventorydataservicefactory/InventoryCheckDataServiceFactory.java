package trapx00.lightx00.client.datafactory.inventorydataservicefactory;

import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryCheckDataService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class InventoryCheckDataServiceFactory {
    private InventoryCheckDataService inventoryCheckDataService;

    public InventoryCheckDataServiceFactory(){
        try {
            inventoryCheckDataService =(InventoryCheckDataService) Naming.lookup("rmi://localhost:8888/InventoryCheckDataService");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public  InventoryCheckDataService getInstance() {
        return inventoryCheckDataService;
    }
}
