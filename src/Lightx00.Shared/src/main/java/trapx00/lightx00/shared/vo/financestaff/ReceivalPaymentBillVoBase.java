package trapx00.lightx00.shared.vo.financestaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.FinanceBillType;
import trapx00.lightx00.shared.po.financestaff.Transcation;
import trapx00.lightx00.shared.vo.salestaff.ClientVo;

import java.util.Date;

public class ReceivalPaymentBillVoBase extends FinanceBillVo {
    private String clientId;
    private String operatorId;
    private Transcation[] transcations;
    private double total;

    public ReceivalPaymentBillVoBase(FinanceBillType financeBillType,
                                     String id, Date date, BillState state, String clientId, String operatorId, Transcation[] transcations, double total) {
        super(financeBillType, id, date, state);
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


