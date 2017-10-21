package trapx00.lightx00.shared.vo.log;

import trapx00.lightx00.shared.po.log.LogSeverity;

import java.util.Date;

public class LogVo {
    Date date;
    LogSeverity severity;
    String content;

    public LogVo(Date date, LogSeverity severity, String content) {
        this.date = date;
        this.severity = severity;
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LogSeverity getSeverity() {
        return severity;
    }

    public void setSeverity(LogSeverity severity) {
        this.severity = severity;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

