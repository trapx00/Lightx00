package trapx00.lightx00.client.blservice.inventoryblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVO;
import trapx00.lightx00.shared.vo.inventorystaff.InventoryBillVO;

public interface InventoryWarningBLService{//库存监控
    public ResultMessage submit(InventoryBillVO bill);//提交
    public ResultMessage saveAsDraft(InventoryBillVO bill);//保存草稿
    public InventoryBillVO resume();//开始填写
    public ResultMessage modify(CommodityVO commodity, double modifyWarning);//修改警戒值
    public InventoryBillVO getCurrentBill();//得到正在操作单据信息
}