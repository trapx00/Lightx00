package trapx00.lightx00.client.datafactory.coupondataservicefactory;

import trapx00.lightx00.client.datafactory.DataServiceFactory;
import trapx00.lightx00.shared.dataservice.coupondataservice.CouponDataService;
import trapx00.lightx00.shared.dataservicestub.coupondataservice.CouponDataServiceStub;

public class CouponDataServieFactory extends DataServiceFactory {
    private static CouponDataService service = new CouponDataServiceStub();

    public static void initRmi() {
        service = lookupService(CouponDataService.class);
    }

    public static CouponDataService getService() {
        //initRmi();
        return service;
    }
}
