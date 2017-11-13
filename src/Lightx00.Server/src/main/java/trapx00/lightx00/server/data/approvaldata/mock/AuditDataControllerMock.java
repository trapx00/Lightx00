package trapx00.lightx00.server.data.approvaldata.mock;

import trapx00.lightx00.server.data.approvaldata.AuditDataController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.CashBillPo;
import trapx00.lightx00.shared.queryvo.BillQueryVo;

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
     * filter some bills
     * @param query the filter conditions
     * @return array of bills which match the conditions
     */
    public BillPo[] query(BillQueryVo query) {
        return new BillPo[]{
                new CashBillPo("0001",new Date(), BillState.Draft, "123","123",null)
        };
    }

    /**
     * reject to approve the bill
     * @param bill the bill to be approved
     * @return whether the operation is done successfully
     */
    public ResultMessage reject(BillPo bill) {
        return ResultMessage.Success;
    }

    /**
     * approve the bill
     * @param bill the bill to be approved
     * @return whether the operation is done successfully
     */
    public ResultMessage pass(BillPo bill) {
        return ResultMessage.Success;
    }

    /**
     * save the submitted bill
     * @param bill the bill has been submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage requestApproval(BillPo bill) {
        return ResultMessage.Success;
    }
}
