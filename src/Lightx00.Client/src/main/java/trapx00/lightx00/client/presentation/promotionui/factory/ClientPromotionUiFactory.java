package trapx00.lightx00.client.presentation.promotionui.factory;

import trapx00.lightx00.client.presentation.promotionui.ClientPromotionUiControllerDraftController;
import trapx00.lightx00.client.presentation.promotionui.mock.ClientPromotionUiControllerMockDraftController;

public class ClientPromotionUiFactory {
    private static ClientPromotionUiControllerDraftController controller = new ClientPromotionUiControllerMockDraftController();

    public static ClientPromotionUiControllerDraftController getController() {
        return controller;
    }
}
