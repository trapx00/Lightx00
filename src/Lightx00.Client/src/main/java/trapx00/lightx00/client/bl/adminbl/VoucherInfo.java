package trapx00.lightx00.client.bl.adminbl;
import java.util.Date;

public interface VoucherInfo {
    /**
     * Gets unused voucher value.
     */
    double queryUnusedVoucherValue(Date start, Date end);
}
