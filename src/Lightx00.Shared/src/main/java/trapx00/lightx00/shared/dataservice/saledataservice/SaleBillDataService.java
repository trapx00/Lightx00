package trapx00.lightx00.shared.dataservice.saledataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.salestaff.SaleBillPo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SaleBillDataService extends Remote {

    /**
     * submit a saleBill
     * @param saleBill to be submitted
     * @return whether the operation is done successfully
     */
    ResultMessage submit(SaleBillPo saleBill) throws RemoteException;//提交销售单
}