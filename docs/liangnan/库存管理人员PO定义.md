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
  double number;
  double PurchasePrice;//进价
  double RecentPurPrice;//最近进价
  double RetailPrice;//售价
  double RecentReprice；//最近售价
  double warningValue;//警戒值
}
```


```java
class CommoditySortPO{//商品分类
  String ID;
  String name;
  String []commodityID;
  String PreID;//父类
  String[] NextID; //子类
}
```
```java
class InventoryDetailBillPO extends InventoryBillPO{//报损报溢报警
  String ID;//单据编号
  String operatorID;//操作员编号
  String[]commodityID;//商品
  int[] nums;//报损/报溢/报警数量
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
class InventoryPciturePO {
//名称，型号，库存数量，库存均价，批次，批号，出厂日期，并且显示行号
  String[] ID;//
  String[] names;//名称
  String[] type;//型号
  double[] inVenNums;//入库数量
  double[] inVenMoney;//入库均价
  double[] order;//批次
  double[] orderNum;//批号
  Date time;//出厂日期
  String line;//行号
}
```

```java
class InventoryViewPO {
  double inVenNums;//入库数量
  double inVenMoney;//入库金额
  double outVenNUms;//出库数量
  double outVenMoney;//出库金额
  double sum;//合计
  double inSoldPrice;//最近进价
  double outSoldPrice;//最近售价
}
```

