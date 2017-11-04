package trapx00.lightx00.client.bl.promotionbl;

import trapx00.lightx00.client.blservice.promotionblservice.PromotionManagementBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionQueryVo;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionVoBase;
import trapx00.lightx00.shared.vo.salestaff.SaleBillVo;

public class PromotionBlController implements PromotionInfo,PromotionManagementBlService {
    @Override
    public PromotionVoBase[] queryPromotion(SaleBillVo saleBill) {
        return new PromotionVoBase[0];
    }

    @Override
    public ResultMessage submit(PromotionVoBase newPromotion) {
        return null;
    }

    @Override
    public ResultMessage saveAsDraft(PromotionVoBase promotion) {
        return null;
    }

    @Override
    public ResultMessage delete(PromotionVoBase promotion) {
        return null;
    }

    @Override
    public PromotionVoBase[] queryPromotion(PromotionQueryVo query) {
        return new PromotionVoBase[0];
    }

    @Override
    public String getId() {
        return null;
    }
}
