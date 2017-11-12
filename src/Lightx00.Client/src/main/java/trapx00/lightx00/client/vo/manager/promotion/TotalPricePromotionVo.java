package trapx00.lightx00.client.vo.manager.promotion;

import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;

import java.util.Date;

public class TotalPricePromotionVo extends PromotionVoBase {
    private double couponPrice;
    private double totalPrice;
    private CommodityPo[] promotionCommodity;

    public TotalPricePromotionVo(String id, Date startDate, Date endDate,
                                 PromotionState state, double couponPrice, double totalPrice,CommodityPo[] promotionCommodity) {
        super(id, PromotionType.TotalPricePromotion, startDate, endDate, PromotionState.Waiting);
        this.couponPrice = couponPrice;
        this.totalPrice = totalPrice;
        this.promotionCommodity = promotionCommodity;
    }

    public void setCouponPrice(double couponPrice) {
        this.couponPrice = couponPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getCouponPrice() {
        return couponPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public CommodityPo[] getPromotionCommodity() {
        return promotionCommodity;
    }

    public void setPromotionCommodity() {
        this.promotionCommodity = promotionCommodity;
    }

}
