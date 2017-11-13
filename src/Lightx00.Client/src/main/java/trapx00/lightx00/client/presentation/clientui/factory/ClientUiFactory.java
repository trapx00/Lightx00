package trapx00.lightx00.client.presentation.clientui.factory;

import trapx00.lightx00.client.presentation.clientui.ClientUiController;
import trapx00.lightx00.client.presentation.clientui.mock.ClientUiControllerMock;

public class ClientUiFactory {
    private static ClientUiController clientUiController=new ClientUiControllerMock();

    public static ClientUiController getClientUiController() {
        return clientUiController;
    }
}
