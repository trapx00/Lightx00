package trapx00.lightx00.shared.vo.financestaff;

import java.util.Date;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.po.financestaff.FinanceBillType;
import trapx00.lightx00.shared.vo.BillVo;


public class FinanceBillVo extends BillVo {
    FinanceBillType financeBillType;
    public FinanceBillVo(FinanceBillType financeBillType, String id, Date date,
                         BillState state) {
        super(BillType.FinanceBill, id, date, state);
        this.financeBillType = financeBillType;
    }

    public FinanceBillType getFinanceBillType() {
        return financeBillType;
    }

    public void setFinanceBillType(FinanceBillType financeBillType) {
        this.financeBillType = financeBillType;
    }
}
