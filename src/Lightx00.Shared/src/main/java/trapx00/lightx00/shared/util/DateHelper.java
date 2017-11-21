package trapx00.lightx00.shared.util;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateHelper {
    private static final String DATE_PATTERN = "yyyy/MM/dd HH:mm:ss";
    private static final DateTimeFormatter dateFormatter =
            DateTimeFormatter.ofPattern(DATE_PATTERN).withZone(ZoneId.systemDefault());

    /**
     * Get formalized date string according to the millisecond.
     * @param millisecond timestamp in millisecond
     * @return formalized date string
     */
    public static String fromTimestamp(long millisecond) {
        return dateFormatter.format(Instant.ofEpochMilli(millisecond));
    }

    /**
     * Formalize data according to the date.
     * @param date date
     * @return formalized date string
     */
    public static String fromDate(Date date) {
        return dateFormatter.format(date.toInstant());
    }

    /**
     * Get formalized current date string.
     * @return formalized current date string
     */
    public static String getCurrentTime() {
        return fromTimestamp(System.currentTimeMillis());
    }
}
