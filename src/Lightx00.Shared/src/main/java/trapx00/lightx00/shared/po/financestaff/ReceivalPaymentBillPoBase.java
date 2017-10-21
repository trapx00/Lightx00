package trapx00.lightx00.shared.po.financestaff;

import java.util.Date;
import trapx00.lightx00.shared.po.bill.BillState;


public class  ReceivalPaymentBillPoBase extends FinanceBillPo {
    //收款单格式是SKD-yyyyMMDD-00001，付款单格式是FKD-yyyyMMDD-00001
    String clientId;
    String operatorId;
    Transcation[] transcations;
    double total;

    public ReceivalPaymentBillPoBase(String id, Date date, BillState state,
                                     FinanceBillType financeBillType, String clientId,
                                     String operatorId, Transcation[] transcations, double total) {
        super(id, date, state, financeBillType);
        this.clientId = clientId;
        this.operatorId = operatorId;
        this.transcations = transcations;
        this.total = total;
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

    public Transcation[] getTranscations() {
        return transcations;
    }

    public void setTranscations(Transcation[] transcations) {
        this.transcations = transcations;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
