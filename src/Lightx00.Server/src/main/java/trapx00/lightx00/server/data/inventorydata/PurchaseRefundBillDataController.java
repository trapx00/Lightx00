package trapx00.lightx00.server.data.inventorydata;

import trapx00.lightx00.shared.dataservice.inventorydataservice.PurchaseRefundBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.salestaff.PurchaseRefundBillPo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PurchaseRefundBillDataController extends UnicastRemoteObject implements PurchaseRefundBillDataService {
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
    public PurchaseRefundBillDataController() throws RemoteException {
    }

    /**
     * submit a purchaseRefundBill
     *
     * @param purchaseRefundBill to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(PurchaseRefundBillPo purchaseRefundBill) {
        return null;
    }
}
