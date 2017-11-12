package trapx00.lightx00.client.bl.salebl.factory;

import trapx00.lightx00.client.bl.salebl.SaleBillBlInfo;
import trapx00.lightx00.client.bl.salebl.SaleBillBlInfoController;
import trapx00.lightx00.client.bl.salebl.mock.SaleBillBlInfoControllerMock;

public class SaleBillBlInfoFactory {
    private static SaleBillBlInfo saleBillBlInfo = new SaleBillBlInfoControllerMock();

    public static SaleBillBlInfo getSaleBillBlInfo() {
        return saleBillBlInfo;
    }
}
