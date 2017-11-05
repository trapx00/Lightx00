package trapx00.lightx00.client.blservice.clientblservice;

import trapx00.lightx00.client.bl.clientbl.ClientBlController;

public class ClientBlServiceFactory {
    ClientBlService clientBlService=new ClientBlController();

    public ClientBlService getInstance(){
        return clientBlService;
    }
}
