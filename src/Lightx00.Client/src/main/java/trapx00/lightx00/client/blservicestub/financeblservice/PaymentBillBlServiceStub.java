package trapx00.lightx00.client.blservicestub.financeblservice;

import trapx00.lightx00.client.blservice.financeblservice.PaymentBillBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.vo.financestaff.PaymentBillVo;

import java.util.Date;

public class PaymentBillBlServiceStub implements PaymentBillBlService {

    @Override
    public ResultMessage submit(PaymentBillVo bill) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage saveAsDraft(PaymentBillVo bill) {
        return ResultMessage.Success;
    }

    @Override
    public PaymentBillVo resume() {
        return new PaymentBillVo("123",new Date(), BillState.Draft, null,null,null,10);
    }
}
