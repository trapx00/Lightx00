package trapx00.lightx00.server.data.approvaldata;

import trapx00.lightx00.shared.dataservice.approvaldataservice.AuditDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.manager.BillQueryVo;

public class AuditDataController implements AuditDataService {

    /**
     * filter some bills
     * @param query the filter conditions
     * @return array of bills which match the conditions
     */
    @Override
    public BillVo[] query(BillQueryVo query) {
        return new BillVo[0];
    }

    /**
     * reject to approve the bill
     * @param bill the bill to be approved
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage reject(BillVo bill) {
        return null;
    }

    /**
     * approve the bill
     * @param bill the bill to be approved
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage pass(BillVo bill) {
        return null;
    }

    /**
     * save the submitted bill
     * @param bill the bill has been submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage requestApproval(BillVo bill) {
        return null;
    }
}
