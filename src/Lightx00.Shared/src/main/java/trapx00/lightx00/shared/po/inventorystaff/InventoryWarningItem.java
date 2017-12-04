package trapx00.lightx00.shared.po.inventorystaff;

import java.io.Serializable;

public class InventoryWarningItem implements Serializable {
    private String name;
    private double delta;
    private double unitPrice;

    public InventoryWarningItem(String name, double delta, double unitPrice) {
        this.name = name;
        this.delta = delta;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
