package trapx00.lightx00.client.vo.salestaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.salestaff.CommodityItem;
import trapx00.lightx00.client.vo.EmployeeVo;

import java.util.Date;

public class SaleBillVo extends SaleBillBaseVo {
    private String supplier;
    private EmployeeVo defaultOperator;
    private SaleStaffVo operator;
    private int repository;
    private CommodityItem[] commodityList;
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

    public EmployeeVo getDefaultOperator() {
        return defaultOperator;
    }

    public void setDefaultOperator(EmployeeVo defaultOperator) {
        this.defaultOperator = defaultOperator;
    }

    public SaleStaffVo getOperator() {
        return operator;
    }

    public void setOperator(SaleStaffVo operator) {
        this.operator = operator;
    }

    public int getRepository() {
        return repository;
    }

    public void setRepository(int repository) {
        this.repository = repository;
    }

    public CommodityItem[] getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(CommodityItem[] commodityList) {
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

    public SaleBillVo(String id, Date date, BillState state, SaleBillType saleBillType, String supplier, EmployeeVo defaultOperator, SaleStaffVo operator, int repository, CommodityItem[] commodityList, double originTotal, double minusProfits, double token, double ultiTotal, String comment) {
        super(id, date, state, saleBillType);
        this.supplier = supplier;
        this.defaultOperator = defaultOperator;
        this.operator = operator;
        this.repository = repository;
        this.commodityList = commodityList;
        this.originTotal = originTotal;
        this.minusProfits = minusProfits;
        this.token = token;
        this.ultiTotal = ultiTotal;
        this.comment = comment;
    }
}
