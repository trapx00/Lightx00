package trapx00.lightx00.shared.vo.salestaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.salestaff.PurchaseBillType;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVo;

import java.util.Date;

public class PurchaseRefundBillVo extends PurchaseBillBaseVo {
    String supplier;
    int repository;
    SaleStaffVo operator;
    String Comment;
    double total;
    CommodityVo[] commodityList;

    public PurchaseRefundBillVo(String Id, Date date, BillState state,  String supplier, int repository, SaleStaffVo operator, String comment, double total, CommodityVo[] commodityList) {
        super(Id, date, state, PurchaseBillType.PurchaseRefund);
        this.supplier = supplier;
        this.repository = repository;
        this.operator = operator;
        Comment = comment;
        this.total = total;
        this.commodityList = commodityList;
    }
}
