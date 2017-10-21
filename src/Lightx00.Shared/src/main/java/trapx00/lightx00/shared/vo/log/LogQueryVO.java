package trapx00.lightx00.shared.vo.log;

import trapx00.lightx00.shared.po.log.LogSeverity;

import java.util.Date;

public class LogQueryVo {
    Date date;
    LogSeverity severity;
    String content;

    public LogQueryVo(Date date, LogSeverity severity, String content) {
        this.date = date;
        this.severity = severity;
        this.content = content;
    }
}
