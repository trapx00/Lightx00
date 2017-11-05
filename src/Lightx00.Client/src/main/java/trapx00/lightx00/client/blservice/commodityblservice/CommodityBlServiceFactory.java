package trapx00.lightx00.client.blservice.commodityblservice;

import trapx00.lightx00.client.bl.commoditybl.CommodityBlController;

public class CommodityBlServiceFactory {
    public static CommodityBlService getInstance(){
        return new CommodityBlController();
    }
}
