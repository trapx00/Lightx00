package trapx00.lightx00.server.data.approvaldata;

import trapx00.lightx00.shared.dataservice.approvaldataservice.AuditDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.queryvo.BillQueryVo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class AuditDataController extends UnicastRemoteObject implements AuditDataService {

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
    protected AuditDataController() throws RemoteException {
    }

    /**
     * Filter some bills.
     * @param query the filter conditions
     * @return array of bills which match the conditions
     */
    @Override
    public BillPo[] query(BillQueryVo query) {
        return new BillPo[0];
    }

    /**
     * Reject to approve the bill.
     * @param bill the bill to be approved
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage reject(BillPo bill) {
        return null;
    }

    /**
     * Approve the bill.
     * @param bill the bill to be approved
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage pass(BillPo bill) {
        return null;
    }

    /**
     * Save the submitted bill.
     * @param bill the bill has been submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage requestApproval(BillPo bill) {
        return null;
    }
}
