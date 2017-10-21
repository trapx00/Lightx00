package trapx00.lightx00.shared.vo.salestaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.vo.BillVo;

import java.util.Date;

public class SaleBillBaseVo extends BillVo {
    SaleBillType saleBillType;

    public SaleBillBaseVo( String Id, Date date, BillState state, SaleBillType saleBillType) {
        super(BillType.SaleBill, Id, date, state);
        this.saleBillType = saleBillType;
    }
}
