package trapx00.lightx00.client.blservicestub.saleblservice;

import trapx00.lightx00.client.blservice.saleblservice.SaleBillBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.salestaff.SaleBillVo;

public class SaleBillBlServiceStub implements SaleBillBlService {
    @Override
    public ResultMessage submit(SaleBillVo saleBill) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage saveAsDraft(SaleBillVo saleBill) {
        return ResultMessage.Success;
    }
}
