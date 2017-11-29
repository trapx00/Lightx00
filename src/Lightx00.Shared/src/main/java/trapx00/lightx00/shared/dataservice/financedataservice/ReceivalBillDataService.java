package trapx00.lightx00.shared.dataservice.financedataservice;

import trapx00.lightx00.shared.dataservice.CommonBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.ReceivalBillPo;
import trapx00.lightx00.shared.queryvo.ReceivalBillQueryVo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ReceivalBillDataService extends CommonBillDataService<ReceivalBillPo, ReceivalBillQueryVo> {


}
