package trapx00.lightx00.client.blservice.bankaccountblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.financestaff.BankAccountQueryVo;
import trapx00.lightx00.shared.vo.financestaff.BankAccountVo;

public interface BankAccountManagementBlService {
    ResultMessage add(BankAccountVo newAccount);

    ResultMessage modify(BankAccountVo newAccount);

    BankAccountVo[] query(BankAccountQueryVo query);

    ResultMessage delete(BankAccountVo account);
}
