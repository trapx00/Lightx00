package trapx00.lightx00.client.bl.commoditybl;

import trapx00.lightx00.client.blservice.commodityblservice.ProductManagementBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.inventorystaff.CommoditySortVo;

public class CommoditySortBlController implements ProductManagementBlService,CommoditySortInfoService {
    @Override
    public ResultMessage add(CommoditySortVo newSort, CommoditySortVo parentSort) {
        return null;
    }

    @Override
    public ResultMessage modify(CommoditySortVo sort) {
        return null;
    }

    @Override
    public CommoditySortVo[] query(String id) {
        return new CommoditySortVo[0];
    }

    @Override
    public ResultMessage delete(CommoditySortVo sort) {
        return null;
    }

    @Override
    public CommoditySortVo[] display() {
        return new CommoditySortVo[0];
    }

    @Override
    public CommoditySortVo[] dispaly(CommoditySortVo commoditySort) {
        return new CommoditySortVo[0];
    }

    @Override
    public CommoditySortVo[] queryCommoditySort(String id) {
        return new CommoditySortVo[0];
    }
}
