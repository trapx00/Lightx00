package trapx00.lightx00.client.presentation.financeui;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import trapx00.lightx00.client.vo.financestaff.CashBillVo;
import trapx00.lightx00.shared.po.financestaff.CashBillItem;

public class CashBillItemModel extends RecursiveTreeObject<CashBillItemModel> {
    private ObjectProperty<CashBillItem> cashBillItemObjectProperty;

    public CashBillItemModel(CashBillItem cashBillItem) {
        this.cashBillItemObjectProperty = new SimpleObjectProperty<>(cashBillItem);
    }

    public CashBillItem getCashBillItemObjectProperty() {
        return cashBillItemObjectProperty.get();
    }

    public ObjectProperty<CashBillItem> cashBillItemObjectPropertyProperty() {
        return cashBillItemObjectProperty;
    }

    public void setCashBillItemObjectProperty(CashBillItem cashBillItemObjectProperty) {
        this.cashBillItemObjectProperty.set(cashBillItemObjectProperty);
    }
}
