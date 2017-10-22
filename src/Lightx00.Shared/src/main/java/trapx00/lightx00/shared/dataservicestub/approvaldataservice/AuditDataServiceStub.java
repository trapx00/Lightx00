package trapx00.lightx00.shared.dataservicestub.approvaldataservice;

import trapx00.lightx00.shared.dataservice.approvaldataservice.AuditDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.vo.BillVo;

import java.util.Date;

public class AuditDataServiceStub implements AuditDataService {
    @Override
    public BillVo[] query(String id, BillType type, Date date, BillState state) {

        return new BillVo[]{
                new BillVo(BillType.FinanceBill,"0001",new Date(), BillState.WaitingForApproval)
        };

    }

    @Override
    public ResultMessage reject(BillVo bill) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage pass(BillVo bill) {
        return ResultMessage.Success;
    }
}
