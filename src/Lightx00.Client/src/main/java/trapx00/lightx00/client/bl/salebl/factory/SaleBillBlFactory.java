package trapx00.lightx00.client.bl.salebl.factory;

import trapx00.lightx00.client.bl.salebl.SaleBillBlController;
import trapx00.lightx00.client.bl.salebl.mock.SaleBillBlControllerMock;

public class SaleBillBlFactory {
    private static SaleBillBlController saleBillBlController = new SaleBillBlControllerMock();

    public static SaleBillBlController getSaleBillBlController() {
        return saleBillBlController;
    }
}
