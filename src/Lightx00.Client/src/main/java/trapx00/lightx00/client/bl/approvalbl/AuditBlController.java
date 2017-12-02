package trapx00.lightx00.client.bl.approvalbl;

import trapx00.lightx00.client.bl.draftbl.DraftService;
import trapx00.lightx00.client.bl.draftbl.factory.DraftServiceFactory;
import trapx00.lightx00.client.bl.financebl.BillInfo;
import trapx00.lightx00.client.bl.financebl.factory.BillInfoBlFactory;
import trapx00.lightx00.client.bl.logbl.LogService;
import trapx00.lightx00.client.bl.logbl.factory.LogServiceFactory;
import trapx00.lightx00.client.bl.util.BillPoVoConverter;
import trapx00.lightx00.client.bl.util.PoVoConverter;
import trapx00.lightx00.client.blservice.approvalblservice.AuditBlService;
import trapx00.lightx00.client.datafactory.approvaldataservicefactory.AuditDataServiceFactory;
import trapx00.lightx00.client.vo.BillVo;
import trapx00.lightx00.client.vo.manager.BillInfoVo;
import trapx00.lightx00.shared.dataservice.approvaldataservice.AuditDataService;
import trapx00.lightx00.shared.exception.bl.UncheckedRemoteException;
import trapx00.lightx00.shared.exception.database.IdExistsException;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.log.LogSeverity;
import trapx00.lightx00.shared.po.manager.BillInfoPo;
import trapx00.lightx00.shared.queryvo.BillInfoQueryVo;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.Date;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AuditBlController implements AuditBlService, ApprovalRequest, PoVoConverter<BillInfoPo,BillInfoVo> {
    private LogService logService = LogServiceFactory.getLogService();
    private AuditDataService dataService = AuditDataServiceFactory.getService();
    private BillInfo billDetailService = BillInfoBlFactory.getBillInfo();
    private BillPoVoConverter<BillInfoPo, BillInfoVo> converter;

    public BillInfoVo fromPoToVo(BillInfoPo po) {
        return new BillInfoVo(po.getId(), po.getType(), po.getApprovalTime(), po.getState());

    }

    public BillInfoPo fromVoToPo(BillInfoVo vo) {
        return new BillInfoPo(vo.getId(), vo.getType(), vo.getApprovalTime(), vo.getState());
    }

    /**
     * Reject to approve the bill.
     * @param billInfo bill to be audited
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage reject(BillInfoVo billInfo) {
        try {
            //查看单据详情时获得billVo
            BillVo currentBill = query(billInfo.getId());
            ResultMessage opResult = dataService.reject(fromVoToPo(billInfo));
            if (opResult.isSuccess()) {
                //调用接口，修改bill的状态属性
                BillApprovalCompleteService approvalService = currentBill.billApprovalCompleteService();
                approvalService.approvalComplete(billInfo.getId(),BillState.Rejected);
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
            //查看单据详情时获得billVo
            BillVo currentBill = query(billInfo.getId());
            ResultMessage opResult = dataService.pass(fromVoToPo(billInfo));
            if (opResult.isSuccess()) {
                //调用接口，修改bill的状态属性
                BillApprovalCompleteService approvalService = currentBill.billApprovalCompleteService();
                approvalService.approvalComplete(billInfo.getId(),BillState.Approved);
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
        try {
            BillInfoPo[] queryResult = dataService.query(query);
            return Arrays.stream(queryResult).map(x -> converter.fromPoToVo(x)).collect(Collectors.toList());
        } catch (RemoteException e) {
            throw new UncheckedRemoteException(e);
        }
    }

    /**
     * Filter bills.
     * @param id id of the bill
     * @return array of bills which match the conditions
     */
    private BillVo query(String id) {
        return billDetailService.queryBill(id);
    }

    /**
     * Submitted bills request approval.
     * @param bill bill has been submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage requestApproval(BillVo bill) {
        try {

        }
    }
}
