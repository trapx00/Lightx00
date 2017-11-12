package trapx00.lightx00.client.vo.salestaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.client.vo.BillVo;

import java.util.Date;

public abstract class SaleBillBaseVo extends BillVo {
    private SaleBillType saleBillType;

    public SaleBillType getSaleBillType() {
        return saleBillType;
    }

    public SaleBillBaseVo(String id, Date date, BillState state, SaleBillType saleBillType) {
        super(BillType.SaleBill, id, date, state);
        this.saleBillType = saleBillType;
    }
}
