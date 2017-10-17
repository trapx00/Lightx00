class BillPO {
    BillType bill;
    String ID;
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

class EmployeePO {
    String name;
    String ID;
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

class NotificationPO {
    String ID;
    Date date;
    NotificationType type;
}

enum NotificationType{
    BillApproval,
    Others
}

class BillApprovalNotificationPO extends NotificationPO {
    String billID;
}

class OtherNotificationPO extends NotificationPO {
    String content;
}

class DraftPO {
    Date saveTime;
    String billID;
}