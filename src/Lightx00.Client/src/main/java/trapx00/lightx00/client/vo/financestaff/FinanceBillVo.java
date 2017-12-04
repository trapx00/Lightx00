package trapx00.lightx00.client.vo.financestaff;

import java.util.Date;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.po.financestaff.FinanceBillType;
import trapx00.lightx00.client.vo.BillVo;


public abstract class FinanceBillVo extends BillVo {
    protected FinanceBillType financeBillType;
    protected String operatorId;

    public FinanceBillVo(FinanceBillType financeBillType, String id, Date date,
                         BillState state, String operatorId) {
        super(BillType.FinanceBill, id, date, state);
        this.financeBillType = financeBillType;
        this.operatorId = operatorId;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public FinanceBillType getFinanceBillType() {
        return financeBillType;
    }

    public void setFinanceBillType(FinanceBillType financeBillType) {
        this.financeBillType = financeBillType;
    }
}
