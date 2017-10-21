package trapx00.lightx00.shared.po.salestaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;

import java.util.Date;

public class PurchaseRefundBillPo extends PurchaseBillBasePo {
    private String supplier;
    private int repository;
    private String operatorId;
    private String comment;
    private double total;
    private CommodityPo[] commodityList;

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

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
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

    public CommodityPo[] getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(CommodityPo[] commodityList) {
        this.commodityList = commodityList;
    }

    public PurchaseRefundBillPo(String id, Date date, BillState state, String supplier, int repository, String operatorId, String comment, double total, CommodityPo[] commodityList) {
        super(id, date, state, PurchaseBillType.PurchaseRefund);
        this.supplier = supplier;
        this.repository = repository;
        this.operatorId = operatorId;
        this.comment = comment;
        this.total = total;
        this.commodityList = commodityList;
    }


}
