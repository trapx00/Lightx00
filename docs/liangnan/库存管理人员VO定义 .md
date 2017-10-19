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
   double amount;
   double purchasePrice;//进价
   double recentPurchasePrice;//最近进价
   double retailPrice;//售价
   double recentRetailPrice;//最近售价
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
   String preID;//父类
   String[] nextIDs; //子类
 }
 ```

 ```java
 class InventoryBillVO {//报损报溢报警
   String ID;
   String operatorID;
   String[] IDlist;//商品
   double[] amountList;//报损报警报溢数量
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
 class InventoryViewVO {
   Date time;
   double inventoryAmounts;//入库数量
   double inventoryMoney;//入库金额
   double outOfInventoryAmounts;//出库数量
   double outOfInventoryMoney;//出库金额
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
 class InventoryPictureVO {
 //名称，型号，库存数量，库存均价，批次，批号，出厂日期
   String[] IDs;//
   String[] names;//名称
   String[] models;//型号
   double[] inventoryAmountList;//入库数量
   double[] inventoryMoneyList;//入库均价
   double[] orderList;//批次
   double[] orderNumList;//批号
   Date time;//出厂日期
 }
 ```

 ```java
class InventoryGiftVO{
   Date time;
   String ID;
   PromotionCommodity[] gifts;
}
 ```

