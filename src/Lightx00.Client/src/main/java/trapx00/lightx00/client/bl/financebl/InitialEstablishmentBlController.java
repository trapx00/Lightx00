package trapx00.lightx00.client.bl.financebl;

import trapx00.lightx00.client.bl.bankaccountbl.BankAccountInfo;
import trapx00.lightx00.client.bl.bankaccountbl.factory.BankAccountFactory;
import trapx00.lightx00.client.bl.clientbl.ClientQueryService;
import trapx00.lightx00.client.bl.clientbl.factory.ClientPoVoCoverterFactory;
import trapx00.lightx00.client.bl.clientbl.factory.ClientQueryServiceFactory;
import trapx00.lightx00.client.bl.commoditybl.CommodityInfo;
import trapx00.lightx00.client.bl.commoditybl.factory.CommodityInfoFactory;
import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.bl.util.BillPoVoConverter;
import trapx00.lightx00.client.bl.util.CommonBillBlController;
import trapx00.lightx00.client.bl.util.PoVoConverter;
import trapx00.lightx00.client.blservice.financeblservice.InitialEstablishmentBlService;
import trapx00.lightx00.client.bl.approvalbl.BillApprovalCompleteService;
import trapx00.lightx00.client.datafactory.financedataservicefactory.InitialEstablishmentDataServiceFactory;
import trapx00.lightx00.client.vo.financestaff.BankAccountVo;
import trapx00.lightx00.client.vo.salestaff.ClientVo;
import trapx00.lightx00.shared.dataservice.financedataservice.InitialEstablishmentDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.client.ClientPo;
import trapx00.lightx00.shared.po.financestaff.SystemSnapshotPo;
import trapx00.lightx00.shared.queryvo.SystemSnapshotQueryVo;
import trapx00.lightx00.client.vo.financestaff.SystemSnapshotVo;
import trapx00.lightx00.shared.po.financestaff.BankAccountPo;

public class InitialEstablishmentBlController
    implements InitialEstablishmentBlService, NotificationActivateService, NotificationAbandonService,
    DraftDeleteService, SystemSnapshotInfo, BillApprovalCompleteService, BillPoVoConverter<SystemSnapshotPo, SystemSnapshotVo> {

    private InitialEstablishmentDataService dataService = InitialEstablishmentDataServiceFactory.getService();
    private BankAccountInfo bankAccountInfo = BankAccountFactory.getBankAccountInfo();
    private PoVoConverter<BankAccountPo, BankAccountVo> bankAccountVoPoVoConverter = BankAccountFactory.getPoVoConverter();

    private ClientQueryService clientInfo = ClientQueryServiceFactory.getQueryService();
    private PoVoConverter<ClientPo, ClientVo> clientVoPoVoConverter = ClientPoVoCoverterFactory.getClientPoVoConverter();

    private CommodityInfo commodityInfo = CommodityInfoFactory.getCommodityInfo();

    private CommonBillBlController<SystemSnapshotVo, SystemSnapshotPo, SystemSnapshotQueryVo> commonBillBlController
        = new CommonBillBlController<>(dataService, "期初建账", this);



    /**
     * Auto fills some contents with current system state.
     *
     * @return SystemSnapshot with current system state
     */
    @Override
    public SystemSnapshotVo autofill() {
        return null;
    }

    /**
     * Submits the system snapshot.
     *
     * @param snapshot SystemSnapVo to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(SystemSnapshotVo snapshot) {
        return null;
    }

    /**
     * Saves a half-completed system snapshot as a draft.
     *
     * @param snapshot SystemSnapshotVo to be saved as draft
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(SystemSnapshotVo snapshot) {
        return null;
    }

    /**
     * Deletes a draft.
     *
     * @param id id of the draft to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage deleteDraft(String id) {
        return null;
    }

    /**
     * Queries SystemSnapshot.
     *
     * @param query query
     * @return SystemSnapshotVos that match the query
     */
    @Override
    public SystemSnapshotVo[] query(SystemSnapshotQueryVo query) {
        return new SystemSnapshotVo[0];
    }

    /**
     * Abandons a bill.
     *
     * @param id id for the bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage abandon(String id) {
        return null;
    }

    /**
     * Activates a bill that has been approved of.
     *
     * @param id id for the bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage activate(String id) {
        return null;
    }

    /**
     * When bill is approved, this method is called to modify the state of the bill.
     *
     * @param billId id for the bill
     * @param state  newState. Only BillState.Approved and BillState.Rejected are allowed.
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage approvalComplete(String billId, BillState state) {
        return null;
    }

    /**
     * Convert vo to po.
     *
     * @param vo vo
     * @return po
     */
    @Override
    public SystemSnapshotPo fromVoToPo(SystemSnapshotVo vo) {
        return null;
    }

    /**
     * Convert po to vo.
     *
     * @param po po
     * @return vo
     */
    @Override
    public SystemSnapshotVo fromPoToVo(SystemSnapshotPo po) {
        return null;
    }
}
