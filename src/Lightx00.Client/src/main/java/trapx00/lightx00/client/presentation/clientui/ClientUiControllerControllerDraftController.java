package trapx00.lightx00.client.presentation.clientui;

import trapx00.lightx00.client.presentation.helpui.DraftContinueWritableUiController;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadableUiController;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadedUiPackage;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.client.vo.salestaff.ClientVo;

public class ClientUiControllerControllerDraftController implements DraftContinueWritableUiController, ClientInfoUi, ExternalLoadableUiController {
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
     * Start continuing write a draft. Returns a ExternalLoadableUiController. It can be used to set the stage without casting to specific ui controller.
     * Overrides to return a specific ui controller.
     *
     * @param draft draft
     * @return a ExternalLoadableUiController
     */
    @Override
    public ExternalLoadedUiPackage continueWriting(Draftable draft) {
        return null;
    }
}
