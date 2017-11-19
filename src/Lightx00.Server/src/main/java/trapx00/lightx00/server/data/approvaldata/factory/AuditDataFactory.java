package trapx00.lightx00.server.data.approvaldata.factory;


import trapx00.lightx00.server.data.approvaldata.mock.AuditDataControllerMock;
import trapx00.lightx00.shared.dataservice.approvaldataservice.AuditDataService;

import java.rmi.RemoteException;

public class AuditDataFactory {
    private static AuditDataService service;

    static {
        try {
            service = new AuditDataControllerMock();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static AuditDataService getService() {
        return service;
    }
}
