package trapx00.lightx00.client.presentation.helpui;

import trapx00.lightx00.client.vo.Draftable;

public interface ContinueWritable {
    /**
     * Start continuing write a draft. Returns a FillBillUiController. It can be used to set the stage without casting to specific ui controller.
     * Overrides to return a specific ui controller.
     * @param draft draft
     * @return a FillBillUiController
     */
    FillBillUiController continueWriting(Draftable draft);

}
