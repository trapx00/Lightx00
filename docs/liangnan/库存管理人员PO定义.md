###库存管理人员

```java
class InvetoryStaffPO extends EmployeePO {
  ;
}
```

```java
class CommodityPO {//商品
  String ID;
  String name;
  String type;
  double amount;
  double purchasePrice;//进价
  double recentPurPrice;//最近进价
  double retailPrice;//售价
  double recentReprice；//最近售价
  double warningValue;//警戒值
}
```


```java
class CommoditySortPO{//商品分类
  String ID;
  String name;
  String []commodityIDList;
  String preID;//父类
  String[] nextID; //子类
}
```
```java
class InventoryDetailBillPO extends InventoryBillPO{//报损报溢报警
  String ID;//单据编号
  String operatorID;//操作员编号
  String[] commodityIDList;//商品
  double[] amounts;//报损/报溢/报警数量
  Date time;
}
```

```java
enum InventoryBillTypePO{
  Loss,Overflow,Warning//单据类型
}
```

```java
class InventoryBillPO extends BillPO{
  InventoryBillTypePO inventoryBillType;
}
```

```java
class InventoryPicturePO {
//名称，型号，库存数量，库存均价，批次，批号，出厂日期，并且显示行号
  Date time;
  String[] IDs;//
  String[] names;//名称
  String[] types;//型号
  double[] inVenAmountList;//入库数量
  double[] inVenMoneyList;//入库均价
  double[] orderList;//批次
  double[] orderNumList;//批号
  Date time;//出厂日期
  String line;//行号
}
```

```java
class InventoryViewPO {
  Date time;
  double inVenAmount;//入库数量
  double inVenMoney;//入库金额
  double outVenAmount;//出库数量
  double outVenMoney;//出库金额
  double sum;//合计
  double inSoldPrice;//最近进价
  double outSoldPrice;//最近售价
}
```

```java
 class InventoryCheckPO{
    Date beginDate;
    Date endDate;
 }
```

```java
class InventoryGiftPO{
   Date time;
   String ID;
   String[] giftIDs;//赠送商品
   String[] giftyAmounts;//对应商品数量
}
```

