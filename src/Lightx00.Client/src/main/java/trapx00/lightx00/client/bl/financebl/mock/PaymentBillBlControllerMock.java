package trapx00.lightx00.client.bl.financebl.mock;

import trapx00.lightx00.client.bl.financebl.PaymentBillBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.financestaff.PaymentBillQueryVo;
import trapx00.lightx00.shared.vo.financestaff.PaymentBillVo;

public class PaymentBillBlControllerMock extends PaymentBillBlController {
    /**
     * Deletes a draft.
     *
     * @param id id of the draft to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage deleteDraft(String id) {
        return super.deleteDraft(id);
    }

    /**
     * Abandons a bill.
     *
     * @param id id for the bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage abandon(String id) {
        return super.abandon(id);
    }

    /**
     * Activates a bill that has been approved of.
     *
     * @param id id for the bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage activate(String id) {
        return super.activate(id);
    }

    /**
     * Submits a PaymentBill.
     *
     * @param bill PaymentBill to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(PaymentBillVo bill) {
        return super.submit(bill);
    }

    /**
     * Saves a half-completed PaymentBill as a draft.
     *
     * @param bill PaymentBill to be saved as a draft
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(PaymentBillVo bill) {
        return super.saveAsDraft(bill);
    }

    /**
     * Gets the id for the next bill.
     *
     * @return id for the next bill
     */
    @Override
    public String getId() {
        return super.getId();
    }

    /**
     * Queries PaymentBill.
     *
     * @param query query
     * @return PaymentBillVos that match the condition
     */
    @Override
    public PaymentBillVo[] query(PaymentBillQueryVo query) {
        return super.query(query);
    }
}
