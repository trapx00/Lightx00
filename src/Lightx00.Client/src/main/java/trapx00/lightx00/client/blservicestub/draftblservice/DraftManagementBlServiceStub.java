package trapx00.lightx00.client.blservicestub.draftblservice;

import trapx00.lightx00.client.blservice.draftblservice.DraftManagementBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.FinanceBillType;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.DraftVo;
import trapx00.lightx00.shared.vo.Draftable;
import trapx00.lightx00.shared.vo.financestaff.FinanceBillVo;

import java.util.Date;

public class DraftManagementBlServiceStub implements DraftManagementBlService {
    @Override
    public DraftVo[] update() {
        return new DraftVo[]{
                new DraftVo(new Date(), "","",null,"")
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
        return null;
    }
}
