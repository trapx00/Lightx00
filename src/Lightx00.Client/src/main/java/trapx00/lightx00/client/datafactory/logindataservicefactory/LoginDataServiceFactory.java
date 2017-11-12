package trapx00.lightx00.client.datafactory.logindataservicefactory;

import trapx00.lightx00.shared.dataservice.logdataservice.LogDataService;
import trapx00.lightx00.shared.dataservice.logindataservice.LoginDataService;
import trapx00.lightx00.shared.dataservicestub.logindataservice.LoginDataServiceStub;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class LoginDataServiceFactory {
    private static LoginDataService service = new LoginDataServiceStub();

    public static void initRmi() {
        try {
            service = (LoginDataService) Naming.lookup(RmiHelper.generateRmiUrl(LoginDataService.class));

        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public LoginDataService getService() {
        //initRmi();
        return service;
    }
}
