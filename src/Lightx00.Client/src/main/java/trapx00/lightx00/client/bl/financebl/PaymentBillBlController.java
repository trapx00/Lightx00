package trapx00.lightx00.client.bl.financebl;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.blservice.financeblservice.PaymentBillBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.financestaff.PaymentBillQueryVo;
import trapx00.lightx00.shared.vo.financestaff.PaymentBillVo;

public class PaymentBillBlController implements PaymentBillBlService, NotificationActivateService, NotificationAbandonService, DraftDeleteService, PaymentBillInfo {


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
}