package trapx00.lightx00.shared.po.financestaff;

public class CashBillItem {
    private String name;
    private double amount;
    private String comment;

    public CashBillItem(String name, double amount, String comment) {
        this.name = name;
        this.amount = amount;
        this.comment = comment;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
