package trapx00.lightx00.server.data.financedata;

import trapx00.lightx00.shared.dataservice.financedataservice.ReceivalBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.ReceivalBillPo;
import trapx00.lightx00.shared.queryvo.ReceivalBillQueryVo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class ReceivalBillDataController extends UnicastRemoteObject implements ReceivalBillDataService {
    /**
     * Creates and exports a new UnicastRemoteObject object using an
     * anonymous port.
     * <p>
     * <p>The object is exported with a server socket
     * created using the {@link RMISocketFactory} class.
     *
     * @throws RemoteException if failed to export object
     * @since JDK1.1
     */
    protected ReceivalBillDataController() throws RemoteException {
    }

    /**
     * Submits a ReceivalBill or save it as a draft.
     *
     * @param bill ReceivalBill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(ReceivalBillPo bill) {
        return null;
    }

    /**
     * Activates a ReceivalBill.
     *
     * @param id id for the ReceivalBill that have been approved of
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage activate(String id) {
        return null;
    }

    /**
     * Abandons a ReceivalBill.
     *
     * @param id id for the ReceivalBill to be abandoned
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage abandon(String id) {
        return null;
    }

    /**
     * Queries bills
     *
     * @param query query
     * @return ReceivalBillVos that match query condition
     */
    @Override
    public ReceivalBillPo[] query(ReceivalBillQueryVo query) {
        return new ReceivalBillPo[0];
    }

    /**
     * Gets the id for the next bill.
     *
     * @return id for the next bill
     */
    @Override
    public String getId() {
        return null;
    }
}
