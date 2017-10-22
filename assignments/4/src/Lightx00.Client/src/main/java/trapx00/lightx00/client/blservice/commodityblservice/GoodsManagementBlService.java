package trapx00.lightx00.client.blservice.commodityblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVo;

public interface GoodsManagementBlService {
    //商品管理

    ResultMessage add(CommodityVo newCommodity);//新建商品

    ResultMessage modify(CommodityVo updateCommodity);//修改商品

    CommodityVo[] query(String id, String name);//查询商品

    ResultMessage delete(CommodityVo commodity);//删除商品
}