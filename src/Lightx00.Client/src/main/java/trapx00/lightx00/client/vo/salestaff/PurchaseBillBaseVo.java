package trapx00.lightx00.client.vo.salestaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.po.salestaff.PurchaseBillType;
import trapx00.lightx00.client.vo.BillVo;

import java.util.Date;

public class PurchaseBillBaseVo extends BillVo {
    private PurchaseBillType purchaseBillType;

    public PurchaseBillType getPurchaseBillType() {
        return purchaseBillType;
    }

    public void setPurchaseBillType(PurchaseBillType purchaseBillType) {
        this.purchaseBillType = purchaseBillType;
    }

    public PurchaseBillBaseVo(String id, Date date, BillState state, PurchaseBillType purchaseBillType) {
        super(BillType.SaleBill, id, date, state);
        this.purchaseBillType = purchaseBillType;
    }
}
