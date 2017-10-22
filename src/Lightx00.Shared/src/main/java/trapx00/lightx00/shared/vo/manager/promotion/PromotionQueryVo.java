package trapx00.lightx00.shared.vo.manager.promotion;

import trapx00.lightx00.shared.po.manager.promotion.PromotionType;

import java.util.Date;

public class PromotionQueryVo {
    private String id;
    private PromotionType type;
    private Date startDate;
    private Date endDate;
    private int clientLevel;
    private double couponPrice;
    private double totalPrice;

    public PromotionQueryVo(String id,PromotionType type,Date startDate,Date endDate,int clientLevel,double couponPrice,double totalPrice){
        this.id = id;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.clientLevel = clientLevel;
        this.couponPrice = couponPrice;
        this.totalPrice = totalPrice;
    }

    public String getId() {
        return id;
    }

    public PromotionType getType() {
        return type;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getClientLevel() {
        return clientLevel;
    }

    public double getCouponPrice() {
        return couponPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(PromotionType type) {
        this.type = type;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setClientLevel(int clientLevel) {
        this.clientLevel = clientLevel;
    }

    public void setCouponPrice(double couponPrice) {
        this.couponPrice = couponPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
