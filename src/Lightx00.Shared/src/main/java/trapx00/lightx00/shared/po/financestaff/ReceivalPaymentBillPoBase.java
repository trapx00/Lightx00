package trapx00.lightx00.shared.po.financestaff;

import java.util.Date;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import trapx00.lightx00.shared.po.bill.BillState;


public class  ReceivalPaymentBillPoBase extends FinanceBillPo {
    //收款单格式是SKD-yyyyMMDD-00001，付款单格式是FKD-yyyyMMDD-00001
    @DatabaseField
    protected String clientId;
    @DatabaseField
    protected String operatorId;
    @DatabaseField(dataType = DataType.SERIALIZABLE)
    protected Transcation[] transcations;
    @DatabaseField
    protected double total;

    public ReceivalPaymentBillPoBase(String id, Date date, BillState state,
                                     FinanceBillType financeBillType, String clientId,
                                     String operatorId, Transcation[] transcations, double total) {
        super(id, date, state, financeBillType);
        this.clientId = clientId;
        this.operatorId = operatorId;
        this.transcations = transcations;
        this.total = total;
    }

    public ReceivalPaymentBillPoBase() {
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
