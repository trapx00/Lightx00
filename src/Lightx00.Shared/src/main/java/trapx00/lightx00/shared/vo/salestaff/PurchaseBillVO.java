package trapx00.lightx00.shared.vo.salestaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.salestaff.PurchaseBillType;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVo;

import java.util.Date;

public class PurchaseBillVo extends PurchaseBillBaseVo {
    private String supplier;
    private int repository;
    private SaleStaffVo operator;
    private String comment;
    private double total;
    private CommodityVo[] commodityList;

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public int getRepository() {
        return repository;
    }

    public void setRepository(int repository) {
        this.repository = repository;
    }

    public SaleStaffVo getOperator() {
        return operator;
    }

    public void setOperator(SaleStaffVo operator) {
        this.operator = operator;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        comment = comment;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public CommodityVo[] getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(CommodityVo[] commodityList) {
        this.commodityList = commodityList;
    }

    public PurchaseBillVo(String id, Date date, BillState state, String supplier, int repository, SaleStaffVo operator, String comment, double total, CommodityVo[] commodityList) {
        super(id, date, state, PurchaseBillType.Purchase);
        this.supplier = supplier;
        this.repository = repository;
        this.operator = operator;
        this.comment = comment;
        this.total = total;
        this.commodityList = commodityList;
    }
}
