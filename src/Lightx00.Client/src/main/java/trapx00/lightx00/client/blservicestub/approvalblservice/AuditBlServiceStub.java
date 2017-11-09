package trapx00.lightx00.client.blservicestub.approvalblservice;

import trapx00.lightx00.client.blservice.approvalblservice.AuditBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.client.vo.BillVo;
import trapx00.lightx00.shared.queryvo.BillQueryVo;

import java.util.Date;

public class AuditBlServiceStub implements AuditBlService {
    @Override
    public BillVo[] query(BillQueryVo query) {
        return new BillVo[] {
            new BillVo(BillType.FinanceBill,"0001",new Date(),BillState.WaitingForApproval)
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
