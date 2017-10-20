package trapx00.lightx00.client.blservice.commodityblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVO;

public interface GoodsManagementBLService {
    public ResultMessage add(CommodityVO newCommodity);//新建商品

    public ResultMessage modify(CommodityVO updateCommodity);//修改商品

    public CommodityVO[] query(String ID, String name);//查询商品

    public ResultMessage delete(CommodityVO commodity);//删除商品
}