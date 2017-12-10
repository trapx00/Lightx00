package trapx00.lightx00.client.presentation.clientui.mock;

import trapx00.lightx00.client.presentation.clientui.ClientUiController;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadedUiPackage;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.client.vo.salestaff.ClientVo;

public class ClientUiControllerMock extends ClientUiController {

    /**
     * Start continuing write a draft. Returns a ExternalLoadableUiController. It can be used to set the stage without casting to specific ui controller.
     * Overrides to return a specific ui controller.
     *
     * @param draft draft
     * @return a ExternalLoadableUiController
     */
    @Override
    public ExternalLoadedUiPackage continueWriting(Draftable draft) {
        return super.continueWriting(draft);
    }
}
