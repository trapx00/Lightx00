package trapx00.lightx00.shared.po.salestaff;

public class CommodityItem {

    private String commodityId;
    private double number;

    public CommodityItem(String commodityId, double number) {
        commodityId = commodityId;
        this.number = number;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public double getNumber() {
        return number;
    }

    public void setCommodityId(String commodityId) {
        commodityId = commodityId;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}
