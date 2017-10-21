package trapx00.lightx00.shared.po.log;

import java.util.Date;

public class LogPo {
    Date date;
    LogSeverity severity;
    String content;

    public LogPo(Date date, LogSeverity severity, String content) {
        this.date = date;
        this.severity = severity;
        this.content = content;
    }

}
