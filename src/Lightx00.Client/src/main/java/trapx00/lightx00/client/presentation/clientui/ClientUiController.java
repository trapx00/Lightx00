package trapx00.lightx00.client.presentation.clientui;

import trapx00.lightx00.client.presentation.helpui.ContinueWritable;
import trapx00.lightx00.client.presentation.helpui.FillBillUiController;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.client.vo.salestaff.ClientVo;

public class ClientUiController implements ContinueWritable, ClientInfoUi {
    /**
     * get the ui of select client
     *
     * @return the selected clientVo
     */
    @Override
    public ClientVo showClientSelectDialog() {
        return null;
    }

    /**
     * Start continuing write a draft. Returns a FillBillUiController. It can be used to set the stage without casting to specific ui controller.
     * Overrides to return a specific ui controller.
     *
     * @param draft draft
     * @return a FillBillUiController
     */
    @Override
    public FillBillUiController continueWriting(Draftable draft) {
        return null;
    }
}
