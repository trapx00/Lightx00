package trapx00.lightx00.client.bl.inventorybl;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.blservice.inventoryblservice.PurchaseBillBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.queryvo.PurchaseBillQueryVo;
import trapx00.lightx00.client.vo.salestaff.PurchaseBillVo;

public class PurchaseBillBlController implements PurchaseBillBlService, NotificationActivateService, NotificationAbandonService, DraftDeleteService {
    /**
     * Deletes a draft.
     *
     * @param id id of the draft to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage deleteDraft(String id) {
        return null;
    }

    /**
     * Abandons a bill.
     *
     * @param id id for the bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage abandon(String id) {
        return null;
    }

    /**
     * Activates a bill that has been approved of.
     *
     * @param id id for the bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage activate(String id) {
        return null;
    }

    /**
     * submit a purchaseBill
     * @param purchaseBill to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(PurchaseBillVo purchaseBill) {
        return null;
    }

    /**
     * saves a half-completed purchaseBill as draft.
     *
     * @param purchaseBill PurchaseBillVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(PurchaseBillVo purchaseBill) {
        return null;
    }

    /**
     * Gets the id for the next purchaseBill
     *
     * @return id for the next purchaseBill
     */
    @Override
    public String getId() {
        return null;
    }

    /**
     * query for PurchaseBills
     *
     * @param query function
     * @return array of PurchaseBillVo
     */
    @Override
    public PurchaseBillVo[] queryPurchaseBillVo(PurchaseBillQueryVo query) {
        return new PurchaseBillVo[0];
    }
}


