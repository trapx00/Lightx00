package trapx00.lightx00.shared.dataservicestub.financedataservice;

import trapx00.lightx00.shared.dataservice.financedataservice.CashBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.CashBillPo;
import trapx00.lightx00.shared.queryvo.CashBillQueryVo;

public class CashBillDataServiceStub implements CashBillDataService {

    /**
     * Submits a CashBill or save it as a draft.
     *
     * @param bill CashBill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(CashBillPo bill) {
        return null;
    }

    /**
     * Activates a CashBill.
     *
     * @param id id for the CashBill that have been approved of
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage activate(String id) {
        return null;
    }

    /**
     * Abandons a CashBill.
     *
     * @param id id for the CashBill to be abandoned
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage abandon(String id) {
        return null;
    }


    /**
     * Queries CashBill.
     *
     * @param query query condition
     * @return CashBillVos that match the query condition
     */
    @Override
    public CashBillPo[] query(CashBillQueryVo query) {
        return new CashBillPo[0];
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
