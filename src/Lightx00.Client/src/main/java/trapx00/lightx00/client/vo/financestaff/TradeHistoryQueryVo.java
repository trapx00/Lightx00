package trapx00.lightx00.client.vo.financestaff;

import trapx00.lightx00.shared.po.bill.BillType;

import java.util.Date;

public class TradeHistoryQueryVo { //经营历程表查询条件
    private Date start;
    private Date end;
    private BillType billType;
    private String clientId;
    private String operatorId;
    private int repository;

    public TradeHistoryQueryVo(Date start, Date end, BillType billType, String clientId, String operatorId, int repository) {
        this.start = start;
        this.end = end;
        this.billType = billType;
        this.clientId = clientId;
        this.operatorId = operatorId;
        this.repository = repository;
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

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public int getRepository() {
        return repository;
    }

    public void setRepository(int repository) {
        this.repository = repository;
    }
}
