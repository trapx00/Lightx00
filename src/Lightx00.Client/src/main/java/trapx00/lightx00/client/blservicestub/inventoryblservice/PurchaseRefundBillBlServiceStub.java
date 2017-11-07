package trapx00.lightx00.client.blservicestub.inventoryblservice;

import trapx00.lightx00.client.blservice.inventoryblservice.PurchaseRefundBillBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.salestaff.PurchaseRefundBillVo;

public class PurchaseRefundBillBlServiceStub implements PurchaseRefundBillBlService {
    @Override
    public ResultMessage submit(PurchaseRefundBillVo purchaseRefundBill) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage saveAsDraft(PurchaseRefundBillVo purchaseRefundBill) {
        return ResultMessage.Success;
    }
}
