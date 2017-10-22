package trapx00.lightx00.shared.dataservicestub.financedataservice;

import trapx00.lightx00.shared.dataservice.financedataservice.ReceivalBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.ReceivalBillPo;

public class ReceivalDataServiceStub implements ReceivalBillDataService {
    @Override
    public ResultMessage submit(ReceivalBillPo bill) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage activate(ReceivalBillPo bill) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage abandon(ReceivalBillPo bill) {
        return ResultMessage.Success;
    }
}
