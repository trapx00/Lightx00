package trapx00.lightx00.shared.po.salestaff;

import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;

import java.util.Date;

public class PurchaseBillBasePo extends BillPo {
    PurchaseBillType purchaseBillType;

    public PurchaseBillBasePo(String Id, Date date, BillState state, PurchaseBillType purchaseBillType) {
        super(BillType.FinanceBill, Id, date, state);
        this.purchaseBillType = purchaseBillType;
    }
}
