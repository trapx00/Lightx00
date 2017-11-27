package trapx00.lightx00.server.data.approvaldata.mock;

import trapx00.lightx00.server.data.approvaldata.AuditDataController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.BillInfoPo;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.queryvo.BillInfoQueryVo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.util.Date;

public class AuditDataControllerMock extends AuditDataController {
    /**
     * Creates and exports a new UnicastRemoteObject object using an
     * anonymous port.
     *
     * <p>The object is exported with a server socket
     * created using the {@link RMISocketFactory} class.
     *
     * @throws RemoteException if failed to export object
     * @since JDK1.1
     */
    public AuditDataControllerMock() throws RemoteException {
    }

    /**
     * Filter some BillInfoPo.
     * @param query the filter conditions
     * @return array of BillInfoPo which match the conditions
     */
    public BillInfoPo[] query(BillInfoQueryVo query) {
        return new BillInfoPo[]{new BillInfoPo("XJFYD-20171112-00001", BillType.FinanceBill,new Date(), BillState.WaitingForApproval)};
    }

    /**
     * Delete BillInfoPo after rejecting the approval.
     * @param billInfo the corresponding BillInfoPo to the BillPo
     * @return whether the operation is done successfully
     */
    public ResultMessage reject(BillInfoPo billInfo) {
        return ResultMessage.Success;
    }

    /**
     * Delete BillInfoPo after approving the bill.
     * @param billInfo the corresponding BillInfoPo to the BillPo
     * @return whether the operation is done successfully
     */
    public ResultMessage pass(BillInfoPo billInfo) {
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
