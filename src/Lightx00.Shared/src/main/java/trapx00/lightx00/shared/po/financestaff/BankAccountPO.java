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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
