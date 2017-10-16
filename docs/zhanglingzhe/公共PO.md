class Bill {
    BillType bill;
    String id;
    Date date;
    BillState state;
}

enum BillType {
    InventoryBill, //库存类单据
    StockBill, //进货类单据
    SaleBill, //销售类单据
    FinanceBill, //财务类单据

}

enum BillState {
    Draft,
    WaitingForApproval,
    Rejected,
    Approved,
    Abandoned
}

class Employee {
    String name;
    String id;
    Date workSince;
    String username;
    String password;
    EmployeePosition position;
}

enum EmployeePosition{
    InventoryStaff,
    SaleStaff,
    FinanceStaff,
    Manager,
    Admin
}

class Notification {
    String id;
    Date date;
    NotificationType type;
}

enum NotificationType{
    BillApproval,
    Others
}

class BillApprovalNotification extends Notification {
    String billId;
}

class OtherNotification extends Notification {
    String content;
}

class Draft {
    Date saveTime;
    String billId;
}