package trapx00.lightx00.shared.po.salestaff;

import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;

import java.util.Date;

public class PurchaseBillBasePo extends BillPo {

    private PurchaseBillType purchaseBillType;

    public PurchaseBillType getPurchaseBillType() {
        return purchaseBillType;
    }

    public PurchaseBillBasePo(String id, Date date, BillState state, PurchaseBillType purchaseBillType) {
        super(BillType.InventoryBill, id, date, state);
        this.purchaseBillType = purchaseBillType;
    }
}
