package trapx00.lightx00.client.datafactory.financedataservicefactory;

import trapx00.lightx00.client.datafactory.DataServiceFactory;
import trapx00.lightx00.shared.dataservice.financedataservice.CashBillDataService;
import trapx00.lightx00.shared.dataservicestub.financedataservice.CashBillDataServiceStub;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CashBillDataServiceFactory  extends DataServiceFactory {
    private static CashBillDataService service = new CashBillDataServiceStub();

    public static void initRmi() {
        service = lookupService(CashBillDataService.class);
    }

    public static CashBillDataService getService() {
        initRmi();
        return service;
    }
}
