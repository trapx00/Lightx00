package trapx00.lightx00.shared.dataservicestub.commoditydataservice;

import trapx00.lightx00.shared.dataservice.commoditydataservice.CommoditySortDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommoditySortPo;
import trapx00.lightx00.shared.queryvo.CommoditySortQueryVo;


public class CommoditySortDataServiceStub implements CommoditySortDataService {
    String commodityIdList[]={"C0001","C0002"};
    String nextIds[]={"S0002"};
    String lowNextIds[]={""};

    @Override
    public ResultMessage add(CommoditySortPo newCSort, CommoditySortPo parentSort) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage modify(CommoditySortPo commoditySort) {
        return ResultMessage.Success;
    }

    @Override
    public CommoditySortPo[] query(CommoditySortQueryVo commoditySortQueryVo) {
        return new CommoditySortPo[]{
                new CommoditySortPo("S0001","Led", null,
                "", nextIds)
        };
    }

    @Override
    public ResultMessage delete(CommoditySortPo commoditySort) {
        return ResultMessage.Success;
    }

    @Override
    public CommoditySortPo[] display() {
        return new CommoditySortPo[]{
                new CommoditySortPo("S0001","Led", null,
                        "", nextIds)
        };
    }

    @Override
    public CommoditySortPo[] dispaly(CommoditySortPo commoditySort) {
        return new CommoditySortPo[]{
                new CommoditySortPo(commoditySort.getId(),commoditySort.getName(), null,
                        "", nextIds)
        };
    }


}
