package trapx00.lightx00.client.blservice.saleblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.salestaff.SaleBillVO;

interface SaleBillBLService {
    public ResultMessage[] submit(SaleBillVO saleBill);//提交销售单

    public ResultMessage saveAsDraft(SaleBillVO saleBill);//保存销售单为草稿
}