package trapx00.lightx00.client.datafactory.commoditydataservicefactory;

import trapx00.lightx00.shared.dataservice.commoditydataservice.CommoditySortDataService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CommoditySortDataServiceFactory {
    private CommoditySortDataService commoditySortDataService;

    public CommoditySortDataServiceFactory(){
        try {
            commoditySortDataService =(CommoditySortDataService) Naming.lookup("rmi://localhost:8888/CommoditySortDataService");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public  CommoditySortDataService getInstance() {
        return commoditySortDataService;
    }
}
