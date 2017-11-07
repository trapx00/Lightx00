package trapx00.lightx00.client.vo.salestaff;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.presentation.helpui.ContinueWritable;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.salestaff.CommodityItem;
import trapx00.lightx00.client.vo.EmployeeVo;

import java.util.Date;
import java.util.HashMap;

public class SaleRefundBillVo extends SaleBillBaseVo {
    String supplier;
    EmployeeVo defaultOperator;
    SaleStaffVo operator;
    int repository;
    CommodityItem[] commodityList;
    double originTotal;
    double minusProfits;
    double token;
    double ultiTotal;
    String comment;

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

    public SaleRefundBillVo(String id, Date date, BillState state, SaleBillType saleBillType, String supplier, EmployeeVo defaultOperator, SaleStaffVo operator, int repository, CommodityItem[] commodityList, double originTotal, double minusProfits, double token, double ultiTotal, String comment) {
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

    /**
     * Gets the NotificationActivateService corresponding to this type of bill. Overrides to meet the specific bill type.
     *
     * @return NotificationActivateService
     */
    @Override
    public NotificationActivateService notificationActivateService() {
        return null;
    }

    /**
     * Gets the NotificationAbandonService corresponding to this type of bill. Overrides to meet the specific bill type.
     *
     * @return NotificationAbandonService
     */
    @Override
    public NotificationAbandonService notificationAbandonService() {
        return null;
    }

    /**
     * Gets the key-value maps to display the properties. Overrides to meet the specific bill type.
     *
     * @return key-value maps for the properties
     */
    @Override
    public HashMap<String, String> properties() {
        return null;
    }

    /**
     * Gets DeleteService corresponding to this type of draft. Overrides to meet the specific bill type.
     *
     * @return DeleteService
     */
    @Override
    public DraftDeleteService deleteService() {
        return null;
    }

    /**
     * Gets the ContinueWritable service corresponding to this type of draft. Overrides to meet the specific bill type.
     *
     * @return ContinueWritable
     */
    @Override
    public ContinueWritable continueWriteService() {
        return null;
    }
}
