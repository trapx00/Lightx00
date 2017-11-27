package trapx00.lightx00.shared.po.salestaff;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import trapx00.lightx00.shared.po.bill.BillState;

import java.util.Date;

@DatabaseTable(tableName = "SaleRefundBill")
public class SaleRefundBillPo extends SaleBillBasePo {
    @DatabaseField
    private String supplier;
    @DatabaseField
    private String defaultOperatorId;
    @DatabaseField
    private String operatorId;
    @DatabaseField
    private int repository;
    @DatabaseField(dataType = DataType.SERIALIZABLE)
    private CommodityItem[] commodityList;
    @DatabaseField
    private double originTotal;
    @DatabaseField
    private double minusProfits;
    @DatabaseField
    private double token;
    @DatabaseField
    private double ultiTotal;
    @DatabaseField
    private String comment;

    public SaleRefundBillPo(String id, Date date, BillState state, String supplier, String defaultOperatorId, String operatorId, int repository, CommodityItem[] commodityList, double originTotal, double minusProfits, double token, double ultiTotal, String comment) {
        super(id, date, state, SaleBillType.SaleRefund);
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

    public SaleRefundBillPo() {
    }

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
}
