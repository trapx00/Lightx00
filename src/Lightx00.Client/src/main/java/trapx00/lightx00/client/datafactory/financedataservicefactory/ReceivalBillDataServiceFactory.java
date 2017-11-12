package trapx00.lightx00.client.datafactory.financedataservicefactory;

import trapx00.lightx00.shared.dataservice.financedataservice.ReceivalBillDataService;
import trapx00.lightx00.shared.dataservicestub.financedataservice.ReceivalBillDataServiceStub;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ReceivalBillDataServiceFactory {
    private static ReceivalBillDataService service = new ReceivalBillDataServiceStub();

    public static void initRmi() {
        try {
            service = (ReceivalBillDataService) Naming.lookup(RmiHelper.generateRmiUrl(ReceivalBillDataService.class));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public ReceivalBillDataService getService() {
        //initRmi();
        return service;
    }
}
