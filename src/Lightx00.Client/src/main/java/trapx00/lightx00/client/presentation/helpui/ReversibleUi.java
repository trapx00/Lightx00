package trapx00.lightx00.client.presentation.helpui;

import trapx00.lightx00.client.vo.Reversible;

import java.io.IOException;

public interface ReversibleUi<T extends Reversible> {
    /**
     * Revert a reversible.
     * @param reversible reversible
     * @return External loaded ui package including a controller and the component.
     */
    ExternalLoadedUiPackage revertReversible(T reversible) throws IOException;
}
