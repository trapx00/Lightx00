package trapx00.lightx00.shared.dataservice.saledataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.salestaff.SaleBillPO;

interface SaleBillDataService{
    public ResultMessage submit(SaleBillPO saleBill);//提交销售单
}