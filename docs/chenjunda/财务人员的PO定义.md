
```java
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


class ReceivalPaymentBillPOBase extends FinancialBillPO {
    String ID; //收款单格式是SKD-yyyyMMDD-00001，付款单格式是FKD-yyyyMMDD-00001
    String clientID; 
    String operatorID;
    String[] transcationIDs;
    double total;
}



enum FinancialBillType {
    ReceivalBill,
    PaymentBill,
    CashBill,
}

    
class ReceivalBillPO extends ReceivalPaymentBillPOBase {
}
    
class TranscationPO {
    String ID; //格式是FKDSKD-yyyyMMDD-ID-00001
    String accountID;
    double total;
    String comment;
}
    
class PaymentBillPO extends ReceivalPaymentBillPOBase {
}


class CashBillPO extends FinancialBillPO {
    String ID;//格式是XJFYD-yyyyMMDD-00001
    String operatorID;
    String accountID;
    String[] itemIDs;
}
    
class CashBillItemPO {
    String ID; //格式是XJFYDX-yyyyMMDD-XJFYDID-00001
    String name;
    double amount;
    String comment;
}

class SystemSnapshotPO { //账
    //存储一次不修改
    CommodityVO[] commodities;
    ClientVO[] clients;
    BankAccountVO[] bankAccounts;
}
```