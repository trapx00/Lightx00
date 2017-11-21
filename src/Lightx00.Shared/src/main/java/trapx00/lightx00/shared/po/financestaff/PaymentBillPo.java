package trapx00.lightx00.shared.po.financestaff;

import java.util.Date;

import com.j256.ormlite.table.DatabaseTable;
import trapx00.lightx00.shared.po.bill.BillState;

@DatabaseTable(tableName = "PaymentBill")
public class  PaymentBillPo extends ReceivalPaymentBillPoBase {
    public PaymentBillPo(String id, Date date, BillState state, String clientId, String operatorId,
                         Transcation[] transcations, double total) {
        super(id, date, state, FinanceBillType.PaymentBill, clientId, operatorId, transcations, total);
    }

    public PaymentBillPo() {
    }
}
