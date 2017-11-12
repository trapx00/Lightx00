package trapx00.lightx00.shared.po.manager.promotion;

import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;

import java.util.Date;

public class TotalPricePromotionPo extends PromotionPoBase {
    private double couponPrice;
    private double totalPrice;
    private CommodityPo[] promotionCommodity;

    public TotalPricePromotionPo(String id, Date startDate, Date endDate, PromotionState state, double couponPrice, double totalPrice,CommodityPo[] promotionCommodity) {
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

