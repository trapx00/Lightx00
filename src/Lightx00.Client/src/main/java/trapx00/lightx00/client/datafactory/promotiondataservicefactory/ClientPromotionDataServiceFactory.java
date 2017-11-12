package trapx00.lightx00.client.datafactory.promotiondataservicefactory;

import trapx00.lightx00.shared.dataservice.promotiondataservice.ClientPromotionDataService;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientPromotionDataServiceFactory {

    private ClientPromotionDataService clientPromotionDataService;

    public ClientPromotionDataServiceFactory() {
        try {
            clientPromotionDataService = (ClientPromotionDataService) Naming.lookup(RmiHelper.generateRmiUrl(ClientPromotionDataService.class));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public ClientPromotionDataService getInstance() {
        return clientPromotionDataService;
    }

}
