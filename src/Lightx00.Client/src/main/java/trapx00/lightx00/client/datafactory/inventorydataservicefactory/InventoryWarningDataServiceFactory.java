package trapx00.lightx00.client.datafactory.inventorydataservicefactory;

import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryWarningDataService;
import trapx00.lightx00.shared.dataservicestub.inventorydataservice.InventoryWarningDataServiceStub;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import static trapx00.lightx00.client.datafactory.DataServiceFactory.lookupService;

public class InventoryWarningDataServiceFactory {

    private static InventoryWarningDataService service = new InventoryWarningDataServiceStub();

    public static void initRmi() {
        service = lookupService(InventoryWarningDataService.class);
    }

    public static InventoryWarningDataService getService() {
        initRmi();
        return service;
    }
}
