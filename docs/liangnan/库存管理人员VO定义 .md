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
   double RecentReprice;//最近售价
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
   String[] commodityIDList;
   String PreID;//父类
   String[] NextIDs; //子类
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
   String[] IDlist;//商品
   double[] numList;//报损报警报溢数量
   InventoryBillTypeVO type;
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
   Date time;
   double inVenNums;//入库数量
   double inVenMoney;//入库金额
   double outVenNUms;//出库数量
   double outVenMoney;//出库金额
   double sum;//合计
   double inSoldPrice;//最近进价
   double outSoldPrice;//最近售价
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
   String[] IDs;//
   String[] names;//名称
   String[] types;//型号
   double[] inVenNumList;//入库数量
   double[] inVenMoneyList;//入库均价
   double[] orderList;//批次
   double[] orderNumList;//批号
   Date time;//出厂日期
   String line;//行号
 }
 ```

 ```java
class InventoryGiftVO{
   Date time;
   String ID;
   String[]commodityIDs;//赠送商品
   String[]commodityNums;//对应商品数量
}
 ```

