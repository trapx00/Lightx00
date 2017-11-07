package trapx00.lightx00.client.presentation.logui;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import trapx00.lightx00.shared.po.log.LogSeverity;
import trapx00.lightx00.client.vo.log.LogVo;

import java.util.Date;

public class LogTableItemModel extends RecursiveTreeObject<LogTableItemModel> {
    private ObjectProperty<Date> date;
    private ObjectProperty<LogSeverity> severity;
    private StringProperty content;

    public LogTableItemModel(ObjectProperty<Date> date, ObjectProperty<LogSeverity> severity, StringProperty content) {
        this.date = date;
        this.severity = severity;
        this.content = content;
    }

    public LogTableItemModel(LogVo logVo) {
        this.date = new SimpleObjectProperty<>(logVo.getDate());
        this.severity = new SimpleObjectProperty<>(logVo.getSeverity());
        this.content = new SimpleStringProperty(logVo.getContent());
    }

    public Date getDate() {
        return date.get();
    }

    public ObjectProperty<Date> dateProperty() {
        return date;
    }

    public void setDate(Date date) {
        this.date.set(date);
    }

    public LogSeverity getSeverity() {
        return severity.get();
    }

    public ObjectProperty<LogSeverity> severityProperty() {
        return severity;
    }

    public void setSeverity(LogSeverity severity) {
        this.severity.set(severity);
    }

    public String getContent() {
        return content.get();
    }

    public StringProperty contentProperty() {
        return content;
    }

    public void setContent(String content) {
        this.content.set(content);
    }
}
