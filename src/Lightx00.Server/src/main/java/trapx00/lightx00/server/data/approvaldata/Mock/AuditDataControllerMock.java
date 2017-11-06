package trapx00.lightx00.server.data.approvaldata.Mock;

import trapx00.lightx00.server.data.approvaldata.AuditDataController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.manager.BillQueryVo;

public class AuditDataControllerMock extends AuditDataController{

    /**
     * filter some bills
     * @param query the filter conditions
     * @return array of bills which match the conditions
     */
    public BillVo[] query(BillQueryVo query) {
        return super.query(query);
    }

    /**
     * reject to approve the bill
     * @param bill the bill to be approved
     * @return whether the operation is done successfully
     */
    public ResultMessage reject(BillVo bill) {
        return super.reject(bill);
    }

    /**
     * approve the bill
     * @param bill the bill to be approved
     * @return whether the operation is done successfully
     */
    public ResultMessage pass(BillVo bill) {
        return super.pass(bill);
    }

    /**
     * save the submitted bill
     * @param bill the bill has been submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage requestApproval(BillVo bill) {
        return super.requestApproval(bill);
    }
}
