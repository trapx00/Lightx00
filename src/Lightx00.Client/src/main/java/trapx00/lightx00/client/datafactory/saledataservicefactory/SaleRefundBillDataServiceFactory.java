package trapx00.lightx00.client.datafactory.saledataservicefactory;

import trapx00.lightx00.shared.dataservice.saledataservice.SaleRefundBillDataService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class SaleRefundBillDataServiceFactory {

    private SaleRefundBillDataService saleRefundBillDataService;

    public SaleRefundBillDataServiceFactory(){
        try {
            saleRefundBillDataService =(SaleRefundBillDataService) Naming.lookup("rmi://localhost:8888/SaleRefundBillDataService");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public SaleRefundBillDataService getInstance() {
        return saleRefundBillDataService;
    }
}
