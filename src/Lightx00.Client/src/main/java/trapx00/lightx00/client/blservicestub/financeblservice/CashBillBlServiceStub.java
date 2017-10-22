package trapx00.lightx00.client.blservicestub.financeblservice;

import trapx00.lightx00.client.blservice.financeblservice.CashBillBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.CashBillItem;
import trapx00.lightx00.shared.vo.financestaff.CashBillVo;

import java.util.Date;

public class CashBillBlServiceStub implements CashBillBlService {
    @Override
    public ResultMessage submit(CashBillVo bill) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage saveAsDraft(CashBillVo bill) {
        return ResultMessage.Success;
    }

    @Override
    public CashBillVo resume() {
        return new CashBillVo("123",new Date(), BillState.Draft, null,null,
                new CashBillItem[] {new CashBillItem("123",123,"123")});
    }
}
