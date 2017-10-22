package trapx00.lightx00.client.blservicestub.promotionblservice;

import trapx00.lightx00.client.blservice.promotionblservice.PromotionManagementBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.shared.vo.manager.promotion.CommodityQueryVo;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionQueryVo;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionVoBase;

import java.util.Date;

public class PromotionManagementBlServieStub implements PromotionManagementBlService {
    @Override
    public ResultMessage submit(PromotionVoBase newPromotion) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage saveAsDraft(PromotionVoBase promotion) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage delete(PromotionVoBase promotion) {
        return ResultMessage.Success;
    }

    @Override
    public PromotionVoBase resume() {
        return new PromotionVoBase("0001", PromotionType.CommodityOnSale,new Date(),new Date(), PromotionState.Waiting);
    }

    @Override
    public PromotionVoBase[] queryPromotion(PromotionQueryVo query) {
        return new PromotionVoBase[]{
                new PromotionVoBase("0001", PromotionType.CommodityOnSale,new Date(),new Date(), PromotionState.Waiting)
        };
    }

    @Override
    public CommodityVo[] queryCommodity(CommodityQueryVo commodity) {
        return new CommodityVo[]{
                new CommodityVo("000001","落地灯",null,1,new Date(),null,null,100,100,150,150,10)
        };
    }
}
