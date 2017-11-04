package trapx00.lightx00.client.bl.commoditybl;

public class CommoditySortInfoServiceFactory {
    /**
     * Gets a CommoditySortInfoService
     * @return CommoditySortInfoService instance
     */
    public static CommoditySortInfoService getInstance(){

        return new CommoditySortBlController();
    }
}
