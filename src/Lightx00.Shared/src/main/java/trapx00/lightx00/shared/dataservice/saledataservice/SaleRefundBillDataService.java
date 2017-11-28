package trapx00.lightx00.shared.dataservice.saledataservice;

import trapx00.lightx00.shared.dataservice.CommonBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.salestaff.SaleRefundBillPo;
import trapx00.lightx00.shared.queryvo.SaleRefundBillQueryVo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SaleRefundBillDataService extends CommonBillDataService<SaleRefundBillPo, SaleRefundBillQueryVo> {

}