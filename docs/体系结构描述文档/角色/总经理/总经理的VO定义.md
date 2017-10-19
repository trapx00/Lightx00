```java
class ManagerVO{
    String ID;
    String name;
}

class BillQueryVO{
  String ID;
  BillType type,;
  Date date;
  BillState state;
}

class LogQueryVO{
  Date date;
  LogSeverity severity;
  String content;
}

class PromotionVOBase{
    String ID;
    PromotionType type;
}

class CommodityOnSaleVO extends PromotionVOBase{
    String CommodityOnSaleItemID;//通过ID得到CommodityOnSaleItem内容
}

class TotalPriceGiftVO extends PromotionVOBase{
   String TotalPriceGiftItemID;//通过ID得到TotalPriceGiftItem内容
}

class TotalPriceCouponVO extends PromotionVOBase{
   String TotalPriceItemID;//通过ID得到TotalPriceItem内容
}
class ClientGiftVO extends PromotionVOBase{
    String ClientGiftItemID;//通过ID得到ClientGiftItem内容	
}

class ClientCouponVO extends PromotionVOBase{
    String ClientCouponItemID;//通过ID得到ClientCouponItem内容
}

class ClientOnSaleVO extends PromotionVOBase{
    String ClientOnSaleItemID;//通过ID得到ClientOnSaleItem的内容
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


class PromotionItemBase{
    String ID;//Item对象自己的ID标识
    String startDate;
    String endDate;
}

class CommodityOnSaleItem extends PromotionItemBase{
    PromotionCommodity[] commodityOnSale;
}

class TotalPriceGiftItem extends PromotionItemBase{
    PromotionCommodity[] gifts;
}

class TotalPriceCouponItem extends PromotionItemBase{
    double totalPrice;
    double couponPrice;
}

class ClinetGiftItem extends PromotionItemBase{
     PromotionCommodity[] gifts;
}

class ClientCouponItem extends PromotionItemBase{
    int clientLevel;
    double couponPrice;
}

class ClientOnSaleItem extends PromotionItemBase{
    int clientLevel;
    double onSalePrice;
}
```

