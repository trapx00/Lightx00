package trapx00.lightx00.shared.vo.financestaff;

import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.vo.EmployeeVo;
import trapx00.lightx00.shared.vo.salestaff.ClientVo;

import java.util.Date;

public class TradeHistoryQueryVo { //经营历程表查询条件
    Date start;
    Date end;
    BillType billType;
    ClientVo client;
    EmployeeVo operator;
    int inventory;

    public TradeHistoryQueryVo(Date start, Date end, BillType billType, ClientVo client, EmployeeVo operator, int inventory) {
        this.start = start;
        this.end = end;
        this.billType = billType;
        this.client = client;
        this.operator = operator;
        this.inventory = inventory;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public BillType getBillType() {
        return billType;
    }

    public void setBillType(BillType billType) {
        this.billType = billType;
    }

    public ClientVo getClient() {
        return client;
    }

    public void setClient(ClientVo client) {
        this.client = client;
    }

    public EmployeeVo getOperator() {
        return operator;
    }

    public void setOperator(EmployeeVo operator) {
        this.operator = operator;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}
