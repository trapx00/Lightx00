package trapx00.lightx00.shared.vo.inventorystaff;

import java.util.Date;

public class InventoryBillVO {//报损报溢报警
    String ID;
    String operatorID;
    String[] IDlist;//商品
    double[] amountList;//报损报警报溢数量
    InventoryBillType type;
    Date time;
}
