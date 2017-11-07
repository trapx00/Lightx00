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

    /**
     * Gets the id for the next bill.
     *
     * @return id for the next bill
     */
    @Override
    public String getId() {
        return "FXD-20171107-00001";
    }


}
