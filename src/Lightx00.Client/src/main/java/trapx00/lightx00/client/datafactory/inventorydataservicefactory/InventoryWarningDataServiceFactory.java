package trapx00.lightx00.client.datafactory.inventorydataservicefactory;

import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryWarningDataService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class InventoryWarningDataServiceFactory {
    private InventoryWarningDataService inventoryWarningDataService;

    public InventoryWarningDataServiceFactory(){
        try {
            inventoryWarningDataService =(InventoryWarningDataService) Naming.lookup("rmi://localhost:8888/InventoryWarningDataService");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public  InventoryWarningDataService getInstance() {
        return inventoryWarningDataService;
    }
}
