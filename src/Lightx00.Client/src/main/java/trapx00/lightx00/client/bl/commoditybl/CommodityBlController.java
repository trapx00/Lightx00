package trapx00.lightx00.client.bl.commoditybl;

import trapx00.lightx00.client.blservice.commodityblservice.GoodsManagementBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVo;

public class CommodityBlController implements GoodsManagementBlService,CommodityInfoService{

    @Override
    public ResultMessage add(CommodityVo newCommodity) {
        return null;
    }

    @Override
    public ResultMessage modify(CommodityVo updateCommodity) {
        return null;
    }

    @Override
    public CommodityVo[] query(String id) {
        return new CommodityVo[0];
    }

    @Override
    public ResultMessage delete(CommodityVo commodity) {
        return null;
    }

    @Override
    public CommodityVo[] queryCommodity(String id) {
        return new CommodityVo[0];
    }
}
