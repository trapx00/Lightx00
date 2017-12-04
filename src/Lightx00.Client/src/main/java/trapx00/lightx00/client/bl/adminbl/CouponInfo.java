package trapx00.lightx00.client.bl.adminbl;
import java.util.Date;

public interface CouponInfo {
    /**
     * Gets unused voucher value.
     */
    double queryUnusedCouponValue(Date start, Date end);
}
