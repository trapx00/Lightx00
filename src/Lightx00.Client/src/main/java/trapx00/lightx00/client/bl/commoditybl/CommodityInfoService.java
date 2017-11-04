package trapx00.lightx00.client.bl.commoditybl;

import trapx00.lightx00.shared.vo.inventorystaff.CommodityVo;

public interface CommodityInfoService {
    /**
     * Query a commodity
     * @param id
     * @return CommodityVo
     */
    CommodityVo[] queryCommodity(String id);



}
