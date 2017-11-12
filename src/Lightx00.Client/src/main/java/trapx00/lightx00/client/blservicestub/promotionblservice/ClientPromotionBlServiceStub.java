package trapx00.lightx00.client.blservicestub.promotionblservice;

import trapx00.lightx00.client.blservice.promotionblservice.ClientPromotionBlService;
import trapx00.lightx00.client.vo.manager.promotion.ClientPromotionVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

public class ClientPromotionBlServiceStub implements ClientPromotionBlService {
    @Override
    public ResultMessage submit(ClientPromotionVo promotion) {
        return null;
    }

    @Override
    public ResultMessage saveAsDraft(ClientPromotionVo promotion) {
        return null;
    }

    @Override
    public ResultMessage delete(ClientPromotionVo promotion) {
        return null;
    }

    @Override
    public ClientPromotionVo[] queryPromotion(PromotionQueryVo query) {
        return new ClientPromotionVo[0];
    }

    @Override
    public String getId() {
        return null;
    }
}
