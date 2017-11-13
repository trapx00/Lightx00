package trapx00.lightx00.client.presentation.clientui.factory;

import trapx00.lightx00.client.presentation.clientui.ClientInfoUi;
import trapx00.lightx00.client.presentation.clientui.mock.ClientUiControllerMock;

public class ClientInfoUiFactory {
    private static ClientInfoUi clientInfoUi=new ClientUiControllerMock();

    public static ClientInfoUi getClientInfoUi() {
        return clientInfoUi;
    }
}
