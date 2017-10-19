



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
  PromotionState state;
}

 enum PromotionType{
   CommodityOnSale,//组合商品降价
   TotalPriceGift,//满额赠送礼品
   TotalPriceCoupon,//满额赠送代金券
   ClientGift,//客户赠送礼品
   ClientCoupon,//客户赠送代金券
   ClientOnSale;//客户价格这让
}

enum PromotionState{
   Draft,
   Waiting,
   Active,
   Overdue,
   Abondoned;
}

class PromotionCommodity{
    String ID;
    String commodityID;
    double amout;
}

class CommodityOnSalePO extends PromotionPOBase{
    PromotionCommodity[] commodityOnSale;
    double onSalePrice;
}

class TotalPriceGiftPO extends PromotionPOBase{
    PromotionCommodity[] gifts;
    double totalPrice;
}
class TotalPriceCouponPO extends PromotionPOBase{
    double couponPrice;
    double totalPrice;
}
class ClientGiftPO extends PromotionPOBase{
    int clientLevel;
    PromotionCommodity[] gifts;
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



