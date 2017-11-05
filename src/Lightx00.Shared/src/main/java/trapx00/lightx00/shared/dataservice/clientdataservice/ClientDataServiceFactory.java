package trapx00.lightx00.shared.dataservice.clientdataservice;

import trapx00.lightx00.shared.data.clientdata.ClientDataController;

public class ClientDataServiceFactory {

    ClientDataService clientDataService=new ClientDataController();

    public ClientDataService getInstance() {
        return clientDataService;
    }
}
