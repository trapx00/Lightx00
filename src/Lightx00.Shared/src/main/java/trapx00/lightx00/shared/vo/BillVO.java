package trapx00.lightx00.shared.vo;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;

import java.util.Date;

public class BillVo {
    BillType bill;
    String id;
    Date date;
    BillState state;

    public BillVo(BillType bill, String id, Date date, BillState state) {
        this.bill = bill;
        this.id = id;
        this.date = date;
        this.state = state;
    }
}
