package trapx00.lightx00.shared.po.salestaff;

import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;

import java.util.Date;

public class SaleBillBasePo extends BillPo {
    SaleBillType saleBillType;

    public SaleBillBasePo(String Id, Date date, BillState state, SaleBillType saleBillType) {
        super(BillType.SaleBill, Id, date, state);
        this.saleBillType = saleBillType;
    }
}
