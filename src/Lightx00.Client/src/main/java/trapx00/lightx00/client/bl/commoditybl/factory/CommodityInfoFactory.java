package trapx00.lightx00.client.bl.commoditybl.factory;

import trapx00.lightx00.client.bl.commoditybl.CommodityBlController;
import trapx00.lightx00.client.bl.commoditybl.CommodityInfo;
import trapx00.lightx00.client.bl.commoditybl.CommoditySortInfo;
import trapx00.lightx00.client.bl.commoditybl.mock.CommodityBlControllerMock;
import trapx00.lightx00.client.bl.commoditybl.mock.CommoditySortBlControllerMock;
import trapx00.lightx00.client.bl.util.PoVoConverter;

public class CommodityInfoFactory {
    private static CommodityInfo commodityInfo =new CommodityBlController();

    private static PoVoConverter commodityPoVoConverter=new CommodityBlController();

    public static CommodityInfo getCommodityInfo(){
        return commodityInfo;
    }

    public  static PoVoConverter getPoVoConverter(){
        return commodityPoVoConverter;
    }

}
