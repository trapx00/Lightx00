package trapx00.lightx00.client.datafactory.logindataservicefactory;

import trapx00.lightx00.client.datafactory.DataServiceFactory;
import trapx00.lightx00.shared.dataservice.logdataservice.LogDataService;
import trapx00.lightx00.shared.dataservice.logindataservice.LoginDataService;
import trapx00.lightx00.shared.dataservicestub.logindataservice.LoginDataServiceStub;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class LoginDataServiceFactory extends DataServiceFactory {
    private static LoginDataService service = new LoginDataServiceStub();

    private static void initRmi() {
        service = lookupService(LoginDataService.class);
    }

    public static LoginDataService getService() {
        initRmi();
        return service;
    }
}
