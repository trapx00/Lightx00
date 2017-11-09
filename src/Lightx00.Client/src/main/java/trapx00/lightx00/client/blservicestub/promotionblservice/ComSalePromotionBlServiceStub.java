package trapx00.lightx00.client.blservicestub.promotionblservice;

import trapx00.lightx00.client.blservice.promotionblservice.ComSalePromotionBlService;
import trapx00.lightx00.client.vo.manager.promotion.ComSalePromotionVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

public class ComSalePromotionBlServiceStub implements ComSalePromotionBlService {
    @Override
    public ResultMessage submit(ComSalePromotionVo promotion) {
        return null;
    }

    @Override
    public ResultMessage saveAsDraft(ComSalePromotionVo promotion) {
        return null;
    }

    @Override
    public ResultMessage delete(ComSalePromotionVo promotion) {
        return null;
    }

    @Override
    public ComSalePromotionVo[] queryPromotion(PromotionQueryVo query) {
        return new ComSalePromotionVo[0];
    }

    @Override
    public String getId() {
        return null;
    }
}
