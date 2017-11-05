package trapx00.lightx00.client.bl.salebl;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.blservice.saleblservice.SaleRefundBillBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.salestaff.SaleRefundBillQueryVo;
import trapx00.lightx00.shared.vo.salestaff.SaleRefundBillVo;

public class SaleRefundBillBlController implements SaleRefundBillBlService, NotificationActivateService, NotificationAbandonService, DraftDeleteService {
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
     * submit a saleRefundBill
     *
     * @param saleRefundBill to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(SaleRefundBillVo saleRefundBill) {
        return null;
    }

    /**
     * saves a half-completed saleRefundBill as draft.
     *
     * @param saleRefundBill SaleRefundBillVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(SaleRefundBillVo saleRefundBill) {
        return null;
    }

    /**
     * Gets the id for the next saleRefundBill
     *
     * @return id for the next saleRefundBill
     */
    @Override
    public String getId() {
        return null;
    }

    /**
     * query for SaleRefundBills
     *
     * @param query function
     * @return array of SaleRefundBillVo
     */
    @Override
    public SaleRefundBillVo[] querySaleRefundBill(SaleRefundBillQueryVo query) {
        return new SaleRefundBillVo[0];
    }
}
