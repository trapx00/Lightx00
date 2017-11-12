package trapx00.lightx00.client.datafactory.commoditydataservicefactory;

import trapx00.lightx00.shared.dataservice.commoditydataservice.CommoditySortDataService;
import trapx00.lightx00.shared.dataservicestub.commoditydataservice.CommoditySortDataServiceStub;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CommoditySortDataServiceFactory {
    private static CommoditySortDataService service = new CommoditySortDataServiceStub();

    private static void initRmi() {

        try {
            service = ( CommoditySortDataService) Naming.lookup(RmiHelper.generateRmiUrl( CommoditySortDataService.class));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static  CommoditySortDataService getService() {
        //initRmi(); //when the rmi is functional, uncomment this to use rmi instead of stub.
        return service;
    }
}
