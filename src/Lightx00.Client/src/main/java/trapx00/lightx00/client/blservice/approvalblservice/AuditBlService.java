package trapx00.lightx00.client.blservice.approvalblservice;

import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.BillVo;
import trapx00.lightx00.shared.queryvo.BillQueryVo;

public interface AuditBlService {

    /**
     * reject to approve the bill
     * @param bill bill to be audited
     * @return whether the operation is done successfully
     */
    ResultMessage reject(BillVo bill);

    /**
     * approve the bill
     * @param bill bill to be audited
     * @return whether the operation is done successfully
     */
    ResultMessage pass(BillVo bill);

    /**
     * filter bills
     * @param query the filter conditions
     * @return array of bills which match the conditions
     */
    BillVo[] query(BillQueryVo query);

}
