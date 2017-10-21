package trapx00.lightx00.shared.vo.financestaff;

import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.vo.EmployeeVo;
import trapx00.lightx00.shared.vo.salestaff.ClientVo;

import java.util.Date;

public class TradeHistoryQueryVo { //经营历程表查询条件
    Date start;
    Date end;
    BillType billType;
    ClientVo client;
    EmployeeVo operator;
    int inventory;

    public TradeHistoryQueryVo(Date start, Date end, BillType billType, ClientVo client, EmployeeVo operator, int inventory) {
        this.start = start;
        this.end = end;
        this.billType = billType;
        this.client = client;
        this.operator = operator;
        this.inventory = inventory;
    }
}
