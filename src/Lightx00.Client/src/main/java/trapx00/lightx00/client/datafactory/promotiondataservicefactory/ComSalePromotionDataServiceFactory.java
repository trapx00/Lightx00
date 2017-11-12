package trapx00.lightx00.client.datafactory.promotiondataservicefactory;

import trapx00.lightx00.shared.dataservice.promotiondataservice.ComSalePromotionDataService;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ComSalePromotionDataServiceFactory {

    private ComSalePromotionDataService comSalePromotionDataService;

    public ComSalePromotionDataServiceFactory() {
        try {
            comSalePromotionDataService = (ComSalePromotionDataService) Naming.lookup(RmiHelper.generateRmiUrl(ComSalePromotionDataService.class));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public ComSalePromotionDataService getInstance() {
        return comSalePromotionDataService;
    }

}
