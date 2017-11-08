package trapx00.lightx00.client.bl.inventorybl.mock;

import trapx00.lightx00.client.bl.inventorybl.PurchaseRefundBillBlController;
import trapx00.lightx00.client.vo.salestaff.PurchaseRefundBillVo;
import trapx00.lightx00.shared.po.ResultMessage;

public class PurchaseRefundBillBlControllerMock extends PurchaseRefundBillBlController {

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
     * submit a purchaseRefundBill
     *
     * @param purchaseRefundBill to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(PurchaseRefundBillVo purchaseRefundBill) {
        return null;
    }

    /**
     * saves a half-completed purchaseRefundBill as draft.
     *
     * @param purchaseRefundBill PurchaseRefundBillVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(PurchaseRefundBillVo purchaseRefundBill) {
        return null;
    }

    /**
     * Gets the id for the next purchaseRefundBill
     *
     * @return id for the next purchaseRefundBill
     */
    @Override
    public String getId() {
        return null;
    }

    /**
     * query for PurchaseRefundBills
     *
     * @param query function
     * @return array of PurchaseRefundBillVo
     */
    @Override
    public PurchaseRefundBillVo[] queryPurchaseRefundBillVo(PurchaseRefundBillVo query) {
        return new PurchaseRefundBillVo[0];
    }
}
