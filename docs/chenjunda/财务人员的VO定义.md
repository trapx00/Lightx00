```java

class FinancialStaffVO extends EmployeeVO {

}


class ReceivalPaymentBillVOBase {
    String ID; //收款单格式是SKD-yyyyMMDD-00001，付款单格式是FKD-yyyyMMDD-00001
    ClientVO client; 
    FinanceStaffVO operator;
    TranscationVO[] transcations;
    double total;
}

class ReceivalBillVO extends ReceivalPaymentBillVOBase{
    
}

class PaymentBillVO extends ReceivalPaymentBillVOBase {

}

class CashBillVO {
    String ID;//格式是XJFYD-yyyyMMDD-00001
    FinanceStaffVO operator;
    BankAccountVO account;
    CashBillItemVO[] itemIDs;
}

class CashBillItemVO {
    String ID; //格式是XJFYDX-yyyyMMDD-XJFYDID-00001
    String name;
    double amount;
    String comment;
}

class TranscationVO {
    String ID; //格式是FKDSKD-yyyyMMDD-ID-00001
    String accountID;
    double total;
    String comment;
}

class TradeHistoryVO { //经营历程表
    BillVO[] bills;
}

class TradeHistoryQueryVO { //经营历程表查询条件
    Date[] timeRange;
    BillType billType;
    Client client;
    Employee operator;
    Inventory inventory;
}
    
class SaleDetailVO { //销售明细表
    SaleRecordVO[] records;
}

class SaleRecordVO { //商品销售记录
    Date date;
    String commodityName;
    String model;
    double amount;
    double unitPrice;
    double total;
}
    
class SaleDetailQueryVO { //销售明细表查询条件
    Date[] timeRange;
    String commodityName;
    Client client;
    SaleStaff operator;
    Inventory inventory; 
}

class TradeSituationVO { //经营历程表
    double saleIncome; //销售收入
    double commodityIncome; //商品类收入
    double saleCost; //销售支出
    double commodityCost; //商品支出
    double profit;
}

class BankAccountQueryVO {
    String ID;
    String name;
}

class SystemSnapshotPO { //账
    //存储一次不修改
    CommodityVO[] commodities;
    ClientVO[] clients;
    BankAccountVO[] bankAccounts;
}
```
