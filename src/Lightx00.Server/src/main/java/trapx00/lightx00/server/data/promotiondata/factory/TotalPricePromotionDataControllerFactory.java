package trapx00.lightx00.server.data.promotiondata.factory;

import trapx00.lightx00.server.data.promotiondata.mock.TotalPricePromotionDataControllerMock;
import trapx00.lightx00.shared.dataservice.promotiondataservice.TotalPricePromotionDataService;

import java.rmi.RemoteException;

public class TotalPricePromotionDataControllerFactory {
    private static TotalPricePromotionDataService controller;

    static {
        try{
            controller = new TotalPricePromotionDataControllerMock();
        }catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static TotalPricePromotionDataService getController() {
        return controller;
    }
}
