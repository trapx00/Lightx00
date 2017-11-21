package trapx00.lightx00.shared.dataservicestub.approvaldataservice;

import trapx00.lightx00.shared.dataservice.approvaldataservice.AuditDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.CashBillPo;
import trapx00.lightx00.shared.queryvo.BillQueryVo;

import java.rmi.RemoteException;
import java.util.Date;

public class AuditDataServiceStub implements AuditDataService {
    /**
     * Filter some bills.
     * @param query the filter conditions
     * @return array of bills which match the conditions
     */
    @Override
    public BillPo[] query(BillQueryVo query) {
        return new BillPo[]{new CashBillPo("XJFYD-20171112-00001",new Date(), BillState.WaitingForApproval,"0001","0002",null)};
    }

    /**
     * Reject to approve the bill.
     * @param bill the bill to be approved
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage reject(BillPo bill) {
        return ResultMessage.Success;
    }

    /**
     * Approve the bill.
     * @param bill the bill to be approved
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage pass(BillPo bill) {
        return ResultMessage.Success;
    }

    /**
     * Save the submitted bill.
     * @param bill the bill has been submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage requestApproval(BillPo bill) {
        return ResultMessage.Success;
    }
}
