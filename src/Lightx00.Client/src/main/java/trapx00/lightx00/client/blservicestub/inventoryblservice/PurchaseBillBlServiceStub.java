package trapx00.lightx00.client.blservicestub.inventoryblservice;

import trapx00.lightx00.client.blservice.inventoryblservice.PurchaseBillBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.salestaff.PurchaseBillVo;

public class PurchaseBillBlServiceStub implements PurchaseBillBlService {
    @Override
    public ResultMessage submit(PurchaseBillVo purchaseBill) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage saveAsDraft(PurchaseBillVo purchaseBill) {
        return ResultMessage.Success;
    }
}
