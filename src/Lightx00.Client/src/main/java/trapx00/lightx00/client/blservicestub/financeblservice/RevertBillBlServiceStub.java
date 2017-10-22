package trapx00.lightx00.client.blservicestub.financeblservice;

import trapx00.lightx00.client.blservice.financeblservice.RevertBillBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.BillVo;

public class RevertBillBlServiceStub implements RevertBillBlService {
    @Override
    public ResultMessage init(BillVo bill) {
        return ResultMessage.Success;
    }
}
