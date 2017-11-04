package trapx00.lightx00.client.bl.commoditybl;

public class CommodityInfoServiceFactory {
    /**
     * Gets a CommodityInfoService instance
     * @return  CommodityInfoService instance
     */
    public static CommodityInfoService getInsantce(){
        return new CommodityBlController();
    }
}
