package trapx00.lightx00.client.bl.commoditybl.factory;

import trapx00.lightx00.client.bl.commoditybl.CommodityBlController;
import trapx00.lightx00.client.bl.commoditybl.CommodityService;
import trapx00.lightx00.client.bl.commoditybl.CommoditySortBlController;
import trapx00.lightx00.client.bl.commoditybl.CommoditySortService;

public class CommodityQueryFactory {
    private static CommodityService commodityService=new CommodityBlController();
    private static CommoditySortService commoditySortService=new CommoditySortBlController();

    public static CommodityService getCommodityService(){
        return commodityService;
    }
    public static CommoditySortService getCommoditySortService(){
        return commoditySortService;
    }
}
