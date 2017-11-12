package trapx00.lightx00.client.datafactory.promotiondataservicefactory;

import trapx00.lightx00.shared.dataservice.promotiondataservice.TotalPricePromotionDataService;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class TotalPricePromotionDataServiceFactory {

    private TotalPricePromotionDataService totalPricePromotionDataService;

    public TotalPricePromotionDataServiceFactory() {
        try {
            totalPricePromotionDataService = (TotalPricePromotionDataService) Naming.lookup(RmiHelper.generateRmiUrl(TotalPricePromotionDataService.class));
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
