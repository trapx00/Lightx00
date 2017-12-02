package trapx00.lightx00.client.vo.inventorystaff;

import java.util.Date;
import java.util.HashMap;

import trapx00.lightx00.client.bl.approvalbl.BillApprovalCompleteService;
import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.inventorybl.factory.InventoryWarningServiceFactory;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.presentation.helpui.DraftContinueWritableUiController;
import trapx00.lightx00.client.presentation.helpui.ReversibleUi;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.inventorystaff.InventoryBillType;

public  class InventoryDetailBillVo extends InventoryBillBaseVo {
    //报损报溢报警
    private String operatorId;
    private CommodityVo[] commodities;//商品
    private double[] amountList;//报损报警报溢数量
    private InventoryBillType type;

    public InventoryDetailBillVo(String id, Date date, BillState state, String operatorId, CommodityVo[] commodities, double[] amountList, InventoryBillType type) {
        super(id, date, state,type);
        this.operatorId = operatorId;
        this.commodities = commodities;
        this.amountList = amountList;
        this.type = type;
    }

    public  String getOperatorId() {
        return operatorId;
    }

    public CommodityVo[] getCommodities() {
        return commodities;
    }

    public void setCommodities(CommodityVo[] commodities) {
        this.commodities = commodities;
    }

    public double[] getAmountList() {
        return amountList;
    }

    public void setAmountList(double[] amountList) {
        this.amountList = amountList;
    }

    public InventoryBillType getType() {
        return type;
    }

    /**
     * Gets the BillApprovalCompleteService corresponding to this type of bill. Overrides to meet the specific bill type.
     *
     * @return BillApprovalCompleteService
     */
    @Override
    public BillApprovalCompleteService billApprovalCompleteService() {
        return InventoryWarningServiceFactory.getBillApprovalCompleteService();
    }

    /**
     * Gets the NotificationActivateService corresponding to this type of bill. Overrides to meet the specific bill type.
     *
     * @return NotificationActivateService
     */
    @Override
    public NotificationActivateService notificationActivateService() {
        return InventoryWarningServiceFactory.getNotificationActivateService();
    }

    /**
     * Gets the NotificationAbandonService corresponding to this type of bill. Overrides to meet the specific bill type.
     *
     * @return NotificationAbandonService
     */
    @Override
    public NotificationAbandonService notificationAbandonService() {
        return InventoryWarningServiceFactory.getNotificationAbandonService();
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
        return InventoryWarningServiceFactory.getDraftDeleteService();
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
