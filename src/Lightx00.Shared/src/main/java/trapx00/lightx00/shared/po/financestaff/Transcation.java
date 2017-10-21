package trapx00.lightx00.shared.po.financestaff;

public class  Transcation {
    String accountId;
    double total;
    String comment;

    public Transcation(String accountId, double total, String comment) {
        this.accountId = accountId;
        this.total = total;
        this.comment = comment;
    }
}
