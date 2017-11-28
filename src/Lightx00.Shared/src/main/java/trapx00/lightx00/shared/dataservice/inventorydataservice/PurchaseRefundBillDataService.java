package trapx00.lightx00.shared.dataservice.inventorydataservice;

import trapx00.lightx00.shared.dataservice.CommonBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.salestaff.PurchaseRefundBillPo;
import trapx00.lightx00.shared.queryvo.PurchaseRefundBillQueryVo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PurchaseRefundBillDataService extends CommonBillDataService<PurchaseRefundBillPo, PurchaseRefundBillQueryVo> {


}