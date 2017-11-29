package trapx00.lightx00.client.presentation.draftui;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.client.vo.draft.DraftVo;
import trapx00.lightx00.shared.po.draft.DraftType;

import java.util.Date;

public class DraftTableItemModel extends RecursiveTreeObject<DraftTableItemModel> {
    private ObjectProperty<Date> date;
    private ObjectProperty<DraftType> type;
    private IntegerProperty id;
    private ObjectProperty<Draftable> draft;

    public DraftTableItemModel(DraftVo bill) {
        this(bill.getSaveTime(), bill.getDraftType(), bill.getId(), bill.getDraft());
    }

    public DraftTableItemModel(Date date, DraftType type, int id, Draftable draftable) {
        this.date = new SimpleObjectProperty<>(date);
        this.type = new SimpleObjectProperty<>(type);
        this.id = new SimpleIntegerProperty(id);
        this.draft = new SimpleObjectProperty<>(draftable);
    }

    public Draftable getDraft() {
        return draft.get();
    }

    public ObjectProperty<Draftable> draftProperty() {
        return draft;
    }

    public void setDraft(Draftable draft) {
        this.draft.set(draft);
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

    public DraftType getType() {
        return type.get();
    }

    public ObjectProperty<DraftType> typeProperty() {
        return type;
    }

    public void setType(DraftType type) {
        this.type.set(type);
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }
}
