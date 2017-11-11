package trapx00.lightx00.client.datafactory.financedataservicefactory;

import trapx00.lightx00.shared.dataservice.financedataservice.CashBillDataService;
import trapx00.lightx00.shared.dataservicestub.financedataservice.CashBillDataServiceStub;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CashBillDataServiceFactory {
    private static CashBillDataService service = new CashBillDataServiceStub();

    public static void initRmi() {
        try {
            service = (CashBillDataService)Naming.lookup(RmiHelper.generateRmiUrl(CashBillDataService.class));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public CashBillDataService getService() {
        //initRmi();
        return service;
    }
}
