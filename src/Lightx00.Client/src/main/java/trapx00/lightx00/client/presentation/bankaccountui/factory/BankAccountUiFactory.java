package trapx00.lightx00.client.presentation.bankaccountui.factory;

import trapx00.lightx00.client.presentation.bankaccountui.BankAccountInfoUi;
import trapx00.lightx00.client.presentation.bankaccountui.BankAccountUiController;
import trapx00.lightx00.client.presentation.bankaccountui.mock.BankAccountUiControllerMock;

public class BankAccountUiFactory {
    private static BankAccountUiController bankAccountUiController = new BankAccountUiControllerMock();

    public static BankAccountInfoUi getBankAccountUiBankAccountInfoUi() {
        return bankAccountUiController;
    }
}
