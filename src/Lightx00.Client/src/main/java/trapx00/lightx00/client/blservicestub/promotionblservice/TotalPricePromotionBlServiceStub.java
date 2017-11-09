package trapx00.lightx00.client.blservicestub.promotionblservice;

import trapx00.lightx00.client.blservice.promotionblservice.TotalPricePromotionBlService;
import trapx00.lightx00.client.vo.manager.promotion.TotalPricePromotionVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

public class TotalPricePromotionBlServiceStub implements TotalPricePromotionBlService {
    @Override
    public ResultMessage submit(TotalPricePromotionVo promotion) {
        return null;
    }

    @Override
    public ResultMessage saveAsDraft(TotalPricePromotionVo promotion) {
        return null;
    }

    @Override
    public ResultMessage delete(TotalPricePromotionVo promotion) {
        return null;
    }

    @Override
    public TotalPricePromotionVo[] queryPromotion(PromotionQueryVo query) {
        return new TotalPricePromotionVo[0];
    }

    @Override
    public String getId() {
        return null;
    }
}
