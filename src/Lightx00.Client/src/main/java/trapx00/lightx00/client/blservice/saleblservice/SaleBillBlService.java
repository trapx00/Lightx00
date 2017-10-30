package trapx00.lightx00.client.blservice.saleblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.salestaff.SaleBillVo;

public interface SaleBillBlService {

    ResultMessage submit(SaleBillVo saleBill);//提交销售单

    ResultMessage saveAsDraft(SaleBillVo saleBill);//保存销售单为草稿

    String getId();//获得新单据的ID
}