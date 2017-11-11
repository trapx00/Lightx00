package trapx00.lightx00.client.datafactory.draftdataservicefactory;

import trapx00.lightx00.shared.dataservice.draftdataservice.DraftManagementDataService;
import trapx00.lightx00.shared.dataservice.financedataservice.CashBillDataService;
import trapx00.lightx00.shared.dataservicestub.draftdataservice.DraftManagementDataServiceStub;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class DraftDataServiceFactory {
    private static DraftManagementDataService service = new DraftManagementDataServiceStub();

    private static void initRmi() {

        try {
            service = (DraftManagementDataService) Naming.lookup(RmiHelper.generateRmiUrl(DraftManagementDataService.class));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static DraftManagementDataService getService() {
        //initRmi(); //when the rmi is functional, uncomment this to use rmi instead of stub.
        return service;
    }
}
