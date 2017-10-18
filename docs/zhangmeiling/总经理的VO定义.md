```java
class ManagerVO{
    String ID;
    String name;
}

class PromotionVOBase{
    String ID;
    PromotionType type;
    String startDate;
    String endDate;
}

class CommodityOnSaleVO extends PromotionVOBase{
    Commodity[] commodityOnSale;
    double onSalePrice;
}

class TotalPriceGiftsVO extends PromotionVOBase{
    Commodity[] gifts;
    double totalPrice;
}

class TotalPriceCouponVO extends PromotionVOBase{
    double couponPrice;
    double totalPrice;
}
class ClientGiftsVO extends PromotionVOBase{
    int clientLevel;
    Commodity[] gifts;
}

class ClientCouponVO extends PromotionVOBase{
    int clientLevel;
    double couponPrice;
}

class ClientOnSaleVO extends PromotionVOBase{
    int clientLevel;
    double onSalePrice;
}

class PromotionQueryVO{//促销策略查询操作
    String ID;
    PromotionType type;
    String startDate;
    String endDate;
    int clientLevel;
    double couponPrice;
    double totalPrice;
}

class CommodityQueryVO{//商品查询操作
      String ID;
      String name;
      String type;
}
```

