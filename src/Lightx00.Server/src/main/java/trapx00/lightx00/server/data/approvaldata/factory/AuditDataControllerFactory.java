package trapx00.lightx00.server.data.approvaldata.factory;


import trapx00.lightx00.server.data.approvaldata.mock.AuditDataControllerMock;
import trapx00.lightx00.shared.dataservice.approvaldataservice.AuditDataService;

import java.rmi.RemoteException;

public class AuditDataControllerFactory {
    private static AuditDataService controller;

    static {
        try{
            controller = new AuditDataControllerMock();
        }catch (RemoteException e){
            e.printStackTrace();
        }
    }

    public static AuditDataService getController() {
        return controller;
    }
}
