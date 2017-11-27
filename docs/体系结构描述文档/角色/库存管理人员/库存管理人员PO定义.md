###库存管理人员

```java
class InvetoryStaffPo extends EmployeePo {
  ;
}
```

```java
class CommodityPo {//商品
  String ID;//型号+名称生成
  String name;
  String type;
  double amount;
  Date productionDate;//生产日期
  String batch;//批次
  String batchNo;//批号
  double purchasePrice;//进价
  double recentPurchasePrice;//最近进价
  double retailPrice;//售价
  double recentRetailPrice;//最近售价
  double warningValue;//警戒值
  double inventoryNum;//报警报损报溢数量
}
```


```java
class CommoditySortPo{//商品分类
  String ID;
  String name;
  CommodityPo []commodityList;//子类
  String preID;//父类
}
```
```java
class InventoryDetailBillPo extends InventoryBillPo{//报损报溢报警
   CommodityPo [] commodityList;//商品
}
```

```java
enum InventoryBillType{
  Loss,Overflow,Warning,Gift//单据类型
}
```

```java
class InventoryBillPo extends BillPo{
  InventoryBillType inventoryBillType;
}
```

```java
class InventoryPicturePo {
//名称，型号，库存数量，库存均价，批次，批号，出厂日期
  String id;
  Date time;
  CommodityPO[] items;
}
```

```java
class InventoryViewPo {
  String id;
  Date time;
  double inventoryAmount;//入库数量
  double inventoryMoney;//入库金额
  double outOfInventoryAmount;//出库数量
  double outOfInVentoryMoney;//出库金额
  double sum;//合计
  double inSoldPrice;//最近进价
  double outSoldPrice;//最近售价
}
```


```java
class InventoryGiftPo extends InventoryBillPo {
   PromotionCommodity[] gifts;
}
```

