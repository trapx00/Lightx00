package trapx00.lightx00.shared.vo.financestaff;

import trapx00.lightx00.shared.po.financestaff.CashBillItem;

public class CashBillVO {
    String ID;//格式是XJFYD-yyyyMMDD-00001
    FinanceStaffVO operator;
    BankAccountVO account;
    CashBillItem[] items;
}
