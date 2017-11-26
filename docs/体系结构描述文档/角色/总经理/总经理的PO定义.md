



```java
class ManagerPo extends EmployeePo{
}
```

```java
class PromotionPoBase{
  String id;
  PromotionType type;
  String startDate;
  String endDate; 
  PromotionState state;
  PromotionCommodity[] promotionCommodities;
}
```

```java
 enum PromotionType{
   ComSalePromotion,//组合商品降价
   TotalPricePromotion,//满额促销策略（满额赠送礼品、满额赠送代金券）
   ClientPromotion,//客户促销策略（客户赠送礼品、客户赠送代金券、客户价格这让）
}
```

```java
enum PromotionState{
   Draft,
   Waiting,
   Active,
   Overdue,
   Abandoned;
}
```

```java
class PromotionCommodity{
    String id;
    String commodityId;
    double amount;
}
```

```java
class ComSalePromotionPo extends PromotionPoBase{
    double onSalePrice;
}
```

```java
class TotalPriceGiftPromotionPo extends PromotionPoBase{
    double couponPrice;
    double totalPrice;
}
```

```java
class ClientPromotionPo extends PromotionPoBase{
    int clientLevel;
    double couponPrice;
    double onSalePrice;
}
```

```java
class BillInfoPo{
  String id;
  BillType type;
  Date approveTime;
  BillState state;
}
```

