package trapx00.lightx00.shared.dataservice.commoditydataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;

public interface GoodsManagementDataService {
    public ResultMessage add(CommodityPo newCommodity);//新建商品
    public ResultMessage modify(CommodityPo updateCommodity);//修改
    public CommodityPo[] query(String id, String name);//查询
    public ResultMessage delete(CommodityPo commodity);//删除
    public void init();//初始化

}
