package trapx00.lightx00.client.datafactory.admindataservicefactory;

import trapx00.lightx00.client.blservice.adminblservice.FaceIdRegistrationBlService;
import trapx00.lightx00.shared.dataservice.admindataservice.FaceIdRegistrationDataService;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class FaceIdRegistrationDataServiceFactory {
    private static FaceIdRegistrationDataService dataService;

    static {
        try {
            String url = RmiHelper.generateRmiUrl(FaceIdRegistrationDataService.class);
            dataService = (FaceIdRegistrationDataService) Naming.lookup(url);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static FaceIdRegistrationDataService getDataService() {
        return dataService;
    }
}
