package trapx00.lightx00.client.bl.inventorybl;

import trapx00.lightx00.client.bl.approvalbl.BillApprovalCompleteService;
import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.blservice.inventoryblservice.PurchaseRefundBillBlService;
import trapx00.lightx00.client.vo.salestaff.PurchaseRefundBillVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;

public class PurchaseRefundBillBlController implements PurchaseRefundBillBlService, NotificationActivateService, NotificationAbandonService, DraftDeleteService, BillApprovalCompleteService {

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
     * submit a purchaseRefundBill
     *
     * @param purchaseRefundBill to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(PurchaseRefundBillVo purchaseRefundBill) {
        return null;
    }

    /**
     * saves a half-completed purchaseRefundBill as draft.
     *
     * @param purchaseRefundBill PurchaseRefundBillVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(PurchaseRefundBillVo purchaseRefundBill) {
        return null;
    }

    /**
     * Gets the id for the next purchaseRefundBill
     *
     * @return id for the next purchaseRefundBill
     */
    @Override
    public String getId() {
        return null;
    }

    /**
     * query for PurchaseRefundBills
     *
     * @param query function
     * @return array of PurchaseRefundBillVo
     */
    @Override
    public PurchaseRefundBillVo[] queryPurchaseRefundBillVo(PurchaseRefundBillVo query) {
        return new PurchaseRefundBillVo[0];
    }

    /**
     * When bill is approved, this method is called to modify the state of the bill.
     *
     * @param billId id for the bill
     * @param state  newState. Only BillState.Approved and BillState.Rejected are allowed.
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage approvalComplete(String billId, BillState state) {
        return null;
    }
}
