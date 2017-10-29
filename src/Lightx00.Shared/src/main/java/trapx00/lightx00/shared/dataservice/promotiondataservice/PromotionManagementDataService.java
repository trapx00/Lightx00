package trapx00.lightx00.shared.dataservice.promotiondataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.manager.promotion.PromotionPoBase;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;
import trapx00.lightx00.shared.vo.manager.promotion.CommodityQueryVo;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionQueryVo;

import java.util.Date;

public interface PromotionManagementDataService {
    ResultMessage submit(PromotionPoBase promotion);

    PromotionPoBase[] queryPromotion(PromotionQueryVo query);

    ResultMessage delete(PromotionPoBase promotion);

    CommodityPo[] queryCommodity(CommodityQueryVo query);
}
