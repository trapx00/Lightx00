package trapx00.lightx00.shared.dataservicestub.saledataservice;

import trapx00.lightx00.shared.dataservice.saledataservice.SaleBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.salestaff.SaleBillPo;

public class SaleBillDataServiceStub implements SaleBillDataService {
    @Override
    public ResultMessage submit(SaleBillPo saleBill) {
        return ResultMessage.Success;
    }
}
