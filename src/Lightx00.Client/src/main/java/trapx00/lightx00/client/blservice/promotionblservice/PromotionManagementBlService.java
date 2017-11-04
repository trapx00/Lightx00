package trapx00.lightx00.client.blservice.promotionblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.shared.vo.manager.promotion.CommodityQueryVo;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionQueryVo;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionVoBase;

public interface PromotionManagementBlService {

    ResultMessage submit(PromotionVoBase newPromotion);

    ResultMessage saveAsDraft(PromotionVoBase promotion);

    ResultMessage delete(PromotionVoBase promotion);

    PromotionVoBase[] queryPromotion(PromotionQueryVo query);

    String getId();
}
