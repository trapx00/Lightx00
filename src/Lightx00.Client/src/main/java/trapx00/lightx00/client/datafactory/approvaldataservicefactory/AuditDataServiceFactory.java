package trapx00.lightx00.client.datafactory.approvaldataservicefactory;

import trapx00.lightx00.client.datafactory.DataServiceFactory;
import trapx00.lightx00.shared.dataservice.approvaldataservice.AuditDataService;
import trapx00.lightx00.shared.dataservicestub.approvaldataservice.AuditDataServiceStub;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class AuditDataServiceFactory extends DataServiceFactory {

    private static AuditDataService service = new AuditDataServiceStub();

    public static void initRmi() {
        service = lookupService(AuditDataService.class);
    }

    public static AuditDataService getService() {
        initRmi();
        return service;
    }

}
