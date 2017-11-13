package trapx00.lightx00.server.data.promotiondata.factory;

import trapx00.lightx00.server.data.promotiondata.mock.ComSalePromotionDataControllerMock;
import trapx00.lightx00.shared.dataservice.promotiondataservice.ComSalePromotionDataService;

import java.rmi.RemoteException;

public class ComSalePromotionDataControllerFactory {
    private static ComSalePromotionDataService controller;

    static {
        try{
            controller = new ComSalePromotionDataControllerMock();
        }catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static ComSalePromotionDataService getController() {
        return controller;
    }
}
