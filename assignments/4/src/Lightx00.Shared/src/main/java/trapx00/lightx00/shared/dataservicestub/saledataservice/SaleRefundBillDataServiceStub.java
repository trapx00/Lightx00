package trapx00.lightx00.shared.dataservicestub.saledataservice;

import trapx00.lightx00.shared.dataservice.saledataservice.SaleRefundBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.salestaff.SaleRefundBillPo;

public class SaleRefundBillDataServiceStub implements SaleRefundBillDataService {
    @Override
    public ResultMessage submit(SaleRefundBillPo saleRefundBill) {
        return ResultMessage.Success;
    }
}
