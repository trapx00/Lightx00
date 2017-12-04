package trapx00.lightx00.client.bl.couponbl;

import trapx00.lightx00.shared.po.ResultMessage;

public interface UseCouponInfo {
    /**
     * Use coupon.
     * @param couponPrice price of the coupon
     * @return whether the operation is done successfully
     */
    ResultMessage useCoupon (double couponPrice);
}
