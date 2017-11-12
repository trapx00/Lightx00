package trapx00.lightx00.client.bl.financebl.factory;

import trapx00.lightx00.client.bl.financebl.SaleDetailBlController;
import trapx00.lightx00.client.bl.financebl.mock.SaleDetailBlControllerMock;

public class SaleDetailBlFactory {
    private static SaleDetailBlController controller = new SaleDetailBlControllerMock();

    public static SaleDetailBlController getController() {
        return controller;
    }

}
