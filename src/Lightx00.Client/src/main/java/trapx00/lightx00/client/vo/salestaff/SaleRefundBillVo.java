package trapx00.lightx00.client.vo.salestaff;

import trapx00.lightx00.client.bl.approvalbl.BillApprovalCompleteService;
import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.presentation.helpui.BillDetailUi;
import trapx00.lightx00.client.presentation.helpui.DraftContinueWritableUiController;
import trapx00.lightx00.client.presentation.helpui.ReversibleUi;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.salestaff.CommodityItem;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.shared.po.salestaff.SaleBillType;

import java.util.Date;

public class SaleRefundBillVo extends SaleBillBaseVo {
    private String clientId;
    private EmployeeVo defaultOperator;
    private int repository;
    private CommodityItem[] commodityList;
    private double originTotal;
    private double minusProfits;
    private double token;
    private double ultiTotal;
    private String comment;

    public SaleRefundBillVo(String id, Date date, BillState state, SaleBillType saleBillType, String clientId, EmployeeVo defaultOperator, String operatorId, int repository, CommodityItem[] commodityList, double originTotal, double minusProfits, double token, double ultiTotal, String comment) {
        super(id, date, state, saleBillType, operatorId);
        this.clientId = clientId;
        this.defaultOperator = defaultOperator;
        this.repository = repository;
        this.commodityList = commodityList;
        this.originTotal = originTotal;
        this.minusProfits = minusProfits;
        this.token = token;
        this.ultiTotal = ultiTotal;
        this.comment = comment;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public EmployeeVo getDefaultOperator() {
        return defaultOperator;
    }

    public void setDefaultOperator(EmployeeVo defaultOperator) {
        this.defaultOperator = defaultOperator;
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

    /**
     * Gets the NotificationActivateService corresponding to this type of bill. Overrides to meet the specific bill type.
     *
     * @return NotificationActivateService
     */
    @Override
    public NotificationActivateService notificationActivateService() {
        return SaleRefundBillBlFactory.getNotificationActivateService();
    }

    /**
     * Gets the NotificationAbandonService corresponding to this type of bill. Overrides to meet the specific bill type.
     *
     * @return NotificationAbandonService
     */
    @Override
    public NotificationAbandonService notificationAbandonService() {
        return SaleRefundBillBlFactory.getNotificationAbandonService();
    }

    /**
     * Gets the BillApprovalCompleteService corresponding to this type of bill. Overrides to meet the specific bill type.
     *
     * @return BillApprovalCompleteService
     */
    @Override
    public BillApprovalCompleteService billApprovalCompleteService() {
        return SaleRefundBillBlFactory.getBillApprovalCompleteService();
    }

    /**
     * Gets DeleteService corresponding to this type of draft. Overrides to meet the specific bill type.
     *
     * @return DeleteService
     */
    @Override
    public DraftDeleteService deleteService() {
        return SaleRefundBillBlFactory.getDraftDeleteService();
    }

    /**
     * Gets the DraftContinueWritableUiController service corresponding to this type of draft. Overrides to meet the specific bill type.
     *
     * @return DraftContinueWritableUiController
     */
    @Override
    public DraftContinueWritableUiController continueWritableUi() {
        return null;
    }

    @Override
    public BillDetailUi billDetailUi() {
        return null;
    }

    /**
     * When it is called, it returns a ReversibleUi which can be used to acquire the ui component and controller.
     *
     * @return reversible ui service.
     */
    @Override
    public ReversibleUi reversibleUi() {
        return null;
    }
}
