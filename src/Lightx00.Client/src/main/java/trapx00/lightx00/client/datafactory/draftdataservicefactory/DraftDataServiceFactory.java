package trapx00.lightx00.client.datafactory.draftdataservicefactory;

import trapx00.lightx00.shared.dataservice.draftdataservice.DraftDataService;
import trapx00.lightx00.shared.dataservicestub.draftdataservice.DraftDataServiceStub;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class DraftDataServiceFactory {
    private static DraftDataService service = new DraftDataServiceStub();

    private static void initRmi() {

        try {
            service = (DraftDataService) Naming.lookup(RmiHelper.generateRmiUrl(DraftDataService.class));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static DraftDataService getService() {
        //initRmi(); //when the rmi is functional, uncomment this to use rmi instead of stub.
        return service;
    }
}
