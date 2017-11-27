package trapx00.lightx00.client.blservicestub.approvalblservice;

import trapx00.lightx00.client.blservice.approvalblservice.AuditBlService;
import trapx00.lightx00.client.vo.manager.BillInfoVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.queryvo.BillInfoQueryVo;

import java.util.Date;

public class AuditBlServiceStub implements AuditBlService {
    /**
     * Reject to approve the bill.
     * @param billInfo bill to be audited
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage reject(BillInfoVo billInfo) {
        return ResultMessage.Success;
    }

    /**
     * Approve the bill.
     * @param billInfo bill to be audited
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage pass(BillInfoVo billInfo) {
        return ResultMessage.Success;
    }

    /**
     * Filter bills.
     * @param query the filter conditions
     * @return array of bills which match the conditions
     */
    @Override
    public BillInfoVo[] query(BillInfoQueryVo query) {
        return new BillInfoVo[]{new BillInfoVo("XJFYD-20171112-00001", BillType.FinanceBill,new Date(), BillState.WaitingForApproval)
        };
    }

}
