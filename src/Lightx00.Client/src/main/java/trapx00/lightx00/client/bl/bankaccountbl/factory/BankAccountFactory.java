package trapx00.lightx00.client.bl.bankaccountbl.factory;

import trapx00.lightx00.client.bl.bankaccountbl.BankAccountBlController;
import trapx00.lightx00.client.bl.bankaccountbl.BankAccountModificationService;
import trapx00.lightx00.client.bl.bankaccountbl.mock.BankAccountBlControllerMock;

public class BankAccountFactory {
    private static BankAccountBlController controller = new BankAccountBlControllerMock();
    private static BankAccountModificationService modificationService = controller;

    public static BankAccountBlController getController() {
        return controller;
    }

    public static BankAccountModificationService getModificationService() {
        return modificationService;
    }
}
