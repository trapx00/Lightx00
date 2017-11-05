package trapx00.lightx00.shared.dataservice.financedataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.PaymentBillPo;
import trapx00.lightx00.shared.vo.financestaff.PaymentBillQueryVo;
import trapx00.lightx00.shared.vo.financestaff.PaymentBillVo;

public interface PaymentBillDataService {
    /**
     * Submits a bill or saves a bill as a draft
     * @param bill PaymentBill
     * @return whether the operation is done successfully
     */
    ResultMessage submit(PaymentBillPo bill);

    /**
     * Activates a bill.
     * @param id id for the PaymentBill that have been approved of
     * @return whether the operation is done successfully
     */

    ResultMessage activate(String id);

    /**
     * Abandons a bill.
     * @param id id for the PaymentBill to be abandoned
     * @return whether the operation is done successfully
     */

    ResultMessage abandon(String id);

    /**
     * Queries bills
     * @param query query
     * @return PaymentBillVos that match query condition
     */

    PaymentBillVo[] query(PaymentBillQueryVo query);

    /**
     * Gets the id for the next bill.
     * @return id for the next bill
     */
    String getId();
}
