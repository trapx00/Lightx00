//属性均使用ID而不是对象本身来代替以简化数据库开发。
//这就要求所有可能存在单独表里的数据都必须有一条ID。
//ID全大写
//如果是存一下不修改的可以使用对象引用

class FinancialStaffPO extends EmployeePO {
    
}
    
class BankAccountPO {
    String ID;
    String name;
    double amount;
    Date createTime;
}

class FinancialBillPO extends BillPO {
    FinancialBillType financialBillType;
}


enum FinancialBillType {
    ReceivalBill,
    PaymentBill,
    CashBill,
}

    
class ReceivalBillPO extends FinancialBillPO {
    String ID; //格式是SKD-yyyyMMDD-00001
    String clientID; 
    String operatorID;
    String[] transcationIDs;
    double total;
}
    
class TranscationPO {
    String ID;
    String accountID;
    double total;
    String comment;
}
    
class PaymentBillPO extends FinancialBillPO {
    String ID; //格式是FKD-yyyyMMDD-00001
    String clientID;
    String operatorID;
    String[] transcationIDs;
    double total;
}
    
class CashBillPO extends FinancialBillPO {
    String ID;//格式是XJFYD-yyyyMMDD-00001
    String operatorID;
    String accountID;
    String[] itemIDs;
}
    
class CashBillItemPO {
    String ID;
    String name;
    double amount;
    String comment;
}

class SystemSnapshotPO { //账
    //存储一次不修改
    Commodity[] commodities;
    Client[] clients;
    BankAccount[] bankAccounts;
}

//以下不是PO


class TradeHistory { //经营历程表
    Bill[] bills;
}

class TradeHistoryQuery {
    Date[] timeRange;
    BillType billType;
    Client client;
    Employee operator;
    Inventory inventory;
}
    
class SaleDetail { //销售明细表
    SaleRecord[] records;
}

class SaleRecord { //商品销售记录
    Date date;
    String commodityName;
    String model;
    double amount;
    double unitPrice;
    double total;
}
    
class SaleDetailQuery { //销售明细表查询条件
    Date[] timeRange;
    String commodityName;
    Client client;
    SaleStaff operator;
    Inventory inventory; 
}

class TradeSituation { //经营历程表
    double saleIncome; //销售收入
    double commodityIncome; //商品类收入
    double saleCost; //销售支出
    double commodityCost; //商品支出
    double profit;
}

