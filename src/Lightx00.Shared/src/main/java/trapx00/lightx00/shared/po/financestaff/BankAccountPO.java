package trapx00.lightx00.shared.po.financestaff;

import java.util.Date;

public class BankAccountPo {
    String id;
    String name;
    double amount;
    Date createTime;

    public BankAccountPo(String id, String name, double amount, Date createTime) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.createTime = createTime;
    }
}
