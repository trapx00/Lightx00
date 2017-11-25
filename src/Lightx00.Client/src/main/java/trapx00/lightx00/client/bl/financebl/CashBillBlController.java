package trapx00.lightx00.client.bl.financebl;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.blservice.financeblservice.CashBillBlService;
import trapx00.lightx00.client.vo.BillApprovalCompleteService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.queryvo.CashBillQueryVo;
import trapx00.lightx00.client.vo.financestaff.CashBillVo;

public class CashBillBlController implements CashBillBlService, NotificationActivateService, NotificationAbandonService, DraftDeleteService, CashBillInfo, BillApprovalCompleteService {



    /**
     * Submits a CashBill.
     *
     * @param bill CashBillVo to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(CashBillVo bill) {
        return null;
    }

    /**
     * Saves a half-completed CashBill as draft.
     *
     * @param bill CashBillVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(CashBillVo bill) {
        return null;
    }

    /**
     * Gets the id for the next bill
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
     * Queries CashBill.
     *
     * @param query query
     * @return CashBillVos that match the condition
     */
    @Override
    public CashBillVo[] query(CashBillQueryVo query) {
        return new CashBillVo[0];
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
