package trapx00.lightx00.shared.po.manager.promotion;

import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;

import java.util.Date;

public class ClientPromotionPo extends PromotionPoBase {
    private int clientLevel;
    private double couponPrice;
    private CommodityPo[] promotionCommodity;
    private double salePrice;

    public ClientPromotionPo(String id, Date startDate, Date endDate, PromotionState state, int clientLevel, double couponPrice,CommodityPo[] promotionCommodity,double salePrice) {
        super(id, PromotionType.ClientPromotion, startDate, endDate, PromotionState.Waiting);
        this.clientLevel = clientLevel;
        this.couponPrice = couponPrice;
        this.promotionCommodity = promotionCommodity;
        this.salePrice = salePrice;
    }

    public int getClientLevel() {
        return clientLevel;
    }

    public void setClientLevel(int clientLevel) {
        this.clientLevel = clientLevel;
    }

    public double getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(double couponPrice) {
        this.couponPrice = couponPrice;
    }

    public CommodityPo[] getPromotionCommodity() {
        return promotionCommodity;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setPromotionCommodity() {
        this.promotionCommodity = promotionCommodity;
    }

    public void setSalePrice() {
        this.salePrice = salePrice;
    }
}
