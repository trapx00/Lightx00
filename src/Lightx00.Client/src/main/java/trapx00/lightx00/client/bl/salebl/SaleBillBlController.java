package trapx00.lightx00.client.bl.salebl;

import trapx00.lightx00.client.bl.adminbl.EmployeeInfo;
import trapx00.lightx00.client.bl.adminbl.factory.EmployeeInfoFactory;
import trapx00.lightx00.client.bl.approvalbl.BillApprovalCompleteService;
import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.bl.notificationbl.NotificationService;
import trapx00.lightx00.client.bl.util.BillPoVoConverter;
import trapx00.lightx00.client.bl.util.CommonBillBlController;
import trapx00.lightx00.client.blservice.notificationblservice.NotificationBlService;
import trapx00.lightx00.client.blservice.notificationblservice.NotificationBlServiceFactory;
import trapx00.lightx00.client.blservice.saleblservice.SaleBillBlService;
import trapx00.lightx00.client.datafactory.saledataservicefactory.SaleBillDataServiceFactory;
import trapx00.lightx00.client.datafactory.saledataservicefactory.SaleRefundBillDataServiceFactory;
import trapx00.lightx00.client.vo.manager.promotion.PromotionVoBase;
import trapx00.lightx00.client.vo.notification.NotificationVo;
import trapx00.lightx00.client.vo.notification.others.OtherNotificationVo;
import trapx00.lightx00.client.vo.salestaff.SaleBillVo;
import trapx00.lightx00.client.vo.salestaff.SaleRefundBillVo;
import trapx00.lightx00.client.vo.salestaff.SaleStaffVo;
import trapx00.lightx00.shared.dataservice.saledataservice.SaleBillDataService;
import trapx00.lightx00.shared.dataservice.saledataservice.SaleRefundBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.salestaff.SaleBillPo;
import trapx00.lightx00.shared.po.salestaff.SaleRefundBillPo;
import trapx00.lightx00.shared.queryvo.SaleBillQueryVo;
import trapx00.lightx00.shared.queryvo.SaleRefundBillQueryVo;

import java.util.Date;
import java.util.List;

public class SaleBillBlController implements SaleBillBlService, NotificationActivateService, NotificationAbandonService, DraftDeleteService, BillApprovalCompleteService, BillPoVoConverter<SaleBillPo, SaleBillVo> {
    private EmployeeInfo employeeInfo = EmployeeInfoFactory.getEmployeeInfo();
    private SaleBillDataService dataService = SaleBillDataServiceFactory.getInstance();
    private CommonBillBlController<SaleBillVo, SaleBillPo, SaleBillQueryVo> commonBillBlController
            = new CommonBillBlController<>(dataService, "销售单", this);
    private NotificationBlService notificationService=NotificationBlServiceFactory.getInstance();

    /**
     * Deletes a draft.
     *
     * @param id id of the draft to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage deleteDraft(String id) {
        return commonBillBlController.deleteDraft(id);
    }

    /**
     * Abandons a bill.
     *
     * @param id id for the bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage abandon(String id) {
        return commonBillBlController.abandon(id);
    }

    /**
     * Activates a bill that has been approved of.
     *
     * @param id id for the bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage activate(String id) {
        notificationService.acknowledge(new OtherNotificationVo(new Date(),))
        return commonBillBlController.activate(id);
    }

    /**
     * submit a saleBill
     *
     * @param saleBill to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(SaleBillVo saleBill) {
        return commonBillBlController.submit(saleBill);
    }

    /**
     * saves a half-completed saleBill as draft.
     *
     * @param saleBill SaleBillVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(SaleBillVo saleBill) {
        return commonBillBlController.saveAsDraft(saleBill);
    }

    /**
     * Gets the id for the next saleBill
     *
     * @return id for the next saleBill
     */
    @Override
    public String getId() {
        return commonBillBlController.getId();
    }

    /**
     * query for SaleBills
     *
     * @param query function
     * @return array of SaleBillVo
     */
    @Override
    public SaleBillVo[] querySaleBill(SaleBillQueryVo query) {
        List<SaleBillVo> list = commonBillBlController.query(query);
        return list.toArray(new SaleBillVo[list.size()]);
    }

    /**
     * query for sale promotion
     *
     * @param saleBillVo current sale bill
     * @return promotions
     */
    @Override
    public PromotionVoBase[] queryPromotion(SaleBillVo saleBillVo) {
        return new PromotionVoBase[0];
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
        return commonBillBlController.approvalComplete(billId, state);
    }

    /**
     * Convert vo to po.
     *
     * @param vo vo
     * @return po
     */
    @Override
    public SaleBillPo fromVoToPo(SaleBillVo vo) {
        return new SaleBillPo(vo.getId(), vo.getDate(), vo.getState(), vo.getClientId(), vo.getSalesman().getId(), vo.getOperator().getId(), vo.getRepository(), vo.getCommodityList(), vo.getOriginTotal(), vo.getMinusProfits(), vo.getToken(), vo.getUltiTotal(), vo.getComment(), vo.getClientLevel(), vo.getPromotionId(),vo.getGiftList());
    }

    /**
     * Convert po to vo.
     *
     * @param po po
     * @return vo
     */
    @Override
    public SaleBillVo fromPoToVo(SaleBillPo po) {
        return new SaleBillVo(po.getId(), po.getDate(), po.getState(), po.getClientId(), (SaleStaffVo) employeeInfo.queryById(po.getSalesmanId()), (SaleStaffVo) employeeInfo.queryById(po.getOperatorId()), po.getRepository(), po.getCommodityList(), po.getOriginTotal(), po.getMinusProfits(), po.getToken(), po.getUltiTotal(), po.getComment(), po.getClientLevel(), po.getPromotionId(),po.getGiftList());
    }
}
