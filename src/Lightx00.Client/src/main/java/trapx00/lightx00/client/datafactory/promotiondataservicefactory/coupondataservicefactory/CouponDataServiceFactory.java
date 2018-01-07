package trapx00.lightx00.client.datafactory.promotiondataservicefactory.coupondataservicefactory;

import trapx00.lightx00.client.datafactory.DataServiceFactory;
import trapx00.lightx00.shared.dataservice.promotiondataservice.coupondataservice.CouponDataService;
import trapx00.lightx00.shared.dataservicestub.promotiondataservice.coupondataservice.CouponDataServiceStub;

public class CouponDataServiceFactory extends DataServiceFactory {
    private static CouponDataService service;

    private static void initRmi() {
        service = lookupService(CouponDataService.class);
    }

    public static CouponDataService getService() {
        initRmi();
        return service;
    }
}
