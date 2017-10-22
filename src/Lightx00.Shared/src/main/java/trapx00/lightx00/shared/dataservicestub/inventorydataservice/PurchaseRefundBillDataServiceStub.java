package trapx00.lightx00.shared.dataservicestub.inventorydataservice;

import trapx00.lightx00.shared.dataservice.inventorydataservice.PurchaseRefundBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.salestaff.PurchaseRefundBillPo;

public class PurchaseRefundBillDataServiceStub implements PurchaseRefundBillDataService {
    @Override
    public ResultMessage submit(PurchaseRefundBillPo purchaseBill) {
        return ResultMessage.Success;
    }
}
