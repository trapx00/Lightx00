package trapx00.lightx00.client.bl.clientbl.factory;

import trapx00.lightx00.client.bl.clientbl.ClientBlController;
import trapx00.lightx00.client.bl.clientbl.ClientModificationService;

public class ClientModificationServiceFactory {
    ClientModificationService clientModificationService=new ClientBlController();

    public ClientModificationService getInstance() {
        return clientModificationService;
    }
}
