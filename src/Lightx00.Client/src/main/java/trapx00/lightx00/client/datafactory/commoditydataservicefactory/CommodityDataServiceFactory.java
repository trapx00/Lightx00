package trapx00.lightx00.client.datafactory.commoditydataservicefactory;

import trapx00.lightx00.shared.dataservice.commoditydataservice.CommodityDataService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CommodityDataServiceFactory {
    private CommodityDataService commodityDataService;

    public CommodityDataServiceFactory(){
        try {
            commodityDataService =(CommodityDataService) Naming.lookup("rmi://localhost:8888/CommodityDataService");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public  CommodityDataService getInstance() {
        return commodityDataService;
    }
}
