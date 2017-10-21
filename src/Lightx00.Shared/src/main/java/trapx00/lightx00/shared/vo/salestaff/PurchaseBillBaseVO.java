package trapx00.lightx00.shared.vo.salestaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.po.salestaff.PurchaseBillType;
import trapx00.lightx00.shared.vo.BillVo;

import java.util.Date;

public class PurchaseBillBaseVo extends BillVo {
    PurchaseBillType purchaseBillType;

    public PurchaseBillBaseVo(String Id, Date date, BillState state, PurchaseBillType purchaseBillType) {
        super(BillType.SaleBill, Id, date, state);
        this.purchaseBillType = purchaseBillType;
    }
}
