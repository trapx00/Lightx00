package trapx00.lightx00.client.bl.commoditybl.factory;

import trapx00.lightx00.client.bl.commoditybl.CommodityBlController;
import trapx00.lightx00.client.bl.commoditybl.mock.CommodityBlControllerMock;

public class CommodityServiceFactory {

    private static CommodityBlController instance =new CommodityBlControllerMock();
    /**
     * Gets a CommodityService instance.
     * @return CommodityService instance
     */
    public static CommodityBlController getController(){
        return instance;
    }
}
