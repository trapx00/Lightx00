package trapx00.lightx00.client.blservice.promotionblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.PromotionPOBase;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityQueryVO;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVO;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionQueryVO;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionVOBase;

public interface PromotionManagement {
    ResultMessage submit(PromotionVOBase newPromotion);
    ResultMessage saveAsDraft(PromotionVOBase promotion);
    ResultMessage delete(PromotionPOBase promotion);
    PromotionVOBase resume();
    PromotionVOBase[] queryPromotion(PromotionQueryVO query);
    CommodityVO[] queryCommodity(CommodityQueryVO commodity);
}
