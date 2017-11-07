package trapx00.lightx00.client.presentation.notificationui;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.*;
import trapx00.lightx00.shared.po.notification.NotificationType;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.notification.NotificationVo;

import java.util.Date;

public class NotificationModel extends RecursiveTreeObject<NotificationModel> {
    private ObjectProperty<Date> date;
    private ObjectProperty<NotificationType> type;
    private StringProperty id;
    private ObjectProperty<EmployeeVo> receiver;
    private StringProperty readType;

    public NotificationModel(NotificationVo notificationVo){
        this(notificationVo.getDate(), notificationVo.getType(),notificationVo.getId(),notificationVo.getReceiver(),"未读");
    }

    public NotificationModel(Date date, NotificationType type, String id, EmployeeVo reveiver,String readType) {
        this.date = new SimpleObjectProperty<>(date);
        this.type = new SimpleObjectProperty<>(type);
        this.id = new SimpleStringProperty(id);
        this.receiver=new SimpleObjectProperty<>(reveiver);
        this.readType=new SimpleStringProperty(readType);
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

    public NotificationType getType() {
        return type.get();
    }

    public ObjectProperty<NotificationType> typeProperty() {
        return type;
    }

    public void setType(NotificationType type) {
        this.type.set(type);
    }

    public EmployeeVo getReceiver() {
        return receiver.get();
    }

    public ObjectProperty<EmployeeVo> receiverProperty() {
        return receiver;
    }

    public void setReceiver(EmployeeVo receiver) {
        this.receiver.set(receiver);
    }

    public String getId() {
        return id.get();
    }

    public StringProperty idProperty() {
        return id;
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public String getReadType() {
        return readType.get();
    }

    public StringProperty readTypeProperty() {
        return readType;
    }

    public void setReadType(String readType) {
        this.readType.set(readType);
    }
}
