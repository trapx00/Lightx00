package trapx00.lightx00.client.presentation.draftui;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.*;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.util.DateHelper;
import trapx00.lightx00.shared.vo.BillVo;

import java.util.Date;

public class DraftModel extends RecursiveTreeObject<DraftModel> {
    private ObjectProperty<Date> date;
    private ObjectProperty<BillType> type;
    private StringProperty id;

    public DraftModel(BillVo bill){
        this(bill.getDate(), bill.getBill(), bill.getId());
    }

    public DraftModel(Date date, BillType type, String id) {
        this.date = new SimpleObjectProperty<>(date);
        this.type = new SimpleObjectProperty<>(type);
        this.id = new SimpleStringProperty(id);
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

    public BillType getType() {
        return type.get();
    }

    public ObjectProperty<BillType> typeProperty() {
        return type;
    }

    public void setType(BillType type) {
        this.type.set(type);
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
}
