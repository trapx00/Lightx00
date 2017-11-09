package trapx00.lightx00.client.bl.approvalbl.mock;

import trapx00.lightx00.client.bl.approvalbl.AuditBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.BillVo;
import trapx00.lightx00.client.vo.manager.BillQueryVo;

public class AuditBlControllerMock extends AuditBlController {
    /**
     * filter some bills to audit
     * @param query the filter conditions
     * @return array of bills which match the conditions
     */
    @Override
    public BillVo[] query(BillQueryVo query) {
        return super.query(query);
    }

    /**
     * reject to approve the bill
     * @param bill bill to be audited
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage reject(BillVo bill) {
        return super.reject(bill);
    }

    /**
     * approve the bill
     * @param bill bill to be audited
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage pass(BillVo bill) {
        return super.pass(bill);
    }

    /**
     * submitted bills request approval
     * @param bill bill has been submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage requestMessage(BillVo bill) {
        return super.requestMessage(bill);
    }
}
