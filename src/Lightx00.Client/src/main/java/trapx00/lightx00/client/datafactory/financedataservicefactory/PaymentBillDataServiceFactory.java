package trapx00.lightx00.client.datafactory.financedataservicefactory;

import trapx00.lightx00.shared.dataservice.financedataservice.PaymentBillDataService;
import trapx00.lightx00.shared.dataservice.saledataservice.SaleBillDataService;
import trapx00.lightx00.shared.dataservicestub.financedataservice.PaymentBillDataServiceStub;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class PaymentBillDataServiceFactory {
    private static PaymentBillDataService service = new PaymentBillDataServiceStub();

    public static void initRmi() {
        try {
            service = (PaymentBillDataService) Naming.lookup(RmiHelper.generateRmiUrl(PaymentBillDataService.class));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static PaymentBillDataService getService() {
        //initRmi();
        return service;
    }
}
