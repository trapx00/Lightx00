package trapx00.lightx00.shared.vo.financestaff;

import java.util.Date;

public class SaleRecordVo { //商品销售记录
    private Date date;
    private String commodityName;
    private String model;
    private double amount;
    private double unitPrice;
    private double total;

    public SaleRecordVo(Date date, String commodityName, String model, double amount, double unitPrice, double total) {
        this.date = date;
        this.commodityName = commodityName;
        this.model = model;
        this.amount = amount;
        this.unitPrice = unitPrice;
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
