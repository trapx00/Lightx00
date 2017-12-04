package trapx00.lightx00.client.blservice.couponblservice;

import trapx00.lightx00.client.bl.couponbl.factory.CouponFactory;

public class CouponBlServiceFactory {
    public static CouponBlService getInstance() {
        return CouponFactory.getController();
    }
}
