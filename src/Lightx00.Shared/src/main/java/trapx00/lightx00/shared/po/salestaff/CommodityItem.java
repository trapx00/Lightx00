package trapx00.lightx00.shared.po.salestaff;

import java.io.Serializable;

public class CommodityItem implements Serializable {

    private String commodityId;
    private double price;
    private double number;

    public CommodityItem(String commodityId, double price,double number) {
        this.commodityId = commodityId;
        this.price=price;
        this.number = number;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}
