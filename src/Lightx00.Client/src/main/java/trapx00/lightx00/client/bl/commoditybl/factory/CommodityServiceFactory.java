package trapx00.lightx00.client.bl.commoditybl.factory;

import trapx00.lightx00.client.bl.commoditybl.CommodityBlController;
import trapx00.lightx00.client.bl.commoditybl.CommodityService;

public class CommodityServiceFactory {

    private static CommodityService instance =new CommodityBlController();
    /**
     * Gets a CommodityService instance.
     * @return CommodityService instance
     */
    public static CommodityService getInstance(){
        return instance;
    }
}
