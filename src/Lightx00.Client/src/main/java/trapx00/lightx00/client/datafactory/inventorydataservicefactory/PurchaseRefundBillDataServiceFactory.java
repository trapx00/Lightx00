package trapx00.lightx00.client.datafactory.inventorydataservicefactory;

import trapx00.lightx00.shared.dataservice.inventorydataservice.PurchaseRefundBillDataService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class PurchaseRefundBillDataServiceFactory {

    private PurchaseRefundBillDataService purchaseRefundBillDataService;

    public PurchaseRefundBillDataServiceFactory(){
        try {
            purchaseRefundBillDataService =(PurchaseRefundBillDataService) Naming.lookup("rmi://localhost:8888/PurchaseRefundBillDataService");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public PurchaseRefundBillDataService getInstance() {
        return purchaseRefundBillDataService;
    }
}
