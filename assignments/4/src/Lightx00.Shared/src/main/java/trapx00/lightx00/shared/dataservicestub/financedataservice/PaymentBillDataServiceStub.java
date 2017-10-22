package trapx00.lightx00.shared.dataservicestub.financedataservice;

import trapx00.lightx00.shared.dataservice.financedataservice.PaymentBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.PaymentBillPo;

public class PaymentBillDataServiceStub implements PaymentBillDataService {
    @Override
    public ResultMessage submit(PaymentBillPo bill) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage activate(PaymentBillPo bill) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage abandon(PaymentBillPo bill) {
        return ResultMessage.Success;
    }
}
