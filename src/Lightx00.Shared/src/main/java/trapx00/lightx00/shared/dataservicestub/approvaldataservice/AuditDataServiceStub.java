package trapx00.lightx00.shared.dataservicestub.approvaldataservice;

import trapx00.lightx00.shared.dataservice.approvaldataservice.AuditDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.CashBillPo;
import trapx00.lightx00.shared.queryvo.BillQueryVo;

import java.rmi.RemoteException;
import java.util.Date;

public class AuditDataServiceStub implements AuditDataService {

    @Override
    public BillPo[] query(BillQueryVo query) {
        return new BillPo[]{
          new CashBillPo("0001",new Date(), BillState.Draft, "123","123",null)
        };
    }

    @Override
    public ResultMessage reject(BillPo bill) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage pass(BillPo bill) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage requestApproval(BillPo bill) throws RemoteException {
        return ResultMessage.Success;
    }


}
