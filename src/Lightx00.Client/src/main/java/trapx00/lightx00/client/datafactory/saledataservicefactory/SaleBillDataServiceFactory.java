package trapx00.lightx00.client.datafactory.saledataservicefactory;

import trapx00.lightx00.shared.dataservice.saledataservice.SaleBillDataService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class SaleBillDataServiceFactory {

    private SaleBillDataService saleBillDataService;

    public SaleBillDataServiceFactory(){
        try {
            saleBillDataService =(SaleBillDataService) Naming.lookup("rmi://localhost:8888/SaleBillDataService");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public SaleBillDataService getInstance() {
        return saleBillDataService;
    }
}
