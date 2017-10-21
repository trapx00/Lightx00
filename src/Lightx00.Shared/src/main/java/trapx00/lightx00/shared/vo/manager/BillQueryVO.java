package trapx00.lightx00.shared.vo.manager;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;

import java.util.Date;

public class BillQueryVo{ //得到待审批单据
    String Id;
    BillType type;
    Date date;
    BillState state;

    public BillQueryVo(String Id, BillType type, Date date, BillState state) {
        this.Id = Id;
        this.type = type;
        this.date = date;
        this.state = state;
    }
}
