package trapx00.lightx00.client.vo.inventorystaff;

import java.util.Date;

public class InventoryViewVo {
    Date time;
    double inventoryAmounts;//入库数量
    double inventoryMoney;//入库金额
    double outOfInventoryAmounts;//出库数量
    double outOfInventoryMoney;//出库金额
    double sum;//合计
    double inSoldPrice;//最近进价
    double outSoldPrice;//最近售价

    public InventoryViewVo(Date time, double inventoryAmounts, double inventoryMoney,
                           double outOfInventoryAmounts, double outOfInventoryMoney, double sum,
                           double inSoldPrice, double outSoldPrice) {
        this.time = time;
        this.inventoryAmounts = inventoryAmounts;
        this.inventoryMoney = inventoryMoney;
        this.outOfInventoryAmounts = outOfInventoryAmounts;
        this.outOfInventoryMoney = outOfInventoryMoney;
        this.sum = sum;
        this.inSoldPrice = inSoldPrice;
        this.outSoldPrice = outSoldPrice;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public double getInventoryAmounts() {
        return inventoryAmounts;
    }

    public void setInventoryAmounts(double inventoryAmounts) {
        this.inventoryAmounts = inventoryAmounts;
    }

    public double getInventoryMoney() {
        return inventoryMoney;
    }

    public void setInventoryMoney(double inventoryMoney) {
        this.inventoryMoney = inventoryMoney;
    }

    public double getOutOfInventoryAmounts() {
        return outOfInventoryAmounts;
    }

    public void setOutOfInventoryAmounts(double outOfInventoryAmounts) {
        this.outOfInventoryAmounts = outOfInventoryAmounts;
    }

    public double getOutOfInventoryMoney() {
        return outOfInventoryMoney;
    }

    public void setOutOfInventoryMoney(double outOfInventoryMoney) {
        this.outOfInventoryMoney = outOfInventoryMoney;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getInSoldPrice() {
        return inSoldPrice;
    }

    public void setInSoldPrice(double inSoldPrice) {
        this.inSoldPrice = inSoldPrice;
    }

    public double getOutSoldPrice() {
        return outSoldPrice;
    }

    public void setOutSoldPrice(double outSoldPrice) {
        this.outSoldPrice = outSoldPrice;
    }
}
