package trapx00.lightx00.client.datafactory.notificationdataservicefactory;

import trapx00.lightx00.shared.dataservice.financedataservice.CashBillDataService;
import trapx00.lightx00.shared.dataservice.notificationdataservice.NotificationDataService;
import trapx00.lightx00.shared.dataservicestub.notificationdataservice.NotificationDataServiceStub;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class NotificationDataServiceFactory {
    private static NotificationDataService service = new NotificationDataServiceStub();

    public static void initRmi() {
        try {
            service = (NotificationDataService) Naming.lookup(RmiHelper.generateRmiUrl(NotificationDataService.class));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public NotificationDataService getService() {
        //initRmi();
        return service;
    }
}
