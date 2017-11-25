package trapx00.lightx00.client.bl.financebl;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.blservice.financeblservice.PaymentBillBlService;
import trapx00.lightx00.client.vo.BillApprovalCompleteService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.queryvo.PaymentBillQueryVo;
import trapx00.lightx00.client.vo.financestaff.PaymentBillVo;

public class PaymentBillBlController implements PaymentBillBlService, NotificationActivateService, NotificationAbandonService, DraftDeleteService, PaymentBillInfo, BillApprovalCompleteService {


    /**
     * Submits a PaymentBill.
     *
     * @param bill PaymentBill to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(PaymentBillVo bill) {
        return null;
    }

    /**
     * Saves a half-completed PaymentBill as a draft.
     *
     * @param bill PaymentBill to be saved a a draft
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(PaymentBillVo bill) {
        return null;
    }

    /**
     * Gets the id for the next bill.
     *
     * @return id for the next bill
     */
    @Override
    public String getId() {
        return null;
    }

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
     * Queries PaymentBill.
     *
     * @param query query
     * @return PaymentBillVos that match the condition
     */
    @Override
    public PaymentBillVo[] query(PaymentBillQueryVo query) {
        return new PaymentBillVo[0];
    }

    /**
     * When bill is approved, this method is called to modify the state of the bill.
     *
     * @param billId id for the bill
     * @param state  newState. Only BillState.Approved and BillState
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage approvalComplete(String billId, BillState state) {
        return null;
    }
}
