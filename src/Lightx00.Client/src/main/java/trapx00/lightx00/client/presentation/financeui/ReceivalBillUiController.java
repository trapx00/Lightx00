package trapx00.lightx00.client.presentation.financeui;

import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.client.vo.Reversible;

import java.io.IOException;

public class ReceivalBillUiController implements DraftContinueWritableUiController, ExternalLoadableUiController, ReversibleUi {
    /**
     * Start continuing write a draft. Returns a External loaded ui package.
     * Overrides to return a specific ui controller.
     *
     * @param draft draft
     * @return External loaded ui package including a controller and the component.
     */
    @Override
    public ExternalLoadedUiPackage continueWriting(Draftable draft) {
        return null;
    }

    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/financeui/ReceivalBillUi.fxml").loadAndGetPackageWithoutException();
    }

    /**
     * Revert a reversible.
     *
     * @param reversible reversible
     * @return External loaded ui package including a controller and the component.
     */
    @Override
    public ExternalLoadedUiPackage revertReversible(Reversible reversible) {
        return null;
    }
}
