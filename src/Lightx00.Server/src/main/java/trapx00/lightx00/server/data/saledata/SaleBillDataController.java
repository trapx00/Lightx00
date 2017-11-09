package trapx00.lightx00.server.data.saledata;

import trapx00.lightx00.shared.dataservice.saledataservice.SaleBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.salestaff.SaleBillPo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SaleBillDataController extends UnicastRemoteObject implements SaleBillDataService {

    /**
     *
     * @throws RemoteException
     */
    public SaleBillDataController() throws RemoteException {
        super();
    }

    /**
     * submit a saleBill
     *
     * @param saleBill to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit (SaleBillPo saleBill) throws RemoteException {
        return ResultMessage.Success;
    }
}
