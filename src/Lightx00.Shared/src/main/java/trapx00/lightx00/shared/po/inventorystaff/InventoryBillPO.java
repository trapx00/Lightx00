package trapx00.lightx00.shared.po.inventorystaff;

import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;

import java.util.Date;

public class InventoryBillPo extends BillPo {
    InventoryBillType inventoryBillType;

    public InventoryBillPo(String Id, Date date, BillState state, InventoryBillType inventoryBillType) {
        super(BillType.InventoryBill, Id, date, state);
        this.inventoryBillType = inventoryBillType;
    }
}
