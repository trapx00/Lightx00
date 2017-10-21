package trapx00.lightx00.shared.dataservice.saledataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.salestaff.SaleBillPo;

interface SaleBillDataService {
    ResultMessage submit(SaleBillPo saleBill);//提交销售单
}