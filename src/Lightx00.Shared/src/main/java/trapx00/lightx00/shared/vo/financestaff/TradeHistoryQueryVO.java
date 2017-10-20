package trapx00.lightx00.shared.vo.financestaff;

import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.vo.EmployeeVO;
import trapx00.lightx00.shared.vo.salestaff.ClientVO;

import java.util.Date;

public class TradeHistoryQueryVO { //经营历程表查询条件
    Date start;
    Date end;
    BillType billType;
    ClientVO client;
    EmployeeVO operator;
    int inventory;
}
