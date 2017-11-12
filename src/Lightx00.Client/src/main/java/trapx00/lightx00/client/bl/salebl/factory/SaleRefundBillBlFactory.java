package trapx00.lightx00.client.bl.salebl.factory;

import trapx00.lightx00.client.bl.salebl.SaleRefundBillBlController;
import trapx00.lightx00.client.bl.salebl.mock.SaleRefundBillBlControllerMock;

public class SaleRefundBillBlFactory {
    private static SaleRefundBillBlController saleRefundBillBlController=new SaleRefundBillBlControllerMock();

    public static SaleRefundBillBlController getSaleRefundBillBlController() {
        return saleRefundBillBlController;
    }
}
