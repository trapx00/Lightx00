package trapx00.lightx00.client.bl.commoditybl;

public class CommodityServiceFactory {
    public static CommodityService getInstance(){
        return new CommodityBlController();
    }
}
