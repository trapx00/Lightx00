package trapx00.lightx00.client.bl.salebl;

import trapx00.lightx00.client.bl.adminbl.EmployeeInfo;
import trapx00.lightx00.client.bl.adminbl.factory.EmployeeInfoFactory;
import trapx00.lightx00.client.bl.approvalbl.BillApprovalCompleteService;
import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.bl.util.BillPoVoConverter;
import trapx00.lightx00.client.bl.util.CommonBillBlController;
import trapx00.lightx00.client.blservice.saleblservice.SaleRefundBillBlService;
import trapx00.lightx00.client.datafactory.inventorydataservicefactory.PurchaseBillDataServiceFactory;
import trapx00.lightx00.client.datafactory.saledataservicefactory.SaleRefundBillDataServiceFactory;
import trapx00.lightx00.client.vo.salestaff.PurchaseBillVo;
import trapx00.lightx00.client.vo.salestaff.SaleRefundBillVo;
import trapx00.lightx00.client.vo.salestaff.SaleStaffVo;
import trapx00.lightx00.shared.dataservice.inventorydataservice.PurchaseBillDataService;
import trapx00.lightx00.shared.dataservice.saledataservice.SaleRefundBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.salestaff.PurchaseBillPo;
import trapx00.lightx00.shared.po.salestaff.SaleRefundBillPo;
import trapx00.lightx00.shared.queryvo.PurchaseBillQueryVo;
import trapx00.lightx00.shared.queryvo.SaleRefundBillQueryVo;

import java.util.Date;
import java.util.List;

public class SaleRefundBillBlController implements SaleRefundBillBlService, NotificationActivateService, NotificationAbandonService, DraftDeleteService, BillApprovalCompleteService, BillPoVoConverter<SaleRefundBillPo, SaleRefundBillVo> {
    EmployeeInfo employeeInfo = EmployeeInfoFactory.getEmployeeInfo();
    SaleRefundBillDataService dataService = SaleRefundBillDataServiceFactory.getInstance();
    private CommonBillBlController<SaleRefundBillVo, SaleRefundBillPo, SaleRefundBillQueryVo> commonBillBlController
            = new CommonBillBlController<>(dataService, "销售退货单", this);

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
        return commonBillBlController.activate(id);
    }

    /**
     * submit a saleRefundBill
     *
     * @param saleRefundBill to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(SaleRefundBillVo saleRefundBill) {
        return commonBillBlController.submit(saleRefundBill);
    }

    /**
     * saves a half-completed saleRefundBill as draft.
     *
     * @param saleRefundBill SaleRefundBillVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(SaleRefundBillVo saleRefundBill) {
        return commonBillBlController.saveAsDraft(saleRefundBill);
    }

    /**
     * Gets the id for the next saleRefundBill
     *
     * @return id for the next saleRefundBill
     */
    @Override
    public String getId() {
        return commonBillBlController.getId();
    }

    /**
     * query for SaleRefundBills
     *
     * @param query function
     * @return array of SaleRefundBillVo
     */
    @Override
    public SaleRefundBillVo[] querySaleRefundBill(SaleRefundBillQueryVo query) {
        List<SaleRefundBillVo> list = commonBillBlController.query(query);
        return list.toArray(new SaleRefundBillVo[list.size()]);
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
    public SaleRefundBillPo fromVoToPo(SaleRefundBillVo vo) {
        return new SaleRefundBillPo(vo.getId(), vo.getDate(), vo.getState(), vo.getSupplier(), vo.getDefaultOperator().getId(), vo.getOperator().getId(), vo.getRepository(), vo.getCommodityList(), vo.getOriginTotal(), vo.getMinusProfits(), vo.getToken(), vo.getUltiTotal(), vo.getComment());
    }

    /**
     * Convert po to vo.
     *
     * @param po po
     * @return vo
     */
    @Override
    public SaleRefundBillVo fromPoToVo(SaleRefundBillPo po) {
        return new SaleRefundBillVo(po.getId(), po.getDate(), po.getState(), po.getSupplier(), (SaleStaffVo) employeeInfo.queryById(po.getDefaultOperatorId()), (SaleStaffVo) employeeInfo.queryById(po.getOperatorId()), po.getRepository(), po.getCommodityList(), po.getOriginTotal(), po.getMinusProfits(), po.getToken(), po.getUltiTotal(), po.getComment());
    }
}
