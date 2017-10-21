package trapx00.lightx00.shared.po.financestaff;

import trapx00.lightx00.shared.po.bill.BillState;

import java.util.Date;

public class CashBillPo extends FinanceBillPo {
    String operatorId;
    String accountId;
    CashBillItem[] items;

    public CashBillPo(String id, Date date, BillState state) {
        super(id, date, state, FinanceBillType.CashBill);
    }
}

