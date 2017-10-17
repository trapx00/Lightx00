###库存管理人员

```java
class InvetoryStaffVO extends EmployeeVO {
  ;
}
```

```java
class CommodityVO {//商品
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
class CommodityQueryVO{
    String ID;
    String name;
}
```

```java
class CommoditySortVO{//商品分类
  String ID;
  String name;
  String[] commodityID;
  String PreName;//父类
  String[] NextName; //子类
}
```
```java
class CommoditySortQueryVO{
    String ID;
    String name;
}
```
```java
class InventoryBillVO extends InventoryBillVO{//报损报溢报警
  String ID;
  String operatorID;
  Arraylist<Commodity> commodityList;
  Arraylist<Integer> nums;
  InventoryBillType type;
  Date time;
}
```

```java
enum InventoryBillTypeVO{
    Loss,Overflow,Warning
}
```
```java
class InventoryViewVO {
  double inVenNums;
  double inVenMoney;
  double outVenNUms;
  double outVenMoney;
  double sum;//合计
  double inSoldNums;
  double inSoldMoney;
  double outSoldNums;
  double outSoldMoney;
}
```
```java
class InventoryCheckVO{
  Date beginDate;
  Date endDate;
}
```
```java
class InventoryPcitureVO {
//名称，型号，库存数量，库存均价，批次，批号，出厂日期，并且显示行号
  String[] name;
  String[] type;
  double[] inVenNums;
  double[] inVenMoney;
  double[] outVenNUms;
  double[] outVenMoney;
  double[] sum;//合计
  double[] inSoldNums;
  double[] inSoldMoney;
  double[] outSoldNums;
  double[] outSoldMoney;
}
```
```java
class InventoryBillVO extends BillVO{
    InventoryBill inventoryBill;
}
```

