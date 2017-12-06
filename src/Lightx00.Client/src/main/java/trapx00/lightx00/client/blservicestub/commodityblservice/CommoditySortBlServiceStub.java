package trapx00.lightx00.client.blservicestub.commodityblservice;

import trapx00.lightx00.client.blservice.commodityblservice.CommoditySortBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.inventorystaff.CommoditySortVo;
import trapx00.lightx00.shared.queryvo.CommoditySortQueryVo;

public class CommoditySortBlServiceStub implements CommoditySortBlService {



    @Override
    public ResultMessage add(CommoditySortVo newSort, CommoditySortVo parentSort) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage modify(CommoditySortVo sort) {
        return ResultMessage.Success;
    }

    @Override
    public CommoditySortVo[] query(CommoditySortQueryVo commoditySortQueryVo) {
        String commodityIdList[]={"C0001"};
        String nextIds[]={"S0002"};
        String lowNextIds[]={""};
        return new CommoditySortVo[]{
                new CommoditySortVo("S0001","Led", null,
                "", null)
        };
    }

    @Override
    public ResultMessage delete(CommoditySortVo sort) {
        return ResultMessage.Success;
    }

    @Override
    public CommoditySortVo[] getAllCommoditySort() {
        return new CommoditySortVo[0];
    }


}
