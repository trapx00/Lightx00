package trapx00.lightx00.shared.dataservice.commoditydataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;

public interface GoodsManagementDataService {

    ResultMessage add(CommodityPo newCommodity);//新建商品

    ResultMessage modify(CommodityPo updateCommodity);//修改

    CommodityPo[] query(String id, String name);//查询

    ResultMessage delete(CommodityPo commodity);//删除

    void init();//初始化

}
