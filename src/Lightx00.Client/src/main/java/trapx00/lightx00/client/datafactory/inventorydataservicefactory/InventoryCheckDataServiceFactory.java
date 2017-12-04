package trapx00.lightx00.client.datafactory.inventorydataservicefactory;

import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryCheckDataService;
import trapx00.lightx00.shared.dataservicestub.inventorydataservice.InventoryCheckDataServiceStub;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import static trapx00.lightx00.client.datafactory.DataServiceFactory.lookupService;

public class InventoryCheckDataServiceFactory {
    private static InventoryCheckDataService service = new InventoryCheckDataServiceStub();

    public static void initRmi() {
        service = lookupService(InventoryCheckDataService.class);
    }

    public static  InventoryCheckDataService getService() {
        initRmi();
        return service;
    }
}
