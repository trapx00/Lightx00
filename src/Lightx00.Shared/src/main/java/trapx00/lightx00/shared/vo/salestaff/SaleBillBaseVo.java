package trapx00.lightx00.shared.vo.salestaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.vo.BillVo;

import java.util.Date;

public class SaleBillBaseVo extends BillVo {
    private SaleBillType saleBillType;

    public SaleBillType getSaleBillType() {
        return saleBillType;
    }

    public void setSaleBillType(SaleBillType saleBillType) {
        this.saleBillType = saleBillType;
    }

    public SaleBillBaseVo(String id, Date date, BillState state, SaleBillType saleBillType) {
        super(BillType.SaleBill, id, date, state);
        this.saleBillType = saleBillType;
    }
}
