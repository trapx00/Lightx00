package trapx00.lightx00.shared.po.financestaff;

public class  Transcation {
    private String accountId;
    private double total;
    private String comment;

    public Transcation(String accountId, double total, String comment) {
        this.accountId = accountId;
        this.total = total;
        this.comment = comment;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
