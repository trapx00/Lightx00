package trapx00.lightx00.client.datafactory.inventorydataservicefactory;

import trapx00.lightx00.shared.dataservice.inventorydataservice.PurchaseBillDataService;
import trapx00.lightx00.shared.dataservice.saledataservice.SaleBillDataService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class PurchaseBillDataServiceFactory {

    private PurchaseBillDataService purchaseBillDataService;

    public PurchaseBillDataServiceFactory(){
        try {
            purchaseBillDataService =(PurchaseBillDataService) Naming.lookup("rmi://localhost:8888/PurchaseBillDataService");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public PurchaseBillDataService getInstance() {
        return purchaseBillDataService;
    }
}
