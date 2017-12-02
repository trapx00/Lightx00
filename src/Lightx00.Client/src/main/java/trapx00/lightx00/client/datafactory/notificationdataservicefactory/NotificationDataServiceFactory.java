package trapx00.lightx00.client.datafactory.notificationdataservicefactory;

import javafx.scene.chart.PieChart;
import trapx00.lightx00.client.datafactory.DataServiceFactory;
import trapx00.lightx00.shared.dataservice.financedataservice.CashBillDataService;
import trapx00.lightx00.shared.dataservice.notificationdataservice.NotificationDataService;
import trapx00.lightx00.shared.dataservicestub.notificationdataservice.NotificationDataServiceStub;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class NotificationDataServiceFactory extends DataServiceFactory {
    private static NotificationDataService service = new NotificationDataServiceStub();

    public static void initRmi() {
        service = lookupService(NotificationDataService.class);
    }

    public static NotificationDataService getService() {
        initRmi();
        return service;
    }
}
