package trapx00.lightx00.client.datafactory.financedataservicefactory;

import trapx00.lightx00.client.bl.financebl.factory.InitialEstablishmentBlFactory;
import trapx00.lightx00.client.datafactory.DataServiceFactory;
import trapx00.lightx00.shared.dataservice.financedataservice.InitialEstablishmentDataService;
import trapx00.lightx00.shared.dataservicestub.financedataservice.InitialEstablishmentDataServiceStub;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class InitialEstablishmentDataServiceFactory extends DataServiceFactory {
    private static InitialEstablishmentDataService service = new InitialEstablishmentDataServiceStub();

    public static void initRmi() {
        service = lookupService(InitialEstablishmentDataService.class);
    }

    public static InitialEstablishmentDataService getService() {
        initRmi();
        return service;
    }
}
