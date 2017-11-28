package trapx00.lightx00.shared.dataservice.financedataservice;

import trapx00.lightx00.shared.dataservice.CommonBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.PaymentBillPo;
import trapx00.lightx00.shared.queryvo.PaymentBillQueryVo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PaymentBillDataService extends CommonBillDataService<PaymentBillPo, PaymentBillQueryVo> {


}
