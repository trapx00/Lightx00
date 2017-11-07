package trapx00.lightx00.shared.dataservice.inventorydataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.salestaff.PurchaseBillPo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface  PurchaseBillDataService extends Remote {

    /**
     * submit a purchaseBill
     * @param purchaseBill to be submitted
     * @return whether the operation is done successfully
     */
    ResultMessage submit(PurchaseBillPo purchaseBill) throws RemoteException;//提交进货单
}