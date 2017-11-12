package trapx00.lightx00.server.data.financedata;

import trapx00.lightx00.shared.dataservice.financedataservice.PaymentBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.PaymentBillPo;
import trapx00.lightx00.shared.queryvo.PaymentBillQueryVo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class PaymentBillDataController extends UnicastRemoteObject implements PaymentBillDataService {
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
    protected PaymentBillDataController() throws RemoteException {
    }

    /**
     * Submits a bill or saves a bill as a draft
     *
     * @param bill PaymentBill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(PaymentBillPo bill) {
        return null;
    }

    /**
     * Activates a bill.
     *
     * @param id id for the PaymentBill that have been approved of
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage activate(String id) {
        return null;
    }

    /**
     * Abandons a bill.
     *
     * @param id id for the PaymentBill to be abandoned
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
     * @return PaymentBillVos that match query condition
     */
    @Override
    public PaymentBillPo[] query(PaymentBillQueryVo query) {
        return new PaymentBillPo[0];
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
