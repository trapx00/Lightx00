package trapx00.lightx00.shared.vo.financestaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.po.financestaff.CashBillItem;
import trapx00.lightx00.shared.po.financestaff.FinanceBillType;
import trapx00.lightx00.shared.vo.BillVo;

import java.util.Date;

public class CashBillVo extends FinanceBillVo {
    FinanceStaffVo operator;
    BankAccountVo account;
    CashBillItem[] items;


    public CashBillVo(String Id, Date date, BillState state, FinanceStaffVo operator, BankAccountVo account, CashBillItem[] items) {
        super(FinanceBillType.CashBill, Id, date, state);
        this.operator = operator;
        this.account = account;
        this.items = items;
    }
}
