package trapx00.lightx00.shared.vo.financestaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.FinanceBillType;
import trapx00.lightx00.shared.po.financestaff.Transcation;
import trapx00.lightx00.shared.vo.salestaff.ClientVo;

import java.util.Date;

public class PaymentBillVo extends ReceivalPaymentBillVoBase {
    public PaymentBillVo(String id, Date date, BillState state, String clientId, String operatorId, Transcation[] transcations, double total) {
        super(FinanceBillType.PaymentBill, id, date, state, clientId, operatorId, transcations, total);
    }
}
