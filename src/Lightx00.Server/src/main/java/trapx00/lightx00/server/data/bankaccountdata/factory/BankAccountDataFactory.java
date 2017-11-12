package trapx00.lightx00.server.data.bankaccountdata.factory;

import trapx00.lightx00.server.data.bankaccountdata.BankAccountDataController;
import trapx00.lightx00.server.data.bankaccountdata.mock.BankAccountDataControllerMock;
import trapx00.lightx00.shared.dataservice.bankaccountdataservice.BankAccountDataService;

public class BankAccountDataFactory {
    private static BankAccountDataService controller = new BankAccountDataControllerMock();

    public static BankAccountDataService getController() {
        return controller;
    }
}
