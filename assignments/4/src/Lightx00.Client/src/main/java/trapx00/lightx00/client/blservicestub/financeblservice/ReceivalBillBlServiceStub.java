package trapx00.lightx00.client.blservicestub.financeblservice;

import trapx00.lightx00.client.blservice.financeblservice.ReceivalBillBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.vo.financestaff.ReceivalBillVo;

import java.util.Date;

public class ReceivalBillBlServiceStub implements ReceivalBillBlService {
    @Override
    public ResultMessage submit(ReceivalBillVo bill) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage saveAsDraft(ReceivalBillVo bill) {
        return ResultMessage.Success;
    }

    @Override
    public ReceivalBillVo resume() {
        return new ReceivalBillVo("123",new Date(), BillState.Draft, null,null,null,10);
    }
}
