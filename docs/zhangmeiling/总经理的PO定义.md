



```java
class ManagerStaffPO{
  String ID;
  String name;
}
```

```java
class PromotionPOBase{
  String ID;
  PromotionType type;
  String startDate;
  String endDate; 
  PromotionState state;
}
```

```java
 enum PromotionType{
   CommodityOnSale,//组合商品降价
   TotalPriceGift,//满额赠送礼品
   TotalPriceCoupon,//满额赠送代金券
   ClientGift,//客户赠送礼品
   ClientCoupon,//客户赠送代金券
   ClientOnSale;//客户价格这让
}
```

```java
enum PromotionState{
   Draft,
   Waiting,
   Active,
   Overdue,
   Abondoned;
}
```

```java
class PromotionCommodity{
    String ID;
    String commodityID;
    double amout;
}
```

```java
class CommodityOnSalePO extends PromotionPOBase{
    PromotionCommodity[] commodityOnSale;
    double onSalePrice;
}
```

```java
class TotalPriceGiftPO extends PromotionPOBase{
    PromotionCommodity[] gifts;
    double totalPrice;
}
```

```java
class TotalPriceCouponPO extends PromotionPOBase{
    double couponPrice;
    double totalPrice;
}
```

```java
class ClientGiftPO extends PromotionPOBase{
    int clientLevel;
    PromotionCommodity[] gifts;
}
```

```java
class ClientCouponPO extends PromotionPOBase{
    int clientLevel;
    double couponPrice;
}
```

```java
class ClientOnSalePO extends PromotionPOBase{
    int clientLevel;
    double onSalePrice;
}
```



