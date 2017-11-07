package trapx00.lightx00.shared.dataservicestub.financedataservice;

import trapx00.lightx00.shared.dataservice.financedataservice.ReceivalBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.ReceivalBillPo;
import trapx00.lightx00.client.vo.financestaff.ReceivalBillQueryVo;
import trapx00.lightx00.client.vo.financestaff.ReceivalBillVo;

public class ReceivalDataServiceStub implements ReceivalBillDataService {
    /**
     * Submits a ReceivalBill or save it as a draft.
     *
     * @param bill ReceivalBill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(ReceivalBillPo bill) {
        return null;
    }

    /**
     * Activates a ReceivalBill.
     *
     * @param id id for the ReceivalBill that have been approved of
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage activate(String id) {
        return null;
    }

    /**
     * Abandons a ReceivalBill.
     *
     * @param id id for the ReceivalBill to be abandoned
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage abandon(String id) {
        return null;
    }

    /**
     * Queries bills
     *
     * @param query query
     * @return ReceivalBillVos that match query condition
     */
    @Override
    public ReceivalBillVo[] query(ReceivalBillQueryVo query) {
        return new ReceivalBillVo[0];
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
}
