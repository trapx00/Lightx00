package trapx00.lightx00.client.bl.commoditybl;

import trapx00.lightx00.shared.vo.inventorystaff.CommoditySortQueryVo;
import trapx00.lightx00.shared.vo.inventorystaff.CommoditySortVo;

public interface CommoditySortService {
    /**
     * Query a commoditySort
     * @param commoditySortQueryVo
     * @return commodtySort that match query condition
     */
    CommoditySortVo[] queryCommoditySort(CommoditySortQueryVo commoditySortQueryVo);

}
