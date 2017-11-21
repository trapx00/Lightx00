package trapx00.lightx00.shared.dataservice.approvaldataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.queryvo.BillQueryVo;

import java.rmi.Remote;

public interface AuditDataService extends Remote {
    /**
     * Filter some bills.
     * @param query the filter conditions
     * @return array of bills which match the conditions
     */
    BillPo[] query(BillQueryVo query);

    /**
     * Reject to approve the bill.
     * @param bill the bill to be approved
     * @return whether the operation is done successfully
     */
    ResultMessage reject(BillPo bill);

    /**
     * Approve the bill.
     * @param bill the bill to be approved
     * @return whether the operation is done successfully
     */
    ResultMessage pass(BillPo bill);

    /**
     * Save the submitted bill.
     * @param bill the bill has been submitted
     * @return whether the operation is done successfully
     */
    ResultMessage requestApproval(BillPo bill);
}
