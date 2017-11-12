package trapx00.lightx00.client.bl.bankaccountbl;

import trapx00.lightx00.client.blservice.bankaccountblservice.BankAccountManagementBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.queryvo.BankAccountQueryVo;
import trapx00.lightx00.client.vo.financestaff.BankAccountVo;

public class BankAccountBlController implements BankAccountManagementBlService, BankAccountModificationService {
    /**
     * Modifies a bank account's balance.
     *
     * @param id    bank account's id
     * @param delta delta for the balance
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modifyBankAccount(String id, double delta) {
        return null;
    }

    /**
     * Adds a bank account.
     *
     * @param newAccount New account Vo
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(BankAccountVo newAccount) {
        return null;
    }

    /**
     * Modifies a account according to the id.
     *
     * @param newAccount new account vo
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(BankAccountVo newAccount) {
        return null;
    }

    /**
     * Queries bank account.
     *
     * @param query BankAccountQueryVo
     * @return whether the operation is done successfully
     */
    @Override
    public BankAccountVo[] query(BankAccountQueryVo query) {
        return new BankAccountVo[0];
    }

    /**
     * Deletes a bank account.
     *
     * @param id BankAccountQueryVo
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(String id) {
        return null;
    }
}
