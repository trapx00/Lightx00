package trapx00.lightx00.client.bl.approvalbl;

import trapx00.lightx00.client.blservice.approvalblservice.AuditBlService;
import trapx00.lightx00.client.vo.BillVo;
import trapx00.lightx00.client.vo.manager.BillInfoVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.queryvo.BillInfoQueryVo;

public class AuditBlController implements AuditBlService,ApprovalRequest {
    /**
     * Reject to approve the bill.
     * @param bill bill to be audited
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage reject(BillInfoVo bill) {
        return null;
    }

    /**
     * Approve the bill.
     * @param bill bill to be audited
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage pass(BillInfoVo bill) {
        return null;
    }

    /**
     * Filter bills.
     * @param query the filter conditions
     * @return array of bills which match the conditions
     */
    @Override
    public BillInfoVo[] query(BillInfoQueryVo query) {
        return new BillInfoVo[0];
    }

    /**
     * Submitted bills request approval.
     * @param bill bill has been submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage requestApproval(BillVo  bill) {
        return null;
    }
}
