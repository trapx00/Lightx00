package trapx00.lightx00.shared.po.financestaff;

public class  CashBillPO extends FinancialBillPO {
    String ID;//格式是XJFYD-yyyyMMDD-00001
    String operatorID;
    String accountID;
    CashBillItem[] items;
}
