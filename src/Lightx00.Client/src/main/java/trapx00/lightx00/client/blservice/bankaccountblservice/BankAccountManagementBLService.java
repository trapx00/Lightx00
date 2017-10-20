package trapx00.lightx00.client.blservice.bankaccountblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.financestaff.BankAccountQueryVO;
import trapx00.lightx00.shared.vo.financestaff.BankAccountVO;

public interface BankAccountManagementBLService {
    ResultMessage add(BankAccountVO newAccount);
    ResultMessage modify(BankAccountVO newAccount);
    BankAccountVO[] query(BankAccountQueryVO query);
    ResultMessage delete(BankAccountVO account);
}
