###库存管理人员

```java
class InvetoryStaffPO extends EmployeePO {
  ;
}
```

```java
class CommodityPo {//商品
  String ID;
  String name;
  double number;
  double PurchasePrice;//进价
  double RecentPurPrice;//最近进价
  double RetailPrice;//售价
  double RecentReprice；//最近售价
}
```


```java
class CommodityManagePo{//商品分类
  String ID;
  String name;
  ArrayList<Commodity> store;
  String PreName;//父类
  String[] NextName; //子类
}
```
```java
class InventoryBill extends InventoryBillPo{//报损报溢报警
  String ID;
  String operatorID;
  Arraylist<Commodity> commodityList;
  Arraylist<Integer> nums;
  InventoryBillType type;
  Date time;
}
```

```java
enum InventoryBillType{
    Loss,Overflow,Warning
}
```

```java
class InventoryBillPo extends BillPo{
    InventoryBill inventoryBill;
}
```

