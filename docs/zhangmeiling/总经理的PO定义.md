

```java
class ManagerStaffPO{
  String ID;
  String name;
}

class PromotionPOBase{
  String ID;
  PromotionType type;
  String startDate;
  String endDate; 
}

 enum PromotionType{
   Draft,
   Waiting,
   Efficient,
   Overdue,
   Abondoned;
}

class CommodityOnSalePO extends PromotionPOBase{
    Commodity[] commodityOnSale;
    double onSalePrice;
}

class TotalPriceGiftsPO extends PromotionPOBase{
    Commodity[] gifts;
    double totalPrice;
}
class TotalPriceCouponPO extends PromotionPOBase{
    double couponPrice;
    double totalPrice;
}
class ClientGiftsPO extends PromotionPOBase{
    int clientLevel;
    Commodity[] gifts;
}

class ClientCouponPO extends PromotionPOBase{
    int clientLevel;
    double couponPrice;
}

class ClientOnSalePO extends PromotionPOBase{
    int clientLevel;
    double onSalePrice;
}
```



