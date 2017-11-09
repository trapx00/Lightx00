package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.financestaff.ReceivalBillVo;

public interface ReceivalBillBlService {

    /**
     * Submits a ReceivalBill.
     * @param bill ReceivalBill to be submitted
     * @return whether the operation is done successfully
     */
    ResultMessage submit(ReceivalBillVo bill);

    /**
     * Saves a half-completed ReceivalBill as a draft.
     * @param bill ReceivalBill to be saved as a draft
     * @return whether the operation is done successfully
     */

    ResultMessage saveAsDraft(ReceivalBillVo bill);

    /**
     * Gets the id for the next bill
     * @return id for the next bill
     */
    String getId();
}
