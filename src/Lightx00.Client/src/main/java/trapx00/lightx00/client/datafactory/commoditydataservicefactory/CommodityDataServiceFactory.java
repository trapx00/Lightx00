package trapx00.lightx00.client.datafactory.commoditydataservicefactory;

import trapx00.lightx00.shared.dataservice.commoditydataservice.CommodityDataService;
import trapx00.lightx00.shared.dataservicestub.commoditydataservice.CommodityDataServiceStub;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CommodityDataServiceFactory {
    private static CommodityDataService service = new CommodityDataServiceStub();

    private static void initRmi() {

        try {
            service = (CommodityDataService) Naming.lookup(RmiHelper.generateRmiUrl(CommodityDataService.class));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static CommodityDataService getService() {
        //initRmi(); //when the rmi is functional, uncomment this to use rmi instead of stub.
        return service;
    }
}
