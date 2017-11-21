package trapx00.lightx00.shared.po.log;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

@DatabaseTable(tableName = "log")
public class LogPo {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private Date date;
    @DatabaseField
    private LogSeverity severity;
    @DatabaseField
    private String content;

    public LogPo() {

    }

    public LogPo(Date date, LogSeverity severity, String content) {
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
