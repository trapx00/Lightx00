package trapx00.lightx00.client.presentation.clientui.factory;

import trapx00.lightx00.client.presentation.clientui.ClientUiControllerControllerDraftController;
import trapx00.lightx00.client.presentation.clientui.mock.ClientUiControllerControllerMockDraftController;

public class ClientUiFactory {
    private static ClientUiControllerControllerDraftController clientUiController=new ClientUiControllerControllerMockDraftController();

    public static ClientUiControllerControllerDraftController getClientUiController() {
        return clientUiController;
    }
}
