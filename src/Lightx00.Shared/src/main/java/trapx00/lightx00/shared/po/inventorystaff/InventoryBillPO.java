package trapx00.lightx00.shared.po.inventorystaff;

import java.util.Date;

import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;

public class InventoryBillPo extends BillPo {

    InventoryBillType inventoryBillType;

    public InventoryBillPo(String id, Date date, BillState state,
                           InventoryBillType inventoryBillType) {
        super(BillType.InventoryBill, id, date, state);
        this.inventoryBillType = inventoryBillType;
    }

    public InventoryBillType getInventoryBillType() {
        return inventoryBillType;
    }

    public void setInventoryBillType(InventoryBillType inventoryBillType) {
        this.inventoryBillType = inventoryBillType;
    }
}
