package trapx00.lightx00.shared.vo.financestaff;

import java.util.Date;
import trapx00.lightx00.shared.vo.salestaff.ClientVo;
import trapx00.lightx00.shared.vo.salestaff.SaleStaffVo;



public class SaleDetailQueryVo { //销售明细表查询条件
    Date start;
    Date end;
    String commodityName;
    ClientVo client;
    SaleStaffVo operator;
    int inventory;

    public SaleDetailQueryVo(Date start, Date end, String commodityName, ClientVo client,
                             SaleStaffVo operator, int inventory) {
        this.start = start;
        this.end = end;
        this.commodityName = commodityName;
        this.client = client;
        this.operator = operator;
        this.inventory = inventory;
    }
}
