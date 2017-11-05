package trapx00.lightx00.shared.dataservice.saledataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.salestaff.SaleBillPo;

public interface SaleBillDataService {

    /**
     * submit a saleBill
     * @param saleBill to be submitted
     * @return whether the operation is done successfully
     */
    ResultMessage submit(SaleBillPo saleBill);//提交销售单
}