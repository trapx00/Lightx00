package trapx00.lightx00.client.datafactory.financedataservicefactory;

import javafx.scene.chart.PieChart;
import trapx00.lightx00.client.datafactory.DataServiceFactory;
import trapx00.lightx00.shared.dataservice.financedataservice.ReceivalBillDataService;
import trapx00.lightx00.shared.dataservicestub.financedataservice.ReceivalBillDataServiceStub;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ReceivalBillDataServiceFactory extends DataServiceFactory {
    private static ReceivalBillDataService service = new ReceivalBillDataServiceStub();

    public static void initRmi() {
        service = lookupService(ReceivalBillDataService.class);
    }

    public ReceivalBillDataService getService() {
        //initRmi();
        return service;
    }
}
