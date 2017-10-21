package trapx00.lightx00.shared.vo.salestaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.vo.EmployeeVo;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVo;

import java.util.Date;

public class SaleRefundBillVo extends SaleBillBaseVo {
    String supplier;
    EmployeeVo defaultOperator;
    SaleStaffVo operator;
    int repository;
    CommodityVo[] commodityList;
    double originTotal;
    double minusProfits;
    double token;
    double ultiTotal;
    String Comment;

    public SaleRefundBillVo(String Id, Date date, BillState state,  String supplier, EmployeeVo defaultOperator, SaleStaffVo operator, int repository, CommodityVo[] commodityList, double originTotal, double minusProfits, double token, double ultiTotal, String comment) {
        super(Id, date, state, SaleBillType.SaleRefund);
        this.supplier = supplier;
        this.defaultOperator = defaultOperator;
        this.operator = operator;
        this.repository = repository;
        this.commodityList = commodityList;
        this.originTotal = originTotal;
        this.minusProfits = minusProfits;
        this.token = token;
        this.ultiTotal = ultiTotal;
        Comment = comment;
    }
}
