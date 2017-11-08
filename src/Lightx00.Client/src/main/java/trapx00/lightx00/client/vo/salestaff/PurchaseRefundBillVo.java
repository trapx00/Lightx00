package trapx00.lightx00.client.vo.salestaff;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.presentation.helpui.ContinueWritable;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.salestaff.CommodityItem;
import trapx00.lightx00.shared.po.salestaff.PurchaseBillType;

import java.util.Date;
import java.util.HashMap;

public class PurchaseRefundBillVo extends PurchaseBillBaseVo {
    private String supplier;
    private int repository;
    private SaleStaffVo operator;
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

    public PurchaseRefundBillVo(String id, Date date, BillState state, String supplier, int repository, SaleStaffVo operator, String comment, double total, CommodityItem[] commodityList) {
        super(id, date, state, PurchaseBillType.PurchaseRefund);
        this.supplier = supplier;
        this.repository = repository;
        this.operator = operator;
        this.comment = comment;
        this.total = total;
        this.commodityList = commodityList;
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
