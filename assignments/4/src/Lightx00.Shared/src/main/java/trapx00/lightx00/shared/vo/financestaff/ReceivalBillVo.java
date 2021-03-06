package trapx00.lightx00.shared.vo.financestaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.FinanceBillType;
import trapx00.lightx00.shared.po.financestaff.Transcation;
import trapx00.lightx00.shared.vo.salestaff.ClientVo;

import java.util.Date;

public class ReceivalBillVo extends ReceivalPaymentBillVoBase {
    public ReceivalBillVo(String id, Date date, BillState state, ClientVo client,
                          FinanceStaffVo operator, Transcation[] transcations, double total) {
        super(FinanceBillType.ReceivalBill, id, date, state, client, operator, transcations, total);
    }
}
