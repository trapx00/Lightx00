package trapx00.lightx00.client.datafactory.logindataservicefactory;

import trapx00.lightx00.shared.dataservice.logindataservice.FaceIdAuthenticationDataService;
import trapx00.lightx00.shared.dataservicestub.logindataservice.FaceIdAuthenticationDataServiceStub;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class FaceIdAuthenticationDataServiceFactory {
    private static FaceIdAuthenticationDataService service = new FaceIdAuthenticationDataServiceStub();

    public static void initRmi() {
        try {
            service = (FaceIdAuthenticationDataService) Naming.lookup(RmiHelper.generateRmiUrl(FaceIdAuthenticationDataService.class));

        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static FaceIdAuthenticationDataService getService() {
        initRmi();
        return service;
    }
}
