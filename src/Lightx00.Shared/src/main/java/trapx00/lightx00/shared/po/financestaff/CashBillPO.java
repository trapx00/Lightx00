package trapx00.lightx00.shared.po.financestaff;

import java.util.Date;
import trapx00.lightx00.shared.po.bill.BillState;


public class CashBillPo extends FinanceBillPo {
    String operatorId;
    String accountId;
    CashBillItem[] items;

    public CashBillPo(String id, Date date, BillState state) {
        super(id, date, state, FinanceBillType.CashBill);
    }
}

