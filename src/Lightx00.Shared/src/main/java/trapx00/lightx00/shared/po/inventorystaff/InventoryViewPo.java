package trapx00.lightx00.shared.po.inventorystaff;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;


@DatabaseTable(tableName = "InventoryViewBill")
public class InventoryViewPo {
    @DatabaseField(id=true)
    private String id;
    @DatabaseField
    private  Date time;
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
    @DatabaseField
    private  double outSoldPrice;//最近售价
    public InventoryViewPo(){

    }
    public InventoryViewPo(String id,Date time, double inventoryAmount, double inventoryMoney,
                           double outOfInventoryAmount, double outOfInVentoryMoney, double sum,
                           double inSoldPrice, double outSoldPrice) {
        this.id=id;
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
