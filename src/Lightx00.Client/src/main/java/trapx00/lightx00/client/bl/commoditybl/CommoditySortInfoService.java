package trapx00.lightx00.client.bl.commoditybl;

import trapx00.lightx00.shared.vo.inventorystaff.CommoditySortVo;

public interface CommoditySortInfoService {
    /**
     * Query a commoditySort
     * @param id
     * @return commodtySortVo
     */
    CommoditySortVo[] queryCommoditySort(String id);
}
