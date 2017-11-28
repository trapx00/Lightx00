package trapx00.lightx00.shared.dataservice.inventorydataservice;

import trapx00.lightx00.shared.dataservice.CommonBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.salestaff.PurchaseBillPo;
import trapx00.lightx00.shared.queryvo.PurchaseBillQueryVo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PurchaseBillDataService extends CommonBillDataService<PurchaseBillPo, PurchaseBillQueryVo> {

}