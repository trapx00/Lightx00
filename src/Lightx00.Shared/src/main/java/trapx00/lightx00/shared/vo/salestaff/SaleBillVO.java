package trapx00.lightx00.shared.vo.salestaff;

import trapx00.lightx00.shared.vo.EmployeeVO;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVO;

public class SaleBillVO extends SaleBillBaseVO {
    String supplier;
    EmployeeVO defaultOperator;
    SaleStaffVO operator;
    int repository;
    CommodityVO[] commodityList;
    double originTotal;
    double minusProfits;
    double token;
    double ultiTotal;
    String Comment;
}
