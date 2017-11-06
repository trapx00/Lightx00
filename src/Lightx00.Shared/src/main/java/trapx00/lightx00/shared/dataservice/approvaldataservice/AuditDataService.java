package trapx00.lightx00.shared.dataservice.approvaldataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.manager.BillQueryVo;

import java.util.Date;

public interface AuditDataService {
    /**
     * filter some bills
     * @param query the filter conditions
     * @return array of bills which match the conditions
     */
    BillVo[] query(BillQueryVo query);

    /**
     * reject to approve the bill
     * @param bill the bill to be approved
     * @return whether the operation is done successfully
     */
    ResultMessage reject(BillVo bill);

    /**
     * approve the bill
     * @param bill the bill to be approved
     * @return whether the operation is done successfully
     */
    ResultMessage pass(BillVo bill);

    /**
     * save the submitted bill
     * @param bill the bill has been submitted
     * @return whether the operation is done successfully
     */
    ResultMessage requestApproval(BillVo bill);
}
