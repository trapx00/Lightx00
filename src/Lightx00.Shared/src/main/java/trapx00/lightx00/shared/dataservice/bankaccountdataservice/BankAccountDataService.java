package trapx00.lightx00.shared.dataservice.bankaccountdataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.BankAccountPo;
import trapx00.lightx00.shared.queryvo.BankAccountQueryVo;

public interface BankAccountDataService {
    /**
     * Queries bank account.
     * @param query query
     * @return Bank accounts that match query
     */
    BankAccountPo[] query(BankAccountQueryVo query);

    /**
     * Adds a account.
     * @param account new account
     * @return whether the operation is done successfully
     */

    ResultMessage add(BankAccountPo account);

    /**
     * Modifies an account with the id.
     * @param account new account info
     * @return whether the operation is done successfully
     */

    ResultMessage modify(BankAccountPo account);

    /**
     * Deletes an account.
     * @param id id for the account to be deleted
     * @return whether the operation is done successfully
     */
    ResultMessage delete(int id);
}
