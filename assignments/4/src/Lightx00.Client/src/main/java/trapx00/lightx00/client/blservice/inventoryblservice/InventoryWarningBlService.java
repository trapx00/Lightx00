package trapx00.lightx00.client.blservice.inventoryblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.shared.vo.inventorystaff.InventoryBillVo;

public interface InventoryWarningBlService {
    //库存监控
    ResultMessage submit(InventoryBillVo bill);//提交

    ResultMessage saveAsDraft(InventoryBillVo bill);//保存草稿

    InventoryBillVo resume();//开始填写

    ResultMessage modify(CommodityVo commodity, double modifyWarning);//修改警戒值

    InventoryBillVo getCurrentBill();//得到正在操作单据信息
}