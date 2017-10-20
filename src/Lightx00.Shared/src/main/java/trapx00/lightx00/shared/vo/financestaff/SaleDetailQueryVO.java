package trapx00.lightx00.shared.vo.financestaff;

import trapx00.lightx00.shared.vo.salestaff.ClientVO;
import trapx00.lightx00.shared.vo.salestaff.SaleStaffVO;

import java.util.Date;

public class SaleDetailQueryVO { //销售明细表查询条件
    Date start;
    Date end;
    String commodityName;
    ClientVO client;
    SaleStaffVO operator;
    int inventory;
}
