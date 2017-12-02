package trapx00.lightx00.client.bl.commoditybl.factory;

import trapx00.lightx00.client.bl.commoditybl.CommoditySortInfo;
import trapx00.lightx00.client.bl.commoditybl.mock.CommoditySortBlControllerMock;

public class CommoditySortInfoFactory {

    private static CommoditySortInfo commoditySortInfo =new CommoditySortBlControllerMock();

    public static CommoditySortInfo getCommoditySortInfo(){
        return commoditySortInfo;
    }
}
