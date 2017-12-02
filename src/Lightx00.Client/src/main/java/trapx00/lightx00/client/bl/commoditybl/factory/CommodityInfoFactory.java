package trapx00.lightx00.client.bl.commoditybl.factory;

import trapx00.lightx00.client.bl.commoditybl.CommodityInfo;
import trapx00.lightx00.client.bl.commoditybl.CommoditySortInfo;
import trapx00.lightx00.client.bl.commoditybl.mock.CommodityBlControllerMock;
import trapx00.lightx00.client.bl.commoditybl.mock.CommoditySortBlControllerMock;

public class CommodityInfoFactory {
    private static CommodityInfo commodityInfo =new CommodityBlControllerMock();


    public static CommodityInfo getCommodityInfo(){
        return commodityInfo;
    }

}
