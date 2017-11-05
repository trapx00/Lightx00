package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.financestaff.PaymentBillVo;

public interface PaymentBillBlService {
    /**
     * Submits a PaymentBill.
     * @param bill PaymentBill to be submitted
     * @return whether the operation is done successfully
     */
    ResultMessage submit(PaymentBillVo bill);

    /**
     * Saves a half-completed PaymentBill as a draft.
     * @param bill PaymentBill to be saved as a draft
     * @return whether the operation is done successfully
     */

    ResultMessage saveAsDraft(PaymentBillVo bill);

    /**
     * Gets the id for the next bill.
     * @return id for the next bill
     */
    String getId();
}
