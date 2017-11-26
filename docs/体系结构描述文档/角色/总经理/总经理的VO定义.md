```java
class ManagerVo extends EmployeeVo{
}
```

```java
class PromotionVOBase{
    String id;
  PromotionType type;
  String startDate;
  String endDate; 
  PromotionState state;
  PromotionCommodity[] promotionCommodities;
}
```
```java
class ComSalePromotionVo extends PromotionVoBase{
    double onSalePrice;
}
```

```java
class TotalPriceGiftPromotionVo extends PromotionVoBase{
    double couponPrice;
    double totalPrice;
}
```

```java
class ClientPromotionVo extends PromotionVoBase{
    int clientLevel;
    double couponPrice;
    double onSalePrice;
}
```

```java
class ComSalePromotionQueryVo extends BaseQueryVo{  
}
class TotalPricePromotionQueryVo extends BaseQueryVo{    
}
class ClientPromotionQueryVo extends BaseQueryVo{   
}
```

```java
class BillInfoVo{
  String id;
  BillType type;
  Date approveTime;
  BillState state;
}
```

```java
class BillInfoQueryVO{
  String id;
  BillType type,;
  Date date;
  BillState state;
}
```
