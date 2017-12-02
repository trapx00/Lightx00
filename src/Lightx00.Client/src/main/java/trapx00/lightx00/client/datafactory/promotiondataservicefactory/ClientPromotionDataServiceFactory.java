package trapx00.lightx00.client.datafactory.promotiondataservicefactory;

import trapx00.lightx00.client.datafactory.DataServiceFactory;
import trapx00.lightx00.shared.dataservice.promotiondataservice.ClientPromotionDataService;
import trapx00.lightx00.shared.dataservicestub.promotiondataservice.ClientPromotionDataServiceStub;

public class ClientPromotionDataServiceFactory extends DataServiceFactory {

    private static ClientPromotionDataService service = new ClientPromotionDataServiceStub();

    public static void initRmi() {
        service = lookupService(ClientPromotionDataService.class);
    }

    public static ClientPromotionDataService getService() {
        //initRmi();
        return service;
    }
}
