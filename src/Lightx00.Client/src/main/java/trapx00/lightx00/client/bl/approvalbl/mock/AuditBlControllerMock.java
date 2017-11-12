package trapx00.lightx00.client.bl.approvalbl.mock;

import trapx00.lightx00.client.bl.approvalbl.AuditBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.BillVo;
import trapx00.lightx00.shared.queryvo.BillQueryVo;

public class AuditBlControllerMock extends AuditBlController {

    /**
     * reject to approve the bill
     * @param bill bill to be audited
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage reject(BillVo bill) {
        return ResultMessage.Success;
    }

    /**
     * approve the bill
     * @param bill bill to be audited
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage pass(BillVo bill) {
        return ResultMessage.Success;
    }

    /**
     * submitted bills request approval
     * @param bill bill has been submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage requestMessage(BillVo bill) {
        return ResultMessage.Success;
    }
}
