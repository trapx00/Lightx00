package trapx00.lightx00.server.data.clientdata.factory;

import trapx00.lightx00.server.data.clientdata.mock.ClientDataControllerMock;
import trapx00.lightx00.shared.dataservice.clientdataservice.ClientDataService;

public class ClientDataFactory {
    private static ClientDataService clientDataController = new ClientDataControllerMock();

    public static ClientDataService getClientDataController() {
        return clientDataController;
    }
}
