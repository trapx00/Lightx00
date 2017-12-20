package trapx00.lightx00.shared.po.manager.promotion;

import trapx00.lightx00.shared.queryvo.CommodityQueryVo;

import java.io.Serializable;

public class PromotionCommodity implements Serializable {
    private String commodityId;
    private double amount;
    private double unitPrice;

    public PromotionCommodity(){
        ;
    }

    public PromotionCommodity(String id, double amount,double unitPrice){
        this.commodityId=id;
        this.amount=amount;
        this.unitPrice=unitPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getAmount() {
        return amount;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }
}
