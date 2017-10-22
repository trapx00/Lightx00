package trapx00.lightx00.shared.dataservicestub.promotiondataservice;

import trapx00.lightx00.shared.dataservice.promotiondataservice.PromotionManagementDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.manager.promotion.PromotionPoBase;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;

import java.util.Date;

public class PromotionManagementDataServiceStub implements PromotionManagementDataService {
    @Override
    public ResultMessage submit(PromotionPoBase promotion) {
        return ResultMessage.Success;
    }

    @Override
    public PromotionPoBase[] queryPromotion(Date[] timeRange, PromotionType promotionType, int clientLevel, double totalPrice) {
        return new PromotionPoBase[]{
                new PromotionPoBase("0001", PromotionType.CommodityOnSale,new Date(),new Date(), PromotionState.Waiting)
        };
    }

    @Override
    public ResultMessage delete(PromotionPoBase promotion) {
        return ResultMessage.Success;
    }

    @Override
    public CommodityPo[] queryCommodity(String id, String type, String name) {
        return new CommodityPo[]{
                new CommodityPo("000001","落地灯",null,1,new Date(),null,null,100,100,150,150,10)
        };
    }
}
