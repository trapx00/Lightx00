package trapx00.lightx00.client.bl.promotionbl.mock;

import trapx00.lightx00.client.bl.promotionbl.PromotionInfoController;
import trapx00.lightx00.client.vo.manager.promotion.TotalPricePromotionVo;
import trapx00.lightx00.client.vo.manager.promotion.PromotionVoBase;
import trapx00.lightx00.client.vo.salestaff.SaleBillVo;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;

import java.util.Date;

public class PromotionInfoControllerMock extends PromotionInfoController {
    /**
     * give promotion information to the saleman
     * @param saleBill SallBillVo which asks for useable promotion in this sale beheavior
     * @return array of promotions that can be used in this sale
     */
    @Override
    public PromotionVoBase[] queryPromotion(SaleBillVo saleBill) {
        return new PromotionVoBase[] {
                new TotalPricePromotionVo("0001",new Date(),new Date(), PromotionState.Waiting,200,1000,new CommodityPo[0])
        };
    }

}
