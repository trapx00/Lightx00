package trapx00.lightx00.server.data.coupondata.factory;

import trapx00.lightx00.server.data.coupondata.CouponDataController;
import trapx00.lightx00.shared.dataservice.coupondataservice.CouponDataService;

import java.rmi.RemoteException;

public class CouponDataFactory {
    private static CouponDataService service;

    static {
        try {
            service = new CouponDataController();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static CouponDataService getService() {
        return service;
    }
}
