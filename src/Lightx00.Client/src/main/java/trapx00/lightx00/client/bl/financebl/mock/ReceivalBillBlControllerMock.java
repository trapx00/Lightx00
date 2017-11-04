package trapx00.lightx00.client.bl.financebl.mock;

import trapx00.lightx00.client.bl.financebl.ReceivalBillBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.financestaff.ReceivalBillVo;

public class ReceivalBillBlControllerMock extends ReceivalBillBlController {
    /**
     * Abandons a bill.
     *
     * @param bill bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage abandon(BillVo bill) {
        return super.abandon(bill);
    }

    /**
     * Activates a bill that has been approved of.
     *
     * @param bill bill that has been approved of
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage activate(BillVo bill) {
        return super.activate(bill);
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
}
