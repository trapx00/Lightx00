```java
class BillPO {
    BillType billType;
    String id;
    Date date;
    BillState state;
}
```

```java
enum BillType {
    InventoryBill, //库存类单据
    StockBill, //进货类单据
    SaleBill, //销售类单据
    FinanceBill, //财务类单据

}
```

```java
enum BillState {
    Draft,
    WaitingForApproval,
    Rejected,
    Approved,
    Abandoned
}
```

```java
class EmployeePO {
    String name;
    String id;
    Date workSince;
    String username;
    String password;
    EmployeePosition position;
}
```

```java
enum EmployeePosition{
    InventoryStaff,
    SaleStaff,
    FinanceStaff,
    Manager,
    Admin
}
```

```java
class NotificationPO {
    String id;
    Date date;
    NotificationType type;
}
```

```java
enum NotificationType{
    BillApproval,
    Others
}
```

```java
class BillApprovalNotificationPO extends NotificationPO {
    String billId;
}
```

```java
class BillApprovalNotificationVO {
    String id;
    Date date;
    NotificationType type;
    BillVO bill;
}
```

```java
class OtherNotificationPO extends NotificationPO {
    String content;
}
```

```java
class DraftPO {
    Date saveTime;
    String billId;
}
```

```java
class LogPO {
    Date date;
    LogSeverity severity;
    String content;
}
```

```java
enum LogSeverity{
    Info,
    Success,
    Warning,
    Failure
}
```