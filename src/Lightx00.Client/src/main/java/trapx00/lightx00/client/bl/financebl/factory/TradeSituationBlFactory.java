package trapx00.lightx00.client.bl.financebl.factory;

import trapx00.lightx00.client.bl.financebl.TradeSituationBlController;
import trapx00.lightx00.client.bl.financebl.mock.TradeSituationBlControllerMock;
import trapx00.lightx00.client.blservice.financeblservice.TradeSituationBlService;

public class TradeSituationBlFactory {
    private static TradeSituationBlController controller = new TradeSituationBlControllerMock();

    public static TradeSituationBlController getController() {
        return controller;
    }
}
