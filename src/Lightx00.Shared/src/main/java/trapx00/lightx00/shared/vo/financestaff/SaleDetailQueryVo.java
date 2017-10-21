package trapx00.lightx00.shared.vo.financestaff;

import java.util.Date;
import trapx00.lightx00.shared.vo.salestaff.ClientVo;
import trapx00.lightx00.shared.vo.salestaff.SaleStaffVo;



public class SaleDetailQueryVo { //销售明细表查询条件
    Date start;
    Date end;
    String commodityName;
    ClientVo client;
    SaleStaffVo operator;
    int inventory;

    public SaleDetailQueryVo(Date start, Date end, String commodityName, ClientVo client,
                             SaleStaffVo operator, int inventory) {
        this.start = start;
        this.end = end;
        this.commodityName = commodityName;
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

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public ClientVo getClient() {
        return client;
    }

    public void setClient(ClientVo client) {
        this.client = client;
    }

    public SaleStaffVo getOperator() {
        return operator;
    }

    public void setOperator(SaleStaffVo operator) {
        this.operator = operator;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}
