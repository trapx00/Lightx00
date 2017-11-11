package trapx00.lightx00.client.vo.inventorystaff;

import java.util.Date;
import java.util.HashMap;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.financebl.factory.PaymentBillFactory;
import trapx00.lightx00.client.bl.inventorybl.factory.InventoryGiftFactory;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.presentation.helpui.ContinueWritable;
import trapx00.lightx00.client.vo.BillVo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.po.inventorystaff.InventoryBillType;
import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;

public class InventoryGiftVo extends InventoryBillBaseVo{
    PromotionCommodity[] gifts;

    public InventoryGiftVo(String id, Date date, BillState state, PromotionCommodity[] gifts) {
        super(id, date, state, InventoryBillType.Gift);
        this.gifts = gifts;
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
        return InventoryGiftFactory.getNotificationActivateService();
    }

    /**
     * Gets the NotificationAbandonService corresponding to this type of bill. Overrides to meet the specific bill type.
     *
     * @return NotificationAbandonService
     */
    @Override
    public NotificationAbandonService notificationAbandonService() {
        return InventoryGiftFactory.getNotificationAbandonService();
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
        return InventoryGiftFactory.getDraftDeleteService();
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