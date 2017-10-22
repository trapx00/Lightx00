package trapx00.lightx00.shared.dataservice.bankaccountdataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.BankAccountPo;

public interface BankAccountDataService {
    BankAccountPo[] query(String id, String name);

    ResultMessage add(BankAccountPo account);

    ResultMessage modify(BankAccountPo account);

    ResultMessage delete(BankAccountPo account);
}
