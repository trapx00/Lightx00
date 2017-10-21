package trapx00.lightx00.shared.dataservice.commoditydataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPO;

public interface GoodsManagementDataService {
    public ResultMessage add(CommodityPO newCommodity);//新建商品
    public ResultMessage modify(CommodityPO updateCommodity);//修改
    public CommodityPO[] query(String id, String name);//查询
    public ResultMessage delete(CommodityPO commodity);//删除
    public void init();//初始化

}
