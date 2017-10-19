package trapx00.lightx00.shared.vo.inventorystaff;

import java.util.Date;

public class InventoryViewVO {
    Date time;
    double inventoryAmounts;//入库数量
    double inventoryMoney;//入库金额
    double outOfInventoryAmounts;//出库数量
    double outOfInventoryMoney;//出库金额
    double sum;//合计
    double inSoldPrice;//最近进价
    double outSoldPrice;//最近售价
}
