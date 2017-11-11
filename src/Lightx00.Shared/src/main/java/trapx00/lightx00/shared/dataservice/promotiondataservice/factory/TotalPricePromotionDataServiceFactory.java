package trapx00.lightx00.shared.dataservice.promotiondataservice.factory;

import trapx00.lightx00.shared.dataservice.promotiondataservice.TotalPricePromotionDataService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class TotalPricePromotionDataServiceFactory {

    private TotalPricePromotionDataService totalPricePromotionDataService;

    public TotalPricePromotionDataServiceFactory() {
        try {
            totalPricePromotionDataService = (TotalPricePromotionDataService) Naming.lookup("rmi://localhost:8888/TotalPricePromotionDataService");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public TotalPricePromotionDataService getInstance() {
        return totalPricePromotionDataService;
    }

}
