package trapx00.lightx00.client.blservicestub.bankaccountblservice;

import trapx00.lightx00.client.blservice.bankaccountblservice.BankAccountManagementBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.financestaff.BankAccountQueryVo;
import trapx00.lightx00.shared.vo.financestaff.BankAccountVo;

import java.util.Date;

public class BankAccountManagementBlServiceStub implements BankAccountManagementBlService {
    @Override
    public ResultMessage add(BankAccountVo newAccount) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage modify(BankAccountVo newAccount) {
        return ResultMessage.Success;
    }

    @Override
    public BankAccountVo[] query(BankAccountQueryVo query) {
        return new BankAccountVo[] {
               new BankAccountVo("123",query.getName(),123,new Date())
        };
    }

    @Override
    public ResultMessage delete(BankAccountVo account) {
        return ResultMessage.Success;
    }
}
