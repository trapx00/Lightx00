package trapx00.lightx00.shared.po.financestaff;

import trapx00.lightx00.shared.po.bill.BillState;

import java.util.Date;

public class  PaymentBillPo extends ReceivalPaymentBillPoBase {
    public PaymentBillPo(String id, Date date, BillState state, FinanceBillType financeBillType, String clientId, String operatorId, Transcation[] transcations, double total) {
        super(id, date, state, financeBillType, clientId, operatorId, transcations, total);
    }
}
