package trapx00.lightx00.client.bl.draftbl.mock;

import trapx00.lightx00.client.bl.draftbl.DraftBlController;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.financestaff.FinanceStaffVo;
import trapx00.lightx00.client.vo.financestaff.PaymentBillVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.DraftVo;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.employee.EmployeePosition;
import trapx00.lightx00.shared.po.financestaff.Transcation;
import trapx00.lightx00.shared.queryvo.DraftQueryVo;
import java.util.Date;

public class DraftBlControllerMock extends DraftBlController {
    /**
     * Saves a draftable as a draft.
     *
     * @param draft draft
     * @return whether operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(Draftable draft) {
        return ResultMessage.Success;
    }

    /**
     * Updates current user's draft.
     *
     * @return Current User's draft
     */
    @Override
    public DraftVo[] update() {
        return new DraftVo[]{
                new DraftVo(new Date(), "123",
                        new FinanceStaffVo("drafter","123",new Date(), "123"),
                        new PaymentBillVo("FKD-20171111-00001",new Date(), BillState.Draft, "123", "123",
                                new Transcation[] { new Transcation("123",10.0,"123")},
                                10.0)
                        )
                };
    }

    /**
     * Deletes a draft.
     *
     * @param draft draft to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(Draftable draft) {
        return ResultMessage.Success;
    }
}
