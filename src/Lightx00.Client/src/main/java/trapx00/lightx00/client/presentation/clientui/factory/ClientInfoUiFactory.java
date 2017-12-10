package trapx00.lightx00.client.presentation.clientui.factory;

import trapx00.lightx00.client.presentation.clientui.ClientInfoUi;
import trapx00.lightx00.client.presentation.clientui.ClientUiController;

public class ClientInfoUiFactory {
    private static ClientInfoUi clientInfoUi=new ClientUiController();

    public static ClientInfoUi getClientInfoUi() {
        return clientInfoUi;
    }
}
