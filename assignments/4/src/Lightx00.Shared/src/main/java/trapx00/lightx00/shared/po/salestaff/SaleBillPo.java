package trapx00.lightx00.shared.po.salestaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;

import java.util.Date;

public class SaleBillPo extends SaleBillBasePo {
    private String supplier;
    private String defaultOperatorId;
    private String operatorId;
    private int repository;
    private CommodityPo[] commodityList;
    private double originTotal;
    private double minusProfits;
    private double token;
    private double ultiTotal;
    private String comment;

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getDefaultOperatorId() {
        return defaultOperatorId;
    }

    public void setDefaultOperatorId(String defaultOperatorId) {
        this.defaultOperatorId = defaultOperatorId;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public int getRepository() {
        return repository;
    }

    public void setRepository(int repository) {
        this.repository = repository;
    }

    public CommodityPo[] getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(CommodityPo[] commodityList) {
        this.commodityList = commodityList;
    }

    public double getOriginTotal() {
        return originTotal;
    }

    public void setOriginTotal(double originTotal) {
        this.originTotal = originTotal;
    }

    public double getMinusProfits() {
        return minusProfits;
    }

    public void setMinusProfits(double minusProfits) {
        this.minusProfits = minusProfits;
    }

    public double getToken() {
        return token;
    }

    public void setToken(double token) {
        this.token = token;
    }

    public double getUltiTotal() {
        return ultiTotal;
    }

    public void setUltiTotal(double ultiTotal) {
        this.ultiTotal = ultiTotal;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public SaleBillPo(String id, Date date, BillState state, String supplier, String defaultOperatorId, String operatorId, int repository, CommodityPo[] commodityList, double originTotal, double minusProfits, double token, double ultiTotal, String comment) {
        super(id, date, state, SaleBillType.Sale);
        this.supplier = supplier;
        this.defaultOperatorId = defaultOperatorId;
        this.operatorId = operatorId;
        this.repository = repository;
        this.commodityList = commodityList;
        this.originTotal = originTotal;
        this.minusProfits = minusProfits;
        this.token = token;
        this.ultiTotal = ultiTotal;
        this.comment = comment;
    }
}
