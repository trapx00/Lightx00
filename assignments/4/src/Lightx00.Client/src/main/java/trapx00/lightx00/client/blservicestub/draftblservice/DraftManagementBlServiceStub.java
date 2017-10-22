package trapx00.lightx00.client.blservicestub.draftblservice;

import trapx00.lightx00.client.blservice.draftblservice.DraftManagementBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.FinanceBillType;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.financestaff.FinanceBillVo;

import java.util.Date;

public class DraftManagementBlServiceStub implements DraftManagementBlService {
    @Override
    public BillVo[] update() {
        return new BillVo[]{
                new FinanceBillVo(FinanceBillType.PaymentBill,"123",new Date(), BillState.Draft)
        };
    }

    @Override
    public ResultMessage delete(BillVo bill) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage resume(BillVo bill) {
        return ResultMessage.Success;
    }
}
