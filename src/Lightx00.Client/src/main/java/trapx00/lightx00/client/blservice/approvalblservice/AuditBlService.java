package trapx00.lightx00.client.blservice.approvalblservice;

import trapx00.lightx00.client.vo.manager.BillInfoVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.queryvo.BillInfoQueryVo;


public interface AuditBlService {
    /**
     * Reject to approve the bill.
     * @param bill bill to be audited
     * @return whether the operation is done successfully
     */
    ResultMessage reject(BillInfoVo bill);

    /**
     * Approve the bill.
     * @param bill bill to be audited
     * @return whether the operation is done successfully
     */
    ResultMessage pass(BillInfoVo bill);

    /**
     * Filter bills.
     * @param query the filter conditions
     * @return array of bills which match the conditions
     */
    BillInfoVo[] query(BillInfoQueryVo query);
}
