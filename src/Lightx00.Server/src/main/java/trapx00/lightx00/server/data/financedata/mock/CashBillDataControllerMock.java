package trapx00.lightx00.server.data.financedata.mock;

import trapx00.lightx00.server.data.financedata.CashBillDataController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.CashBillPo;
import trapx00.lightx00.shared.vo.financestaff.CashBillQueryVo;
import trapx00.lightx00.shared.vo.financestaff.CashBillVo;

public class CashBillDataControllerMock extends CashBillDataController {
    /**
     * Submits a CashBill or save it as a draft.
     *
     * @param bill CashBill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(CashBillPo bill) {
        return super.submit(bill);
    }

    /**
     * Activates a CashBill.
     *
     * @param id id for the CashBill that have been approved of
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage activate(String id) {
        return super.activate(id);
    }

    /**
     * Abandons a CashBill.
     *
     * @param id id for the CashBill to be abandoned
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage abandon(String id) {
        return super.abandon(id);
    }

    /**
     * Queries CashBill.
     *
     * @param query query condition
     * @return CashBillVos that match the query condition
     */
    @Override
    public CashBillVo[] query(CashBillQueryVo query) {
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
