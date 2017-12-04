package trapx00.lightx00.client.bl.inventorybl;

import trapx00.lightx00.client.bl.adminbl.EmployeeInfo;
import trapx00.lightx00.client.bl.adminbl.factory.EmployeeInfoFactory;
import trapx00.lightx00.client.bl.approvalbl.BillApprovalCompleteService;
import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.bl.util.BillPoVoConverter;
import trapx00.lightx00.client.bl.util.CommonBillBlController;
import trapx00.lightx00.client.blservice.inventoryblservice.PurchaseBillBlService;
import trapx00.lightx00.client.datafactory.inventorydataservicefactory.PurchaseBillDataServiceFactory;
import trapx00.lightx00.client.vo.financestaff.CashBillVo;
import trapx00.lightx00.client.vo.salestaff.PurchaseBillVo;
import trapx00.lightx00.client.vo.salestaff.SaleStaffVo;
import trapx00.lightx00.shared.dataservice.inventorydataservice.PurchaseBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.CashBillPo;
import trapx00.lightx00.shared.po.salestaff.PurchaseBillPo;
import trapx00.lightx00.shared.queryvo.CashBillQueryVo;
import trapx00.lightx00.shared.queryvo.PurchaseBillQueryVo;

import java.util.Date;
import java.util.List;

public class PurchaseBillBlController implements PurchaseBillBlService, NotificationActivateService, NotificationAbandonService, DraftDeleteService, BillApprovalCompleteService, BillPoVoConverter<PurchaseBillPo, PurchaseBillVo> {
    EmployeeInfo employeeInfo = EmployeeInfoFactory.getEmployeeInfo();
    PurchaseBillDataService dataService = PurchaseBillDataServiceFactory.getInstance();
    private CommonBillBlController<PurchaseBillVo, PurchaseBillPo, PurchaseBillQueryVo> commonBillBlController
            = new CommonBillBlController<>(dataService, "进货单", this);

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
     * submit a purchaseBill
     *
     * @param purchaseBill to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(PurchaseBillVo purchaseBill) {
        return commonBillBlController.submit(purchaseBill);
    }

    /**
     * saves a half-completed purchaseBill as draft.
     *
     * @param purchaseBill PurchaseBillVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(PurchaseBillVo purchaseBill) {
        return commonBillBlController.saveAsDraft(purchaseBill);
    }

    /**
     * Gets the id for the next purchaseBill
     *
     * @return id for the next purchaseBill
     */
    @Override
    public String getId() {
        return commonBillBlController.getId();
    }

    /**
     * query for PurchaseBills
     *
     * @param query function
     * @return array of PurchaseBillVo
     */
    @Override
    public PurchaseBillVo[] queryPurchaseBillVo(PurchaseBillQueryVo query) {
        List<PurchaseBillVo> list = commonBillBlController.query(query);
        return list.toArray(new PurchaseBillVo[list.size()]);
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
    public PurchaseBillPo fromVoToPo(PurchaseBillVo vo) {
        return new PurchaseBillPo(vo.getId(), vo.getDate(), vo.getState(), vo.getSupplier(), vo.getRepository(), vo.getOperator().getId(), vo.getComment(), vo.getTotal(), vo.getCommodityList());
    }

    /**
     * Convert po to vo.
     *
     * @param po po
     * @return vo
     */
    @Override
    public PurchaseBillVo fromPoToVo(PurchaseBillPo po) {
        return new PurchaseBillVo(po.getId(), po.getDate(), po.getState(), po.getSupplier(), po.getRepository(), (SaleStaffVo) employeeInfo.queryById(po.getOperatorId()), po.getComment(), po.getTotal(), po.getCommodityList());
    }
}


