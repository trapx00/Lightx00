package trapx00.lightx00.client.datafactory.clientdataservicefactory;

import trapx00.lightx00.shared.dataservice.clientdataservice.ClientDataService;
import trapx00.lightx00.shared.dataservice.saledataservice.SaleBillDataService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientDataServiceFactory {

    private ClientDataService clientDataService;

    public ClientDataServiceFactory(){
        try {
            clientDataService =(ClientDataService) Naming.lookup("rmi://localhost:8888/ClientDataService");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public ClientDataService getInstance() {
        return clientDataService;
    }
}
