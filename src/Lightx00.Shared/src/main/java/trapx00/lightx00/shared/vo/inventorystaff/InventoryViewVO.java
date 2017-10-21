package trapx00.lightx00.shared.vo.inventorystaff;

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

    public InventoryViewVo(Date time, double inventoryAmounts, double inventoryMoney, double outOfInventoryAmounts, double outOfInventoryMoney, double sum, double inSoldPrice, double outSoldPrice) {
        this.time = time;
        this.inventoryAmounts = inventoryAmounts;
        this.inventoryMoney = inventoryMoney;
        this.outOfInventoryAmounts = outOfInventoryAmounts;
        this.outOfInventoryMoney = outOfInventoryMoney;
        this.sum = sum;
        this.inSoldPrice = inSoldPrice;
        this.outSoldPrice = outSoldPrice;
    }
}
