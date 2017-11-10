package trapx00.lightx00.client.bl.commoditybl.factory;

import trapx00.lightx00.client.bl.commoditybl.CommoditySortBlController;
import trapx00.lightx00.client.bl.commoditybl.CommoditySortService;

public class CommoditySortServiceFactory {

    private static CommoditySortService instance =new CommoditySortBlController();
    /**
     * Gets a CommoditySortService instance.
     * @return CommoditySortService instance
     */
    public static CommoditySortService getInstance(){
        return instance;
    }
}
