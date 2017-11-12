package trapx00.lightx00.client.datafactory.financedataservicefactory;

import trapx00.lightx00.client.bl.financebl.factory.InitialEstablishmentBillFactory;
import trapx00.lightx00.shared.dataservice.financedataservice.InitialEstablishmentDataService;
import trapx00.lightx00.shared.dataservicestub.financedataservice.InitialEstablishmentDataServiceStub;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class InitialEstablishmentDataServiceFactory {
    private static InitialEstablishmentDataService service = new InitialEstablishmentDataServiceStub();

    public static void initRmi() {
        try {
            service = (InitialEstablishmentDataService) Naming.lookup(RmiHelper.generateRmiUrl(InitialEstablishmentDataService.class));

        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static InitialEstablishmentDataService getService() {
        //initRmi();
        return service;
    }
}
