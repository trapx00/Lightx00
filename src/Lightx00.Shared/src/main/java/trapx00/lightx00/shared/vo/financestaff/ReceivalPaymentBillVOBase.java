package trapx00.lightx00.shared.vo.financestaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.po.financestaff.CashBillItem;
import trapx00.lightx00.shared.po.financestaff.FinanceBillType;
import trapx00.lightx00.shared.po.financestaff.Transcation;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.EmployeeVo;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.shared.vo.salestaff.ClientVo;
import trapx00.lightx00.shared.vo.salestaff.SaleStaffVo;

import java.util.Date;

public class ReceivalPaymentBillVoBase extends FinanceBillVo {
    ClientVo client;
    FinanceStaffVo operator;
    Transcation[] transcations;
    double total;

    public ReceivalPaymentBillVoBase(FinanceBillType financeBillType, String id, Date date, BillState state, ClientVo client, FinanceStaffVo operator, Transcation[] transcations, double total) {
        super(financeBillType, id, date, state);
        this.client = client;
        this.operator = operator;
        this.transcations = transcations;
        this.total = total;
    }
}

