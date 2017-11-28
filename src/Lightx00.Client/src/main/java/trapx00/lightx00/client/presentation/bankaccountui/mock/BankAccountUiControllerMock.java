package trapx00.lightx00.client.presentation.bankaccountui.mock;

import trapx00.lightx00.client.presentation.bankaccountui.BankAccountUiController;
import trapx00.lightx00.client.vo.financestaff.BankAccountVo;

import java.util.Date;

public class BankAccountUiControllerMock extends BankAccountUiController {
    /**
     * Shows a dialog for selecting dialog and returns what have been chosen.
     *
     * @return Shows a dialog for selecting dialog and returns what have been chosen.
     */
    @Override
    public BankAccountVo[] showBankAccountSelectDialog() {
        return new BankAccountVo[]{
                new BankAccountVo(1,"123",0,new Date())
        };
    }
}
