package trapx00.lightx00.server.data.approvaldata;

import trapx00.lightx00.shared.dataservice.approvaldataservice.AuditDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.queryvo.BillQueryVo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;

public class AuditDataController implements AuditDataService {

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
     * filter some bills
     * @param query the filter conditions
     * @return array of bills which match the conditions
     */
    @Override
    public BillPo[] query(BillQueryVo query) {
        return new BillPo[0];
    }

    /**
     * reject to approve the bill
     * @param bill the bill to be approved
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage reject(BillPo bill) {
        return null;
    }

    /**
     * approve the bill
     * @param bill the bill to be approved
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage pass(BillPo bill) {
        return null;
    }

    /**
     * save the submitted bill
     * @param bill the bill has been submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage requestApproval(BillPo bill) {
        return null;
    }
}
