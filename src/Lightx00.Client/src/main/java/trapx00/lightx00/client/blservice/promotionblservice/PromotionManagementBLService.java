package trapx00.lightx00.client.blservice.promotionblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.PromotionPoBase;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityQueryVo;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionQueryVo;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionVoBase;

public interface PromotionManagementBlService {

    ResultMessage submit(PromotionVoBase newPromotion);

    ResultMessage saveAsDraft(PromotionVoBase promotion);

    ResultMessage delete(PromotionPoBase promotion);

    PromotionVoBase resume();

    PromotionVoBase[] queryPromotion(PromotionQueryVo query);

    CommodityVo[] queryCommodity(CommodityQueryVo commodity);
}