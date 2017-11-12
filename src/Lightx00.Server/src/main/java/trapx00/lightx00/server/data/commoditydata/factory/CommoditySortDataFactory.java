package trapx00.lightx00.server.data.commoditydata.factory;

import trapx00.lightx00.server.data.commoditydata.mock.CommoditySortDataControllerMock;
import trapx00.lightx00.shared.dataservice.commoditydataservice.CommoditySortDataService;

public class CommoditySortDataFactory {
    private static CommoditySortDataService commoditySortDataService=new CommoditySortDataControllerMock();

    public static CommoditySortDataService getCommoditySortDataService(){
        return commoditySortDataService;
    }
}
