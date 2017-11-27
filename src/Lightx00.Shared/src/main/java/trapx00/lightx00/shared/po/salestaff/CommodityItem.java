package trapx00.lightx00.shared.po.salestaff;

import java.io.Serializable;

public class CommodityItem implements Serializable {

    private String commodityId;
    private double number;

    public CommodityItem(String commodityId, double number) {
        commodityId = commodityId;
        this.number = number;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        commodityId = commodityId;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}
