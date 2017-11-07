package trapx00.lightx00.shared.dataservice.bankaccountdataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.BankAccountPo;
import trapx00.lightx00.shared.queryvo.BankAccountQueryVo;

public interface BankAccountDataService {
    BankAccountPo[] query(BankAccountQueryVo query);

    ResultMessage add(BankAccountPo account);

    ResultMessage modify(BankAccountPo account);

    ResultMessage delete(BankAccountPo account);
}
