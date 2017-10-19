package trapx00.lightx00.shared.vo.financestaff;

import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.po.financestaff.CashBillItem;
import trapx00.lightx00.shared.po.financestaff.Transcation;
import trapx00.lightx00.shared.vo.BillVO;
import trapx00.lightx00.shared.vo.EmployeeVO;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVO;
import trapx00.lightx00.shared.vo.salestaff.ClientVO;
import trapx00.lightx00.shared.vo.salestaff.SaleStaffVO;

import java.util.Date;

public class ReceivalPaymentBillVOBase {
    String ID; //收款单格式是SKD-yyyyMMDD-00001，付款单格式是FKD-yyyyMMDD-00001
    ClientVO client;
    FinanceStaffVO operator;
    Transcation[] transcations;
    double total;
}

