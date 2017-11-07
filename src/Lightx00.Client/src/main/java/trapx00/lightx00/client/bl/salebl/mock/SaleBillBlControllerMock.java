package trapx00.lightx00.client.bl.salebl.mock;

import trapx00.lightx00.client.bl.salebl.SaleBillBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.salestaff.SaleBillPo;
import trapx00.lightx00.shared.queryvo.SaleBillQueryVo;
import trapx00.lightx00.client.vo.salestaff.SaleBillVo;

public class SaleBillBlControllerMock extends SaleBillBlController {
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
     * submit a saleBill
     *
     * @param saleBill to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(SaleBillVo saleBill) {
        SaleBillPo saleBillPo;
        return saleBillDataService.submit(saleBillPo);
    }

    /**
     * saves a half-completed saleBill as draft.
     *
     * @param saleBill SaleBillVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(SaleBillVo saleBill) {
        return null;
    }

    /**
     * Gets the id for the next saleBill
     *
     * @return id for the next saleBill
     */
    @Override
    public String getId() {
        return null;
    }

    /**
     * query for SaleBills
     *
     * @param query function
     * @return array of SaleBillVo
     */
    @Override
    public SaleBillVo[] querySaleBill(SaleBillQueryVo query) {
        return new SaleBillVo[0];
    }
}
