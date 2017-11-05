package trapx00.lightx00.client.blservice.bankaccountblservice;

import trapx00.lightx00.client.bl.bankaccountbl.BankAccountBlController;

public class BankAccountManagementBlServiceFactory {
    private static BankAccountManagementBlService instance = new BankAccountBlController();

    public static BankAccountManagementBlService getInstance() {
        return instance;
    }
}
