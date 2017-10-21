package trapx00.lightx00.shared.vo.financestaff;

import java.util.Date;

public class BankAccountVo {
    String id;
    String name;
    double amount;
    Date createTime;

    public BankAccountVo(String id, String name, double amount, Date createTime) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.createTime = createTime;
    }
}
