```java
class ClientPO {
    String id;
    ClientType clientType;
    int clientLevel;
    String name;
    String phone;
    String address;
    String zipCode;
    String email;
    double receivableQuota;
    double payableQuota;
    SaleStaffPO defaultOperator;
}
```

```typescript
enum ClientType {
    Supplier,
    Retailer
}
```

```java
class SaleStaffPO extends EmployeePO {
    SaleStaffType saleStaffType;
}
```

```java
enum SaleStaffType {
    President,
    Staff
}
```

```java
class SaleBillBasePO extends BillPO {
    SaleBillType saleBillType;
}
```

```java
enum SaleBillType {
    Sale,
    SaleRefund
}
```

```java
class SaleBillPO extends SaleBillBasePO {
    String supplier;
    Employee defaultOperator;
    SaleStaffPO operator;
    int repository;
    Commodity[] commodityList;
    double originTotal;
    double minusProfits;
    double token;
    double ultiTotal;
    String Comment;
}
```

```java
class SaleRefundBillPO extends SaleBillBasePO {
    String supplier;
    Employee defaultOperator;
    SaleStaffPO operator;
    int repository;
    Commodity[] commodityList;
    double originTotal;
    double minusProfits;
    double token;
    double ultiTotal;
    String Comment;
}
```

```java
class PurchaseBillBasePO extends BillPO {
    PurchaseBillType purchaseBillType;
}
```

```java
enum PurchaseBillType {
    Purchase,
    PurchaseRefund
}
```

```java
class PurchaseBillPO extends PurchaseBillBasePO {
    String supplier;
    int repository;
    SaleStaffPO operator;
    String Comment;
    double total;
    Commodity[] commodityList;
}
```

```java
class PurchaseRefundBillPO extends PurchaseBillBasePO {
    String supplier;
    int repository;
    SaleStaffPO operator;
    String Comment;
    double total;
    Commodity[] commodityList;
}
```


