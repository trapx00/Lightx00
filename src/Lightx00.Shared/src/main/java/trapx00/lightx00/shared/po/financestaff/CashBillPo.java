package trapx00.lightx00.shared.po.financestaff;

import java.util.Date;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import trapx00.lightx00.shared.po.bill.BillState;

@DatabaseTable(tableName = "CashBill")
public class CashBillPo extends FinanceBillPo {
    @DatabaseField
    private String operatorId;
    @DatabaseField
    private String accountId;
    @DatabaseField(dataType = DataType.SERIALIZABLE)
    private CashBillItem[] items;

    public CashBillPo(String id, Date date, BillState state, String operatorId,
                      String accountId, CashBillItem[] items) {
        super(id, date, state, FinanceBillType.CashBill);
        this.operatorId = operatorId;
        this.accountId = accountId;
        this.items = items;
    }

    public CashBillPo() {

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

