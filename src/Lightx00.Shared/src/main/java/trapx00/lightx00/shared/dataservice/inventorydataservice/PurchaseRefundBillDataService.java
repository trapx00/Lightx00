package trapx00.lightx00.shared.dataservice.inventorydataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.salestaff.PurchaseRefundBillPo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface  PurchaseRefundBillDataService extends Remote {

    /**
     * submit a purchaseRefundBill
     * @param purchaseRefundBill to be submitted
     * @return whether the operation is done successfully
     */
    ResultMessage submit(PurchaseRefundBillPo purchaseRefundBill) throws RemoteException;//提交进货退货单

}