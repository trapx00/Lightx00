package trapx00.lightx00.server.data.inventorydata;

import trapx00.lightx00.shared.dataservice.inventorydataservice.PurchaseBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.salestaff.PurchaseBillPo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PurchaseBillDataController extends UnicastRemoteObject implements PurchaseBillDataService {
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
    protected PurchaseBillDataController() throws RemoteException {
    }

    /**
     * submit a purchaseBill
     *
     * @param purchaseBill to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(PurchaseBillPo purchaseBill) {
        return null;
    }
}
