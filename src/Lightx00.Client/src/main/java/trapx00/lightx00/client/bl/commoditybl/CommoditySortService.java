package trapx00.lightx00.client.bl.commoditybl;


import trapx00.lightx00.client.vo.inventorystaff.CommoditySortQueryVo;
import trapx00.lightx00.client.vo.inventorystaff.CommoditySortVo;

public interface CommoditySortService {
    /**
     * Query a commoditySort
     * @param commoditySortQueryVo
     * @return commodtySort that match query condition
     */
    CommoditySortVo[] queryCommoditySort(CommoditySortQueryVo commoditySortQueryVo);

}
