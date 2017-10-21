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

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public CashBillItem[] getItems() {
        return items;
    }

    public void setItems(CashBillItem[] items) {
        this.items = items;
    }
}

