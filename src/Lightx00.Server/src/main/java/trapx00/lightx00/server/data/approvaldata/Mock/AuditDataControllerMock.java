package trapx00.lightx00.server.data.approvaldata.Mock;

import trapx00.lightx00.server.data.approvaldata.AuditDataController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.queryvo.BillQueryVo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;

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
    protected AuditDataControllerMock() throws RemoteException {
    }

    /**
     * filter some bills
     * @param query the filter conditions
     * @return array of bills which match the conditions
     */
    public BillPo[] query(BillQueryVo query) {
        return super.query(query);
    }

    /**
     * reject to approve the bill
     * @param bill the bill to be approved
     * @return whether the operation is done successfully
     */
    public ResultMessage reject(BillPo bill) {
        return super.reject(bill);
    }

    /**
     * approve the bill
     * @param bill the bill to be approved
     * @return whether the operation is done successfully
     */
    public ResultMessage pass(BillPo bill) {
        return super.pass(bill);
    }

    /**
     * save the submitted bill
     * @param bill the bill has been submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage requestApproval(BillPo bill) {
        return super.requestApproval(bill);
    }
}
