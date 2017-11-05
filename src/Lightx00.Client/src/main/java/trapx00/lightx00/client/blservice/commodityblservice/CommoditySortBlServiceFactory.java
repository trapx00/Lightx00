package trapx00.lightx00.client.blservice.commodityblservice;

import trapx00.lightx00.client.bl.commoditybl.CommoditySortBlController;

public class CommoditySortBlServiceFactory {
    public static CommoditySortBlService getInstance(){
        return new CommoditySortBlController();
    }
}
