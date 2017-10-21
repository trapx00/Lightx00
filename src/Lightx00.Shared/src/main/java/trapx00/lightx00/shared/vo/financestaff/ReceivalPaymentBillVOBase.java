package trapx00.lightx00.shared.vo.financestaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.FinanceBillType;
import trapx00.lightx00.shared.po.financestaff.Transcation;
import trapx00.lightx00.shared.vo.salestaff.ClientVo;

import java.util.Date;

public class ReceivalPaymentBillVoBase extends FinanceBillVo {
    ClientVo client;
    FinanceStaffVo operator;
    Transcation[] transcations;
    double total;

    public ReceivalPaymentBillVoBase(FinanceBillType financeBillType, String id, Date date,
                                     BillState state, ClientVo client, FinanceStaffVo operator,
                                     Transcation[] transcations, double total) {
        super(financeBillType, id, date, state);
        this.client = client;
        this.operator = operator;
        this.transcations = transcations;
        this.total = total;
    }

    public ClientVo getClient() {
        return client;
    }

    public void setClient(ClientVo client) {
        this.client = client;
    }

    public FinanceStaffVo getOperator() {
        return operator;
    }

    public void setOperator(FinanceStaffVo operator) {
        this.operator = operator;
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

