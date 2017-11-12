package trapx00.lightx00.client.bl.clientbl.factory;

import trapx00.lightx00.client.bl.clientbl.ClientBlController;
import trapx00.lightx00.client.bl.clientbl.mock.ClientBlControllerMock;

public class ClientBlFactory {

    private static ClientBlController clientBlController=new ClientBlControllerMock();

    public static ClientBlController getClientBlController() {
        return clientBlController;
    }
}
