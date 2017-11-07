package trapx00.lightx00.shared.dataservice.saledataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.salestaff.SaleRefundBillPo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SaleRefundBillDataService extends Remote {

    /**
     * submit a saleRefundBill
     * @param saleRefundBill to be submitted
     * @return whether the operation is done successfully
     */
    ResultMessage submit(SaleRefundBillPo saleRefundBill) throws RemoteException;//提交销售退货单
}