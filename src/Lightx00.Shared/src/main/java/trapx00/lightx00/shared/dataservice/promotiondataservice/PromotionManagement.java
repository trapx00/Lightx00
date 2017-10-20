package trapx00.lightx00.shared.dataservice.promotiondataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPO;
import trapx00.lightx00.shared.po.manager.promotion.PromotionPOBase;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;

import java.util.Date;

public interface PromotionManagement {
    ResultMessage submit(PromotionPOBase promotion);
    PromotionPOBase[] queryPromotion(Date[] timeRange, PromotionType promotionType, int clientLevel, double totalPrice);
    ResultMessage delete(PromotionPOBase promotion);
    CommodityPO[] queryCommodity(String ID,String type,String name);
}
