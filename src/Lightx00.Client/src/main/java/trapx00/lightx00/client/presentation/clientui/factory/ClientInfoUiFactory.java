package trapx00.lightx00.client.presentation.clientui.factory;

import trapx00.lightx00.client.presentation.clientui.ClientInfoUi;
import trapx00.lightx00.client.presentation.clientui.mock.ClientUiControllerControllerMockDraftController;

public class ClientInfoUiFactory {
    private static ClientInfoUi clientInfoUi=new ClientUiControllerControllerMockDraftController();

    public static ClientInfoUi getClientInfoUi() {
        return clientInfoUi;
    }
}
