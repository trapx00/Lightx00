package trapx00.lightx00.shared.dataservice.promotiondataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.manager.promotion.PromotionPoBase;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;

import java.util.Date;

public interface PromotionManagementDataService {
    ResultMessage submit(PromotionPoBase promotion);

    PromotionPoBase[] queryPromotion(Date[] timeRange, PromotionType promotionType,
                                     int clientLevel, double totalPrice);

    ResultMessage delete(PromotionPoBase promotion);

    CommodityPo[] queryCommodity(String Id,String type,String name);
}
