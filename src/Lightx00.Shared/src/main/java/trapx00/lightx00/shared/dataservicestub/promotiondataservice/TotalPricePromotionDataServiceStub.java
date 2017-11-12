package trapx00.lightx00.shared.dataservicestub.promotiondataservice;

import trapx00.lightx00.shared.dataservice.promotiondataservice.TotalPricePromotionDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.TotalPricePromotionPo;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

import java.util.Date;

public class TotalPricePromotionDataServiceStub implements TotalPricePromotionDataService {
    @Override
    public ResultMessage submit(TotalPricePromotionPo promotion) {
        return ResultMessage.Success;
    }

    @Override
    public TotalPricePromotionPo[] queryPromotion(PromotionQueryVo query) {
        return new TotalPricePromotionPo[]{
                new TotalPricePromotionPo(query.getId(), query.getType(),new Date(),new Date(), PromotionState.Waiting)
        };
    }

    @Override
    public ResultMessage delete(TotalPricePromotionPo promotion) {
        return ResultMessage.Success;
    }

    @Override
    public String getId(){
        return null;
    }
}
