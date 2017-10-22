package trapx00.lightx00.shared.dataservicestub.financedataservice;

import trapx00.lightx00.shared.dataservice.financedataservice.CashBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.CashBillPo;

public class CashBillDataServiceStub implements CashBillDataService {

    @Override
    public ResultMessage submit(CashBillPo bill) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage activate(CashBillPo bill) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage abandon(CashBillPo bill) {
        return ResultMessage.Success;
    }
}
