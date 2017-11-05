package trapx00.lightx00.client.bl.commoditybl;

import trapx00.lightx00.shared.vo.inventorystaff.CommodityQueryVo;
import trapx00.lightx00.shared.vo.inventorystaff.CommoditySortQueryVo;
import trapx00.lightx00.shared.vo.inventorystaff.CommoditySortVo;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVo;

public interface CommodityService {
    /**
     * Query a commodity
     * @param commodityQueryVo
     * @return Commodity that match query condition
     */
    CommodityVo[] queryCommodity(CommodityQueryVo commodityQueryVo);

}
