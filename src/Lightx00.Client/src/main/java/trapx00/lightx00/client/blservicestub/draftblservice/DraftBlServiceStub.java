package trapx00.lightx00.client.blservicestub.draftblservice;

import trapx00.lightx00.client.blservice.draftblservice.DraftBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.draft.DraftVo;
import trapx00.lightx00.client.vo.Draftable;

import java.util.Date;

public class DraftBlServiceStub implements DraftBlService {
    @Override
    public DraftVo[] update() {
        return new DraftVo[]{
                new DraftVo(new Date(), null,null,null)
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
