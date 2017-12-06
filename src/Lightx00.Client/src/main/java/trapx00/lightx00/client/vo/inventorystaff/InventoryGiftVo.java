package trapx00.lightx00.client.vo.inventorystaff;

import java.util.Date;
import java.util.HashMap;

import trapx00.lightx00.client.bl.approvalbl.BillApprovalCompleteService;
import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.inventorybl.factory.InventoryGiftServiceFactory;
import trapx00.lightx00.client.bl.inventorybl.factory.InventoryWarningServiceFactory;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.presentation.helpui.BillDetailUi;
import trapx00.lightx00.client.presentation.helpui.DraftContinueWritableUiController;
import trapx00.lightx00.client.presentation.helpui.ReversibleUi;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.inventorystaff.InventoryBillType;
import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;

public class InventoryGiftVo extends InventoryBillBaseVo {



    private String operatorId;
    private PromotionCommodity[] gifts;

    public InventoryGiftVo(String id, Date date, BillState state, PromotionCommodity[] gifts) {
        super(id, date, state, InventoryBillType.Gift);
        this.gifts = gifts;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public PromotionCommodity[] getGifts() {
        return gifts;
    }

    public void setGifts(PromotionCommodity[] gifts) {
        this.gifts = gifts;
    }

    /**
     * Gets the NotificationActivateService corresponding to this type of bill. Overrides to meet the specific bill type.
     *
     * @return NotificationActivateService
     */
    @Override
    public NotificationActivateService notificationActivateService() {
        return InventoryGiftServiceFactory.getNotificationActivateService();
    }

    /**
     * Gets the NotificationAbandonService corresponding to this type of bill. Overrides to meet the specific bill type.
     *
     * @return NotificationAbandonService
     */
    @Override
    public NotificationAbandonService notificationAbandonService() {
        return InventoryGiftServiceFactory.getNotificationAbandonService();
    }


    /**
     * Gets DeleteService corresponding to this type of draft. Overrides to meet the specific bill type.
     *
     * @return DeleteService
     */
    @Override
    public DraftDeleteService deleteService() {
        return InventoryGiftServiceFactory.getDraftDeleteService();
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
     * Gets the BillApprovalCompleteService corresponding to this type of bill. Overrides to meet the specific bill type.
     *
     * @return BillApprovalCompleteService
     */
    @Override
    public BillApprovalCompleteService billApprovalCompleteService() {
        return InventoryWarningServiceFactory.getBillApprovalCompleteService();
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