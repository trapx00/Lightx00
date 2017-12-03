package trapx00.lightx00.shared.po.inventorystaff;

import com.j256.ormlite.field.DatabaseField;

import java.io.Serializable;
import java.util.Date;

public class InventoryViewItem implements Serializable {
    @DatabaseField
    private Date operaDate;
    @DatabaseField
    private  double inventoryAmount;//入库数量
    @DatabaseField
    private  double inventoryMoney;//入库金额
    @DatabaseField
    private  double outOfInventoryAmount;//出库数量
    @DatabaseField
    private  double outOfInVentoryMoney;//
    @DatabaseField
    private  double sum;//合计
    @DatabaseField
    private  double inSoldPrice;//最近进价

    public InventoryViewItem (Date time, double inventoryAmount, double inventoryMoney,
                           double outOfInventoryAmount, double outOfInVentoryMoney, double sum,
                           double inSoldPrice, double outSoldPrice) {
        this.operaDate=time;
        this.inventoryAmount = inventoryAmount;
        this.inventoryMoney = inventoryMoney;
        this.outOfInventoryAmount = outOfInventoryAmount;
        this.outOfInVentoryMoney = outOfInVentoryMoney;
        this.sum = sum;
        this.inSoldPrice = inSoldPrice;
        this.outSoldPrice = outSoldPrice;
    }

    public double getInventoryAmount() {
        return inventoryAmount;
    }

    public void setInventoryAmount(double inventoryAmount) {
        this.inventoryAmount = inventoryAmount;
    }

    public double getInventoryMoney() {
        return inventoryMoney;
    }

    public void setInventoryMoney(double inventoryMoney) {
        this.inventoryMoney = inventoryMoney;
    }

    public double getOutOfInventoryAmount() {
        return outOfInventoryAmount;
    }

    public void setOutOfInventoryAmount(double outOfInventoryAmount) {
        this.outOfInventoryAmount = outOfInventoryAmount;
    }

    public double getOutOfInVentoryMoney() {
        return outOfInVentoryMoney;
    }

    public void setOutOfInVentoryMoney(double outOfInVentoryMoney) {
        this.outOfInVentoryMoney = outOfInVentoryMoney;
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

    @DatabaseField
    private  double outSoldPrice;//最近售价
}
