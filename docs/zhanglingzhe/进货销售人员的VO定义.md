```java
class ClientVO {
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
    SaleStaffVO defaultOperator;
}
```

```typescript
enum ClientType {
    Supplier,
    Retailer
}
```

```java
class SaleStaffVO extends EmployeeVO {
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
class SaleBillBaseVO extends BillVO {
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
class SaleBillVO extends SaleBillBaseVO {
    String supplier;
    EmployeeVO defaultOperator;
    SaleStaffVO operator;
    int repository;
    CommodityVO[] commodityList;
    double originTotal;
    double minusProfits;
    double token;
    double ultiTotal;
    String Comment;
}
```

```java
class SaleRefundBillVO extends SaleBillBaseVO {
    String supplier;
    EmployeeVO defaultOperator;
    SaleStaffVO operator;
    int repository;
    CommodityVO[] commodityList;
    double originTotal;
    double minusProfits;
    double token;
    double ultiTotal;
    String Comment;
}
```

```java
class PurchaseBillBaseVO extends BillVO {
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
class PurchaseBillVO extends PurchaseBillBaseVO {
    String supplier;
    int repository;
    SaleStaffVO operator;
    String Comment;
    double total;
    CommodityVO[] commodityList;
}
```

```java
class PurchaseRefundBillVO extends PurchaseBillBaseVO {
    String supplier;
    int repository;
    SaleStaffVO operator;
    String Comment;
    double total;
    CommodityVO[] commodityList;
}
```


