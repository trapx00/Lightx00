package trapx00.lightx00.server.data.commoditydata.factory;

import trapx00.lightx00.server.data.commoditydata.mock.CommodityDataControllerMock;
import trapx00.lightx00.shared.dataservice.commoditydataservice.CommodityDataService;

public class CommodityDataFactory {
    private static CommodityDataService service=new CommodityDataControllerMock();

    public static CommodityDataService getService(){
        return service;
    }
}
