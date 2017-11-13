package trapx00.lightx00.client.bl.commoditybl.factory;

import trapx00.lightx00.client.bl.commoditybl.CommoditySortBlController;
import trapx00.lightx00.client.bl.commoditybl.mock.CommoditySortBlControllerMock;

public class CommoditySortServiceFactory {

    private static CommoditySortBlController instance =new CommoditySortBlControllerMock();
    /**
     * Gets a CommoditySortService instance.
     * @return CommoditySortService instance
     */
    public static  CommoditySortBlController getController(){
        return instance;
    }
}
