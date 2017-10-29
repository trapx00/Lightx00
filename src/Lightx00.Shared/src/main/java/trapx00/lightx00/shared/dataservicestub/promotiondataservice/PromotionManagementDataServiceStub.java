package trapx00.lightx00.shared.dataservicestub.promotiondataservice;

import trapx00.lightx00.shared.dataservice.promotiondataservice.PromotionManagementDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.manager.promotion.PromotionPoBase;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;
import trapx00.lightx00.shared.vo.manager.promotion.CommodityQueryVo;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionQueryVo;

import java.util.Date;

public class PromotionManagementDataServiceStub implements PromotionManagementDataService {
    @Override
    public ResultMessage submit(PromotionPoBase promotion) {
        return ResultMessage.Success;
    }

    @Override
    public PromotionPoBase[] queryPromotion(PromotionQueryVo query) {
        return new PromotionPoBase[]{
                new PromotionPoBase(query.getId(), query.getType(),new Date(),new Date(), PromotionState.Waiting)
        };
    }

    @Override
    public ResultMessage delete(PromotionPoBase promotion) {
        return ResultMessage.Success;
    }

    @Override
    public CommodityPo[] queryCommodity(CommodityQueryVo query) {
        return new CommodityPo[]{
                new CommodityPo(query.getId(),query.getName(),query.getType(),1,new Date(),null,null,100,100,150,150,10)
        };
    }
}
