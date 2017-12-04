package trapx00.lightx00.client.bl.commoditybl.factory;

import trapx00.lightx00.client.bl.commoditybl.CommoditySortBlController;
import trapx00.lightx00.client.bl.commoditybl.mock.CommoditySortBlControllerMock;

public class CommoditySortServiceFactory {

    private static CommoditySortBlController instance =new CommoditySortBlController();
    /**
     * Gets a CommoditySortInfo instance.
     * @return CommoditySortInfo instance
     */
    public static  CommoditySortBlController getController(){
        return instance;
    }
}
