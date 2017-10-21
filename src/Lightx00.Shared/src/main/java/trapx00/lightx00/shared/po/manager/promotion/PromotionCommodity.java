package trapx00.lightx00.shared.po.manager.promotion;

public class PromotionCommodity {
    private String id;
    private String commodityId;
    private double amount;

    public double getAmount() {
        return amount;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public String getId() {
        return id;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }
}
