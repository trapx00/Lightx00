package trapx00.lightx00.server.data.bankaccountdata.factory;

import trapx00.lightx00.server.data.bankaccountdata.BankAccountDataController;
import trapx00.lightx00.server.data.bankaccountdata.mock.BankAccountDataControllerMock;
import trapx00.lightx00.shared.dataservice.bankaccountdataservice.BankAccountDataService;

import java.rmi.RemoteException;

public class BankAccountDataFactory {
    private static BankAccountDataService controller;

    static {
        try {
            controller = new BankAccountDataControllerMock();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static BankAccountDataService getController() {
        return controller;
    }
}
