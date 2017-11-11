package trapx00.lightx00.client.datafactory.logdataservicefactory;

import trapx00.lightx00.shared.dataservice.financedataservice.InitialEstablishmentDataService;
import trapx00.lightx00.shared.dataservice.logdataservice.LogDataService;
import trapx00.lightx00.shared.dataservicestub.logdataservice.LogDataServiceStub;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class LogDataServiceFactory {
    private static LogDataService service = new LogDataServiceStub();

    public static void initRmi() {
        try {
            service = (LogDataService) Naming.lookup(RmiHelper.generateRmiUrl(LogDataService.class));

        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static LogDataService getService() {
        //initRmi();
        return service;
    }
}
