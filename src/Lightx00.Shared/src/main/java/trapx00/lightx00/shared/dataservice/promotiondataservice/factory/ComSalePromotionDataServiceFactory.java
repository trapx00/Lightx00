package trapx00.lightx00.shared.dataservice.promotiondataservice.factory;

import trapx00.lightx00.shared.dataservice.promotiondataservice.ComSalePromotionDataService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ComSalePromotionDataServiceFactory {

    private ComSalePromotionDataService comSalePromotionDataService;

    public ComSalePromotionDataServiceFactory() {
        try {
            comSalePromotionDataService = (ComSalePromotionDataService) Naming.lookup("rmi://localhost:8888/ComSalePromotionDataService");
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
