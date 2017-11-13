package trapx00.lightx00.client.blservicestub.approvalblservice;

import trapx00.lightx00.client.blservice.approvalblservice.AuditBlService;
import trapx00.lightx00.client.vo.financestaff.CashBillVo;
import trapx00.lightx00.client.vo.financestaff.FinanceBillVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.client.vo.BillVo;
import trapx00.lightx00.shared.queryvo.BillQueryVo;

import java.util.Date;

public class AuditBlServiceStub implements AuditBlService {
    /**
     * reject to approve the bill
     * @param bill bill to be audited
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage reject(BillVo bill) {
        return null;
    }

    /**
     * approve the bill
     * @param bill bill to be audited
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage pass(BillVo bill) {
        return null;
    }

    /**
     * filter bills
     * @param query the filter conditions
     * @return array of bills which match the conditions
     */
    @Override
    public BillVo[] query(BillQueryVo query) {
        return new BillVo[]{
                new CashBillVo("0001", new Date(), BillState.WaitingForApproval, "0001", "0001", null) {
                }
        };
    }

}
