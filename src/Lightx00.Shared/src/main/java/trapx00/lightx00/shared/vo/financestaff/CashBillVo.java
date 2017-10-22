package trapx00.lightx00.shared.vo.financestaff;

import java.util.Date;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.CashBillItem;
import trapx00.lightx00.shared.po.financestaff.FinanceBillType;

public class CashBillVo extends FinanceBillVo {
    private FinanceStaffVo operator;
    private BankAccountVo account;
    private CashBillItem[] items;


    public CashBillVo(String id, Date date, BillState state, FinanceStaffVo operator,
                      BankAccountVo account, CashBillItem[] items) {
        super(FinanceBillType.CashBill, id, date, state);
        this.operator = operator;
        this.account = account;
        this.items = items;
    }

    public FinanceStaffVo getOperator() {
        return operator;
    }

    public void setOperator(FinanceStaffVo operator) {
        this.operator = operator;
    }

    public BankAccountVo getAccount() {
        return account;
    }

    public void setAccount(BankAccountVo account) {
        this.account = account;
    }

    public CashBillItem[] getItems() {
        return items;
    }

    public void setItems(CashBillItem[] items) {
        this.items = items;
    }
}
