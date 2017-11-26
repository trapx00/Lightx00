package trapx00.lightx00.shared.po.manager.promotion;

import com.j256.ormlite.field.DatabaseField;

import java.io.Serializable;

public class PromotionCommodity implements Serializable {
    @DatabaseField
    private String id;
    @DatabaseField
    private String commodityId;
    @DatabaseField
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
