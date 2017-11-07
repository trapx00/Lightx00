package trapx00.lightx00.shared.dataservicestub.commoditydataservice;

import trapx00.lightx00.shared.dataservice.commoditydataservice.CommodityDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.client.vo.inventorystaff.CommodityQueryVo;

import java.util.Date;

public class CommodityDataServiceStub implements CommodityDataService {

    @Override
    public ResultMessage add(CommodityPo newCommodity) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage modify(CommodityPo updateCommodity) {
        return ResultMessage.Success;
    }

    @Override
    public CommodityPo[] query(CommodityQueryVo commodityQueryVo) {
        return  new CommodityPo[]{
                new CommodityPo(commodityQueryVo.getId(), commodityQueryVo.getName(), "Led", 98, new Date(),
                        "1", "2", 56, 60, 90, 99, 50)
        };
    }



    @Override
    public ResultMessage delete(CommodityPo commodity) {
        return ResultMessage.Success;
    }

    @Override
    public void init() {

    }
}
