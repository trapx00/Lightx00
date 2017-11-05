package trapx00.lightx00.client.blservice.bankaccountblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.financestaff.BankAccountQueryVo;
import trapx00.lightx00.shared.vo.financestaff.BankAccountVo;

public interface BankAccountManagementBlService {
    /**
     * Adds a bank account.
     * @param newAccount New account Vo
     * @return whether the operation is done successfully
     */
    ResultMessage add(BankAccountVo newAccount);

    /**
     * Modifies a account according to the id.
     * @param newAccount new account vo
     * @return whether the operation is done successfully
     */

    ResultMessage modify(BankAccountVo newAccount);

    /**
     * Queries bank account.
     * @param query BankAccountQueryVo
     * @return whether the operation is done successfully
     */

    BankAccountVo[] query(BankAccountQueryVo query);

    /**
     * Deletes a bank account.
     * @param account BankAccountQueryVo
     * @return whether the operation is done successfully
     */

    ResultMessage delete(BankAccountVo account);
}
