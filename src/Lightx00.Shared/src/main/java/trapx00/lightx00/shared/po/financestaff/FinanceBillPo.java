package trapx00.lightx00.shared.po.financestaff;

import java.util.Date;

import com.j256.ormlite.field.DatabaseField;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;


public class FinanceBillPo extends BillPo {
    @DatabaseField
    private FinanceBillType financeBillType;


    public FinanceBillPo() {
    }

    public FinanceBillPo(String id, Date date, BillState state, FinanceBillType financeBillType) {
        super(BillType.FinanceBill, id, date, state);
        this.financeBillType = financeBillType;
    }

    public FinanceBillType getFinanceBillType() {
        return financeBillType;
    }

    public void setFinanceBillType(FinanceBillType financeBillType) {
        this.financeBillType = financeBillType;
    }

    @Override
    public String toString() {
        return "FinanceBillPo{" +
            "financeBillType=" + financeBillType +
            "} " + super.toString();
    }
}
