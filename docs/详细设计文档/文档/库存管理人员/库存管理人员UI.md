### 2.1.1 commodityui包

#### 2.1.1.1 概述

commoditybl包负责库存管理人员商品管理、商品分类管理的的UI界面以及响应控制代码。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.1.1.2 整体结构

此包为展示层的一部分，它负责展示信息以及与用户的交互。它依赖它对应的commodityblservice包与bl层进行交互。

#### 2.1.1.3 设计

##### 2.1.1.3.1 设计图

![commodityui](/img/设计图/commodityui.png)


##### 2.1.1.3.2 各个类的职责

| 类名                        | 职责                   |
| ------------------------- | -------------------- |
| CommodityUiController     | 负责商品管理界面的展示和功能。      |
| CommoditySortUiController | 负责商品分类管理界面的展示和功能。    |
| CommodityInfoUi           | 提供给其他商品及其分类界面的展示和功能。 |

##### 2.1.1.3.3 内部类的接口规范

**CommodityUiController**

提供的接口

需要的接口

| 接口名称                                     | 服务名    |
| ---------------------------------------- | ------ |
| `commodityblservice.GoodsManagementBlService.add(CommodityVo newCommodity)` | 提交新商品。 |
| `commodityblservice.GoodsManagementBlService.modify(CommodityVo commodity)` | 修改商品。  |
| `commodityblservice.GoodsManagementBlService.query(CommdoityQueryVo commodityQueryVo)` | 查询商品   |
| `commodityblservice.GoodsManagementBlService.delete(CommodityVo commodity)` | 删除商品。  |


// 体系文件里的resume方法需要删掉，根据昨天的讨论，可以直接通过ContinueWritable接口实现。
// 记得加ID！！！


**CommoditySortUiController**

提供的接口


需要的接口

| 接口名称                                     | 服务名       |
| ---------------------------------------- | --------- |
| `commodityblservice.ProductManagementBlService.add(CommoditySortVo newSort,CommoditySortVo parentSort)` | 提交新分类。    |
| `commodityblservice.ProductManagementBlService.modify(CommoditySortVo sort)` | 修改分类。     |
| `commodityblservice.ProductManagementBlService.query(CommoditySortQuerVo commoditySortQueryVo)` | 查询分类信息。   |
| `commodityblservice.ProductManagementBlService.delete(CommoditySortVo sort)` | 删除分类。     |
| `commodityblservice.ProductManagementBlService.display(); | 显示所有父类。   |
| `commodityblservice.ProductManagementBlService.display(CommoditySortVo commoditySort)` | 显示父类下的子类。 |





### 2.1.7 inventoryui包

#### 2.1.7.1 概述

inventoryui包负责库存管理相关等功能的UI的展示和功能实现。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.1.7.2 整体结构

此包为展示层的一部分，它负责展示信息以及与用户的交互。它依赖它对应的inventoryblservice包与bl层进行交互。

#### 2.1.7.3 设计

##### 2.1.7.3.1 设计图

![inventoryui](/img/设计图/inventoryui.png)

##### 2.1.7.3.2 各个类的职责

| 类名                           | 职责                                   |
| ---------------------------- | ------------------------------------ |
| InventoryCheckUiController   | 负责库存查看界面的展示和功能。                      |
| InventoryGiftUiController    | 负责商品赠送界面的展示和功能。                      |
| InventoryWarningUiController | 负责库存监控界面的展示和功能。                      |
| InventoryBillInfoUi          | 负责实现为其他包提供查询获取报损、报溢、报警、赠送单据界面的展示和功能。 |

##### 2.1.7.3.3 内部类的接口规范

**InventoryCheckUiController**

提供的接口



需要的接口

| 接口名称                                     | 服务名         |
| ---------------------------------------- | ----------- |
| `inventoryblservice.InventoryCheckBlService.check(Date beginTime, Date endTime)` | 提供时间段内库存变化。 |
| `inventoryblservice.InventoryCheckBlService.picture()` | 提供当日库存快照。   |
| `inventoryblservice.InventoryCheckBlService.export(File newfile)` | 导出Excel。    |



**InventoryGiftUiController**

提供的接口



需要的接口

| 接口名称                                     | 服务名           |
| ---------------------------------------- | ------------- |
| `inventoryblservice.InventoryGiftBlService.getGift(Date time); | 提供满足促销条件的赠送单。 |
| `InventoryGiftBlService.getId`           | 得到ID。         |
| `inventoryblservice.InventoryGiftBlService.getAllCommodity(); | 选择商品。         |
| `inventoryblservice.InventoryGiftBlService.submit(InventoryGiftVo inventoryGiftVo)` | 提交完成赠送单。      |





**InventoryWarningUiController**

提供的接口

| 接口名称                             | 语法                                       | 前置条件            | 后置条件        |
| -------------------------------- | ---------------------------------------- | --------------- | ----------- |
| ContinueWritable.continueWriting | `public InventoryWarningUiController continueWriting(InventoryBillVo bill);` | 输入有效的用于继续填写的单据。 | 初始化传入单据的内容。 |

需要的接口

| 接口名称                                     | 服务名     |
| ---------------------------------------- | ------- |
| `inventoryblservice.InventoryWarningBlService.submit(InventoryBillVo bill)` | 提交单据。   |
| `inventoryblservice.InventoryWarningBlService.saveAsDraft(InventoryBillVo bill)` | 保存草稿。   |
| `inventoryblservice.InventoryWarningBlService.modify(CommodityVo commodity，double modifyWarning)` | 修改警戒值。  |
| `inventoryblservice.InventoryWarningBlService.getCurrentBill()` | 得到现有单据。 |
| `inventoryblservice.InventoryWarningBlService.query(InventoryBillQueryVo inventoryBillQueryVo)` | 查询单据。   |
| `inventoryblservice.InventoryWarningBlService.getId()` | 提供ID。   |
| `inventoryblservice.InventoryWarningBlService.getAllCommodity()` | 提供商品。   |