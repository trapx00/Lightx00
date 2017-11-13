package trapx00.lightx00.client.presentation.financeui.mock;

import trapx00.lightx00.client.presentation.financeui.PaymentBillUiController;
import trapx00.lightx00.client.presentation.helpui.FillBillUiController;
import trapx00.lightx00.client.vo.Draftable;

public class PaymentBillUiControllerMock extends PaymentBillUiController {
    /**
     * Start continuing write a draft. Returns a FillBillUiController. It can be used to set the stage without casting to specific ui controller.
     * Overrides to return a specific ui controller.
     *
     * @param draft draft
     * @return a FillBillUiController
     */
    @Override
    public FillBillUiController continueWriting(Draftable draft) {
        return this;
    }
}
