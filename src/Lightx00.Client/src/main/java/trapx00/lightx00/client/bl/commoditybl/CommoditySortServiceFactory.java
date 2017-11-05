package trapx00.lightx00.client.bl.commoditybl;

public class CommoditySortServiceFactory {
    /**
     * Gets a CommodityService instance
     * @return a CommodityService instance
     */
    public static CommoditySortService getInstance(){
        return new CommoditySortBlController();
    }
}
