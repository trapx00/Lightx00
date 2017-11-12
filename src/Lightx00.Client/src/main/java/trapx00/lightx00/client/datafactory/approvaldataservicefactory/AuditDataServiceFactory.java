package trapx00.lightx00.client.datafactory.approvaldataservicefactory;

import trapx00.lightx00.shared.dataservice.approvaldataservice.AuditDataService;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class AuditDataServiceFactory {

    private AuditDataService auditDataService;

    public AuditDataServiceFactory() {
        try {
            auditDataService = (AuditDataService) Naming.lookup(RmiHelper.generateRmiUrl(AuditDataService.class));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public AuditDataService getInstance() {
        return auditDataService;
    }

}
