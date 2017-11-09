package trapx00.lightx00.client.bl.clientbl;

public class ClientModificationServiceFactory {
    ClientModificationService clientModificationService=new ClientBlController();

    public ClientModificationService getInstance() {
        return clientModificationService;
    }
}
