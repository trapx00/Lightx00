package trapx00.lightx00.shared.po.financestaff;

import java.util.Date;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;


public class FinanceBillPo extends BillPo {
    @DatabaseField
    private FinanceBillType financeBillType;

    @DatabaseField
    private String operatorId;

    public FinanceBillType getFinanceBillType() {
        return financeBillType;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public FinanceBillPo(String id, Date date, BillState state, FinanceBillType financeBillType, String operatorId) {
        super(BillType.FinanceBill, id, date, state);
        this.financeBillType = financeBillType;
        this.operatorId = operatorId;
    }

    public FinanceBillPo() {
    }

    @Override
    public String toString() {
        return "FinanceBillPo{" +
            "financeBillType=" + financeBillType +
            ", operatorId='" + operatorId + '\'' +
            "} " + super.toString();
    }
}
