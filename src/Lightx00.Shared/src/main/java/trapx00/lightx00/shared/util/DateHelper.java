package trapx00.lightx00.shared.util;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateHelper {
    private static final String DATE_PATTERN = "yyyy/MM/dd HH:mm:ss";
    private static final DateTimeFormatter dateFormatter =
            DateTimeFormatter.ofPattern(DATE_PATTERN).withZone(ZoneId.systemDefault());

    public static String fromTimestamp(long millisecond) {
        return dateFormatter.format(Instant.ofEpochMilli(millisecond));
    }


    public static String fromDate(Date date){
        return dateFormatter.format(date.toInstant());
    }
}
