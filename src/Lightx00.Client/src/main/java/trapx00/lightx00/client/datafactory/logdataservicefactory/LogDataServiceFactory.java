package trapx00.lightx00.client.datafactory.logdataservicefactory;

import javafx.scene.chart.PieChart;
import trapx00.lightx00.client.datafactory.DataServiceFactory;
import trapx00.lightx00.shared.dataservice.financedataservice.InitialEstablishmentDataService;
import trapx00.lightx00.shared.dataservice.logdataservice.LogDataService;
import trapx00.lightx00.shared.dataservicestub.logdataservice.LogDataServiceStub;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class LogDataServiceFactory extends DataServiceFactory {
    private static LogDataService service = new LogDataServiceStub();

    public static void initRmi() {
        service = lookupService(LogDataService.class);
    }

    public static LogDataService getService() {
        initRmi();
        return service;
    }
}
