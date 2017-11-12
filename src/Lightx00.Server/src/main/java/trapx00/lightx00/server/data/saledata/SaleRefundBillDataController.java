package trapx00.lightx00.server.data.saledata;

import trapx00.lightx00.shared.dataservice.saledataservice.SaleRefundBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.salestaff.SaleRefundBillPo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SaleRefundBillDataController extends UnicastRemoteObject implements SaleRefundBillDataService {

    /**
     *
     * @throws RemoteException
     */
    public SaleRefundBillDataController() throws RemoteException {
        super();
    }

    /**
     * submit a saleRefundBill
     *
     * @param saleRefundBill to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(SaleRefundBillPo saleRefundBill) throws RemoteException {
        return null;
    }
}
