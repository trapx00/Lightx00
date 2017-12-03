package trapx00.lightx00.client.bl.commoditybl.factory;

import trapx00.lightx00.client.bl.commoditybl.CommodityBlController;
import trapx00.lightx00.client.bl.commoditybl.mock.CommodityBlControllerMock;

public class CommodityServiceFactory {

    private static CommodityBlController instance =new CommodityBlController();
    /**
     * Gets a CommodityInfo instance.
     * @return CommodityInfo instance
     */
    public static CommodityBlController getController(){
        return instance;
    }
}
