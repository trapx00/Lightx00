package trapx00.lightx00.shared.po.financestaff;

import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;

import java.util.Date;

public class FinanceBillPo extends BillPo {
    FinanceBillType financeBillType;

    public FinanceBillPo(String id, Date date, BillState state, FinanceBillType financeBillType) {
        super(BillType.FinanceBill, id, date, state);
        this.financeBillType = financeBillType;
    }
}
