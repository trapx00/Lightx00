package trapx00.lightx00.client.datafactory.admindataservicefactory;

import trapx00.lightx00.shared.dataservice.admindataservice.UserManagementDataService;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class UserManagementDataServiceFactory {

    private UserManagementDataService userManagementDataService;

    public UserManagementDataServiceFactory() {
        try {
            userManagementDataService = (UserManagementDataService) Naming.lookup(RmiHelper.generateRmiUrl(UserManagementDataService.class));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public UserManagementDataService getInstance() {
        return userManagementDataService;
    }
}
