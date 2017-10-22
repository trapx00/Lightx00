package trapx00.lightx00.shared.po.inventorystaff;

import java.util.Date;

public class InventoryViewPo {
    private  Date time;
    private  double inventoryAmount;//入库数量
    private  double inventoryMoney;//入库金额
    private  double outOfInventoryAmount;//出库数量
    private  double outOfInVentoryMoney;//出库金额
    private  double sum;//合计
    private  double inSoldPrice;//最近进价
    private  double outSoldPrice;//最近售价

    public InventoryViewPo(Date time, double inventoryAmount, double inventoryMoney,
                           double outOfInventoryAmount, double outOfInVentoryMoney, double sum,
                           double inSoldPrice, double outSoldPrice) {
        this.time = time;
        this.inventoryAmount = inventoryAmount;
        this.inventoryMoney = inventoryMoney;
        this.outOfInventoryAmount = outOfInventoryAmount;
        this.outOfInVentoryMoney = outOfInVentoryMoney;
        this.sum = sum;
        this.inSoldPrice = inSoldPrice;
        this.outSoldPrice = outSoldPrice;
    }

    public Date getTime() {
        return time;
    }

    public double getInventoryAmount() {
        return inventoryAmount;
    }

    public double getInventoryMoney() {
        return inventoryMoney;
    }

    public double getOutOfInventoryAmount() {
        return outOfInventoryAmount;
    }

    public double getOutOfInVentoryMoney() {
        return outOfInVentoryMoney;
    }

    public double getSum() {
        return sum;
    }

    public double getInSoldPrice() {
        return inSoldPrice;
    }

    public double getOutSoldPrice() {
        return outSoldPrice;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setInventoryAmount(double inventoryAmount) {
        this.inventoryAmount = inventoryAmount;
    }

    public void setInventoryMoney(double inventoryMoney) {
        this.inventoryMoney = inventoryMoney;
    }

    public void setOutOfInventoryAmount(double outOfInventoryAmount) {
        this.outOfInventoryAmount = outOfInventoryAmount;
    }

    public void setOutOfInVentoryMoney(double outOfInVentoryMoney) {
        this.outOfInVentoryMoney = outOfInVentoryMoney;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void setInSoldPrice(double inSoldPrice) {
        this.inSoldPrice = inSoldPrice;
    }

    public void setOutSoldPrice(double outSoldPrice) {
        this.outSoldPrice = outSoldPrice;
    }
}
