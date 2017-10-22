package trapx00.lightx00.client.blservicestub.commodityblservice;

import trapx00.lightx00.client.blservice.commodityblservice.ProductManagementBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.inventorystaff.CommoditySortVo;

public class ProductManagementBlServiceStub implements ProductManagementBlService {



    @Override
    public ResultMessage add(CommoditySortVo newSort, CommoditySortVo parentSort) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage modify(CommoditySortVo sort) {
        return ResultMessage.Success;
    }

    @Override
    public CommoditySortVo[] query(String id, String name) {
        String commodityIdList[]={"C0001","C0002"};
        String nextIds[]={"S0002"};
        String lowNextIds[]={""};
        return new CommoditySortVo[]{
                new CommoditySortVo("S0001","Led", null,
                "", nextIds)
        };
    }

    @Override
    public ResultMessage delete(CommoditySortVo sort) {
        return ResultMessage.Success;
    }

    @Override
    public CommoditySortVo[] display() {
        String commodityIdList[]={"C0001","C0002"};
        String nextIds[]={"S0002"};
        String lowNextIds[]={""};
        return new CommoditySortVo[]{
                new CommoditySortVo("S0001","Led", null,
                        "", nextIds)
        };
    }

    @Override
    public CommoditySortVo[] dispaly(CommoditySortVo commoditySort) {
        String commodityIdList[]={"C0001","C0002"};
        String nextIds[]={"S0002"};
        String lowNextIds[]={""};
        return new CommoditySortVo[]{
                new CommoditySortVo("S0002","lowLed", commodityIdList,
                        "", lowNextIds)
        };
    }
}
