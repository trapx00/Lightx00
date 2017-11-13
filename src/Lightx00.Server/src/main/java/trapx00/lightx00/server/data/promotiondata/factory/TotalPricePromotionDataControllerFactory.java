package trapx00.lightx00.server.data.promotiondata.factory;

import trapx00.lightx00.server.data.promotiondata.mock.TotalPricePromotionDataControllerMock;
import trapx00.lightx00.shared.dataservice.promotiondataservice.TotalPricePromotionDataService;

import java.rmi.RemoteException;

public class TotalPricePromotionDataControllerFactory {
    private static TotalPricePromotionDataService service;

    static {
        try{
            service = new TotalPricePromotionDataControllerMock();
        }catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static TotalPricePromotionDataService getService() {
        return service;
    }
}
