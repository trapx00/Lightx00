package trapx00.lightx00.server.data.financedata.mock;

import trapx00.lightx00.server.data.financedata.ReceivalBillDataController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.ReceivalBillPo;
import trapx00.lightx00.shared.vo.financestaff.ReceivalBillQueryVo;
import trapx00.lightx00.shared.vo.financestaff.ReceivalBillVo;

public class ReceivalDataControllerMock extends ReceivalBillDataController {
    /**
     * Submits a ReceivalBill or save it as a draft.
     *
     * @param bill ReceivalBill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(ReceivalBillPo bill) {
        return super.submit(bill);
    }

    /**
     * Activates a ReceivalBill.
     *
     * @param id id for the ReceivalBill that have been approved of
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage activate(String id) {
        return super.activate(id);
    }

    /**
     * Abandons a ReceivalBill.
     *
     * @param id id for the ReceivalBill to be abandoned
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage abandon(String id) {
        return super.abandon(id);
    }

    /**
     * Queries bills
     *
     * @param query query
     * @return ReceivalBillVos that match query condition
     */
    @Override
    public ReceivalBillVo[] query(ReceivalBillQueryVo query) {
        return super.query(query);
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
}
