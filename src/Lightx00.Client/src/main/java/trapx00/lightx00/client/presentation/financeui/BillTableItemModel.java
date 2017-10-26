package trapx00.lightx00.client.presentation.financeui;

import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;

import java.util.Date;

public class BillTableItemModel extends RecursiveTreeObject<BillTableItemModel> {
    private ObjectProperty<Date> date;
    private StringProperty id;
    private StringProperty operator;
    private ObjectProperty<BillType> type;
    private ObjectProperty<BillState> state;

    public BillTableItemModel(Date date, String id, String operator, BillType type, BillState state) {
        this.date = new SimpleObjectProperty<>(date);
        this.id = new SimpleStringProperty(id);
        this.operator = new SimpleStringProperty(operator);
        this.type = new SimpleObjectProperty<>(type);
        this.state = new SimpleObjectProperty<>(state);
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

    public String getId() {
        return id.get();
    }

    public StringProperty idProperty() {
        return id;
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public String getOperator() {
        return operator.get();
    }

    public StringProperty operatorProperty() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator.set(operator);
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

    public BillState getState() {
        return state.get();
    }

    public ObjectProperty<BillState> stateProperty() {
        return state;
    }

    public void setState(BillState state) {
        this.state.set(state);
    }
}
