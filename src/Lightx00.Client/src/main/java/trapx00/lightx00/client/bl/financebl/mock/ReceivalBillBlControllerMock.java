package trapx00.lightx00.client.bl.financebl.mock;

import trapx00.lightx00.client.bl.financebl.ReceivalBillBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.queryvo.ReceivalBillQueryVo;
import trapx00.lightx00.client.vo.financestaff.ReceivalBillVo;

public class ReceivalBillBlControllerMock extends ReceivalBillBlController {
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
     * Submits a ReceivalBill.
     *
     * @param bill ReceivalBill to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(ReceivalBillVo bill) {
        return super.submit(bill);
    }

    /**
     * Saves a half-completed ReceivalBill as a draft.
     *
     * @param bill ReceivalBill to be saved as a draft
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(ReceivalBillVo bill) {
        return super.saveAsDraft(bill);
    }

    /**
     * Gets the id for the next bill
     *
     * @return id for the next bill
     */
    @Override
    public String getId() {
        return super.getId();
    }

    /**
     * Queries ReceivalBillVo.
     *
     * @param query query
     * @return ReceivalBills that match the condition
     */
    @Override
    public ReceivalBillVo[] query(ReceivalBillQueryVo query) {
        return super.query(query);
    }
}
