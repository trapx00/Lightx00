package trapx00.lightx00.client.bl.bankaccountbl.mock;

import trapx00.lightx00.client.bl.bankaccountbl.BankAccountBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.queryvo.BankAccountQueryVo;
import trapx00.lightx00.client.vo.financestaff.BankAccountVo;

public class BankAccountBlControllerMock extends BankAccountBlController {
    /**
     * Modifies a bank account's balance.
     *
     * @param id    bank account's id
     * @param delta delta for the balance
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modifyBankAccount(String id, double delta) {
        return super.modifyBankAccount(id, delta);
    }

    /**
     * Adds a bank account.
     *
     * @param newAccount New account Vo
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(BankAccountVo newAccount) {
        return super.add(newAccount);
    }

    /**
     * Modifies a account according to the id.
     *
     * @param newAccount new account vo
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(BankAccountVo newAccount) {
        return super.modify(newAccount);
    }

    /**
     * Queries bank account.
     *
     * @param query BankAccountQueryVo
     * @return whether the operation is done successfully
     */
    @Override
    public BankAccountVo[] query(BankAccountQueryVo query) {
        return super.query(query);
    }

    /**
     * Deletes a bank account.
     *
     * @param account BankAccountQueryVo
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(BankAccountVo account) {
        return super.delete(account);
    }
}
