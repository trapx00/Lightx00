package trapx00.lightx00.client.bl.financebl.factory;

import trapx00.lightx00.client.bl.financebl.TradeSituationBlController;
import trapx00.lightx00.client.bl.financebl.mock.TradeSituationBlControllerMock;

public class TradeSituationBlFactory {
    private static TradeSituationBlController controller = new TradeSituationBlController();

    public static TradeSituationBlController getController() {
        return controller;
    }
}
