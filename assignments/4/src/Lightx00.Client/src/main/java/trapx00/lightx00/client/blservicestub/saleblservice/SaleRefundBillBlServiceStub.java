package trapx00.lightx00.client.blservicestub.saleblservice;

import trapx00.lightx00.client.blservice.saleblservice.SaleRefundBillBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.salestaff.SaleRefundBillVo;

public class SaleRefundBillBlServiceStub implements SaleRefundBillBlService{
    @Override
    public ResultMessage submit(SaleRefundBillVo saleRefundBill) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage saveAsDraft(SaleRefundBillVo saleRefundBill) {
        return ResultMessage.Success;
    }
}
