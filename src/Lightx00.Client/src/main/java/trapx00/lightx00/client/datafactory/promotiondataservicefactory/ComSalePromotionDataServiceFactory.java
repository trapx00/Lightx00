package trapx00.lightx00.client.datafactory.promotiondataservicefactory;

import trapx00.lightx00.shared.dataservice.promotiondataservice.ComSalePromotionDataService;
import trapx00.lightx00.shared.dataservicestub.promotiondataservice.ComSalePromotionDataServiceStub;

public class ComSalePromotionDataServiceFactory {

    private static  ComSalePromotionDataService service = new ComSalePromotionDataServiceStub();

    /*public static void initRmi() {
        service = lookupService(ClientPromotionDataService.class);
    }*/

    public static  ComSalePromotionDataService getService() {
        //initRmi();
        return service;
    }
}
