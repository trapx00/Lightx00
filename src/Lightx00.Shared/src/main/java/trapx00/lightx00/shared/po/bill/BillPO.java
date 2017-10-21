package trapx00.lightx00.shared.po.bill;

import java.util.Date;

public class BillPo {
    BillType bill;
    String id;
    Date date;
    BillState state;

    public BillPo(BillType bill, String id, Date date, BillState state) {
        this.bill = bill;
        this.id = id;
        this.date = date;
        this.state = state;
    }
}

