package trapx00.lightx00.client.blservice.commodityblservice;

import trapx00.lightx00.client.bl.commoditybl.CommoditySortBlController;

public class CommoditySortBlServiceFactory {
    private static  CommoditySortBlService instance = new CommoditySortBlController();
    /**
     * Gets a CommoditySortBlServiceinstance.
     * @return CommoditySortBlService instance
     */
    public static CommoditySortBlService getInstance(){
        return instance;
    }
}
