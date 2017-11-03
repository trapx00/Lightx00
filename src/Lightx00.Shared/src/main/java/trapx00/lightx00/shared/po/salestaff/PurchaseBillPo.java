package trapx00.lightx00.shared.po.salestaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;

import java.util.Date;

public class PurchaseBillPo extends PurchaseBillBasePo {
    private String supplier;
    private int repository;
    private String operatorId;
    private String comment;
    private double total;
    private CommodityItem[] commodityList;

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
        this.comment = comment;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public CommodityItem[] getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(CommodityItem[] commodityList) {
        this.commodityList = commodityList;
    }

    public PurchaseBillPo(String id, Date date, BillState state, PurchaseBillType purchaseBillType, String supplier, int repository, String operatorId, String comment, double total, CommodityItem[] commodityList) {
        super(id, date, state, purchaseBillType);
        this.supplier = supplier;
        this.repository = repository;
        this.operatorId = operatorId;
        this.comment = comment;
        this.total = total;
        this.commodityList = commodityList;
    }
}
