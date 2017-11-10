package trapx00.lightx00.shared.dataservicestub.approvaldataservice;

import trapx00.lightx00.shared.dataservice.approvaldataservice.AuditDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.queryvo.BillQueryVo;

import java.rmi.RemoteException;

public class AuditDataServiceStub implements AuditDataService {

    @Override
    public BillPo[] query(BillQueryVo query) {
        return new BillPo[0];
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
