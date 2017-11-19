package trapx00.lightx00.server.data.promotiondata.factory;

import trapx00.lightx00.server.data.promotiondata.mock.ClientPromotionDataControllerMock;
import trapx00.lightx00.shared.dataservice.promotiondataservice.ClientPromotionDataService;

import java.rmi.RemoteException;

public class ClientPromotionDataFactory {
    private static ClientPromotionDataService service;

    static {
        try {
            service = new ClientPromotionDataControllerMock();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static ClientPromotionDataService getService() {
        return service;
    }
}
