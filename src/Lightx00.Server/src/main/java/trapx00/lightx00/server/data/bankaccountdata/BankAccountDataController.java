package trapx00.lightx00.server.data.bankaccountdata;

import trapx00.lightx00.shared.dataservice.bankaccountdataservice.BankAccountDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.BankAccountPo;
import trapx00.lightx00.shared.queryvo.BankAccountQueryVo;

public class BankAccountDataController implements BankAccountDataService {
    @Override
    public BankAccountPo[] query(BankAccountQueryVo query) {
        return new BankAccountPo[0];
    }

    @Override
    public ResultMessage add(BankAccountPo account) {
        return null;
    }

    @Override
    public ResultMessage modify(BankAccountPo account) {
        return null;
    }

    @Override
    public ResultMessage delete(BankAccountPo account) {
        return null;
    }
}
