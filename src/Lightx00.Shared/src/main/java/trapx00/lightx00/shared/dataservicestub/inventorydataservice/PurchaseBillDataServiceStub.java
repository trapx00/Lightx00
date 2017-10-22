package trapx00.lightx00.shared.dataservicestub.inventorydataservice;

import trapx00.lightx00.shared.dataservice.inventorydataservice.PurchaseBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.salestaff.PurchaseBillPo;

public class PurchaseBillDataServiceStub implements PurchaseBillDataService {

    @Override
    public ResultMessage submit(PurchaseBillPo purchaseBill) {
        return ResultMessage.Success;
    }
}
