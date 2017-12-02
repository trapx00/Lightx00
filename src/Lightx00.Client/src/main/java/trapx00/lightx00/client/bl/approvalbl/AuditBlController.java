package trapx00.lightx00.client.bl.approvalbl;

import trapx00.lightx00.client.bl.draftbl.DraftService;
import trapx00.lightx00.client.bl.draftbl.factory.DraftServiceFactory;
import trapx00.lightx00.client.bl.logbl.LogService;
import trapx00.lightx00.client.bl.logbl.factory.LogServiceFactory;
import trapx00.lightx00.client.blservice.approvalblservice.AuditBlService;
import trapx00.lightx00.client.datafactory.approvaldataservicefactory.AuditDataServiceFactory;
import trapx00.lightx00.client.vo.BillVo;
import trapx00.lightx00.client.vo.manager.BillInfoVo;
import trapx00.lightx00.shared.dataservice.approvaldataservice.AuditDataService;
import trapx00.lightx00.shared.exception.bl.UncheckedRemoteException;
import trapx00.lightx00.shared.exception.database.IdExistsException;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.log.LogSeverity;
import trapx00.lightx00.shared.queryvo.BillInfoQueryVo;

import java.rmi.RemoteException;
import java.util.function.Function;

public class AuditBlController implements AuditBlService,ApprovalRequest {
    private LogService logService = LogServiceFactory.getLogService();
    private AuditDataService dataService = AuditDataServiceFactory.getService();

    /**
     * Reject to approve the bill.
     * @param billInfo bill to be audited
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage reject(BillInfoVo billInfo) {
        try {
            ResultMessage opResult = dataService.reject(billInfo.toPo());
            if (opResult.isSuccess()) {
                logService.log(LogSeverity.Success, String.format("审批并拒绝通过一张%s，单据编号是%s。", billInfo.getType().toString(), billInfo.getId()));
            } else {
                logService.log(LogSeverity.Failure, String.format("审批并拒绝通过一张%s失败，原因不明。单据编号是%s。",billInfo.getType().toString(), billInfo.getId()));
            }
            return opResult;
        } catch (RemoteException e) {
            logService.log(LogSeverity.Failure, String.format("审批并拒绝通过一张%s失败，原因网络原因，具体信息是%s，单据编号是%s", billInfo.getType().toString(), e.getMessage(), billInfo.getId()));
            throw new UncheckedRemoteException(e);
        }
    }

    /**
     * Approve the bill.
     * @param billInfo bill to be audited
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage pass(BillInfoVo billInfo) {
        try {
            ResultMessage opResult = dataService.pass(billInfo.toPo());
            if (opResult.isSuccess()) {
                logService.log(LogSeverity.Success, String.format("审批并通过一张%s，单据编号是%s。", billInfo.getType().toString(), billInfo.getId()));
            } else {
                logService.log(LogSeverity.Failure, String.format("审批并通过一张%s失败，原因不明。单据编号是%s。",billInfo.getType().toString(), billInfo.getId()));
            }
            return opResult;
        } catch (RemoteException e) {
            logService.log(LogSeverity.Failure, String.format("审批并通过一张%s失败，原因网络原因，具体信息是%s，单据编号是%s", billInfo.getType().toString(), e.getMessage(), billInfo.getId()));
            throw new UncheckedRemoteException(e);
        }
    }

    /**
     * Filter bills.
     * @param query the filter conditions
     * @return array of bills which match the conditions
     */
    @Override
    public BillInfoVo[] query(BillInfoQueryVo query) {
        return new BillInfoVo[0];
    }

    /**
     * Submitted bills request approval.
     * @param bill bill has been submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage requestApproval(BillVo  bill) {
        return null;
    }
}
