package trapx00.lightx00.shared.po.inventorystaff;

import java.util.Date;

public class InventoryViewPo {
    Date time;
    double inventoryAmount;//入库数量
    double inventoryMoney;//入库金额
    double outOfInventoryAmount;//出库数量
    double outOfInVentoryMoney;//出库金额
    double sum;//合计
    double inSoldPrice;//最近进价
    double outSoldPrice;//最近售价

    public InventoryViewPo(Date time, double inventoryAmount, double inventoryMoney, double outOfInventoryAmount, double outOfInVentoryMoney, double sum, double inSoldPrice, double outSoldPrice) {
        this.time = time;
        this.inventoryAmount = inventoryAmount;
        this.inventoryMoney = inventoryMoney;
        this.outOfInventoryAmount = outOfInventoryAmount;
        this.outOfInVentoryMoney = outOfInVentoryMoney;
        this.sum = sum;
        this.inSoldPrice = inSoldPrice;
        this.outSoldPrice = outSoldPrice;
    }
}
