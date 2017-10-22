package trapx00.lightx00.shared.dataservicestub.bankaccountdataservice;

import trapx00.lightx00.shared.dataservice.bankaccountdataservice.BankAccountDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.BankAccountPo;

import java.util.Date;

public class BankAccountDataServiceStub implements BankAccountDataService {
    @Override
    public BankAccountPo[] query(String id, String name) {
        return new BankAccountPo[] {
                new BankAccountPo(id,name,0,new Date())
        };
    }

    @Override
    public ResultMessage add(BankAccountPo account) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage modify(BankAccountPo account) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage delete(BankAccountPo account) {
        return ResultMessage.Success;
    }
}
