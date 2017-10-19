package trapx00.lightx00.shared.vo.manager;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;

import java.util.Date;

public class BillQueryVO{ //得到待审批单据
    String ID;
    BillType type;
    Date date;
    BillState state;
}
