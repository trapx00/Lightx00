package trapx00.lightx00.client.bl.promotionbl.factory;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.promotionbl.ClientPromotionBlController;
import trapx00.lightx00.client.bl.promotionbl.mock.ClientPromotionBlControllerMock;

public class ClientPromotionBlFactory {
    private static ClientPromotionBlController controller = new ClientPromotionBlControllerMock();
    private static DraftDeleteService draftDeleteService = controller;

    public static ClientPromotionBlController getController() {
        return controller;
    }

    public static DraftDeleteService getDraftDeleteService() {
        return draftDeleteService;
    }

}
