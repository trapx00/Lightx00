package trapx00.lightx00.client.bl.approvalbl.mock;

import trapx00.lightx00.client.bl.approvalbl.AuditBlController;
import trapx00.lightx00.client.vo.financestaff.CashBillVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.BillVo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.queryvo.BillQueryVo;

import java.util.Date;

public class AuditBlControllerMock extends AuditBlController {
    /**
     * Reject to approve the bill.
     * @param bill bill to be audited
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage reject(BillVo bill) {
        return ResultMessage.Success;
    }

    /**
     * Approve the bill.
     * @param bill bill to be audited
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage pass(BillVo bill) {
        return ResultMessage.Success;
    }

    /**
     * Filter bills.
     * @param query the filter conditions
     * @return array of bills which match the conditions
     */
    @Override
    public BillVo[] query(BillQueryVo query) {
        return new BillVo[] { new CashBillVo("XJFYD-20171112-00001",new Date(), BillState.WaitingForApproval,"0001","0002",null)
        };
    }

    /**
     * Submitted bills request approval.
     * @param bill bill has been submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage requestApproval(BillVo bill) {
        return ResultMessage.Success;
    }
}
