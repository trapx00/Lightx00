package trapx00.lightx00.shared.po.inventorystaff;

import java.util.Date;

public class InventoryDetailBillPO extends InventoryBillPO{//报损报溢报警
    String ID;//单据编号
    String operatorID;//操作员编号
    String[] commodityIDList;//商品
    double[] amounts;//报损/报溢/报警数量
    Date time;
}
