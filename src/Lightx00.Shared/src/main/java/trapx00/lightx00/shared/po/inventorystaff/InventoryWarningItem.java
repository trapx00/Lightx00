package trapx00.lightx00.shared.po.inventorystaff;

import java.io.Serializable;

public class InventoryWarningItem implements Serializable {
    private String name;
    private double amount;
    private double det;

    public InventoryWarningItem(String name, double amount, double det) {
        this.name = name;
        this.amount = amount;
        this.det = det;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getDet() {
        return det;
    }

    public void setDet(double det) {
        this.det = det;
    }

    @Override
    public String toString() {
        return "CashBillItem{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", det='" + det + '\'' +
                '}';
    }
}
