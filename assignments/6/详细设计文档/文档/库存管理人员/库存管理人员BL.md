### 2.2.1 commoditybl包

#### 2.2.1.1 概述

commoditybl包负责库存管理人员商品管理、商品分类管理的业务逻辑实现代码。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.2.1.2 整体架构

此包为业务逻辑层的一部分，它负责展示信息以及与用户的交互。它实现了commoditybl包所需要的commodityblservice的所有接口，并依赖commoditydataservice包与data层进行交互,它同时公开了CommodityInfo接口用于给其他bl提供银行账户信息。

#### 2.2.1.3 设计

##### 2.2.1.3.1 设计图

![commoditybl](/img/设计图/commoditybl.png)

##### 2.2.1.3.2 各个类的职责

| 类名                        | 职责                       |
| ------------------------- | ------------------------ |
| CommodityBlController     | 负责实现商品管理界面的功能实现          |
| CommoditySortBlController | 负责实现商品分类管理界面的功能实现        |
| CommodityInfo             | 负责实现为其他包提供查询获取商品及分类信息的服务 |


##### 2.2.1.3.3 内部类的接口规范

**CommodityBlController**

提供的接口

| 接口名称                            | 语法                                       | 前置条件        | 后置条件                  |
| ------------------------------- | ---------------------------------------- | ----------- | --------------------- |
| GoodsManagementBlService.add    | `public ResultMessage add(CommodityVo newCommodity);` | 商品输入合法。     | 添加新的商品，持久化更新涉及的对象的数据。 |
| GoodsManagementBlService.modify | `public ResultMessage modify(CommodityVo updateCommodity);` | 商品信息修改输入合法。 | 修改商品，持久化更新涉及的对象的数据。   |
| GoodsManagementBlService.query  | `public CommodityVo[] query(CommdoityQueryVo commodityQueryVo);` | 查询输入格式合法。   | 返回符合查询条件的数据。          |
| GoodsManagementBlService.delete | `public ResultMessage delete(CommodityVo commodity);` | 商品信息输入合法。   | 删除该商品，持久化更新涉及的对象的数据。  |

需要的接口

| 接口名称                                     | 服务名                 |
| ---------------------------------------- | ------------------- |
| `commoditydataservice.GoodsManagementDataService.query(CommodityQueryVo commodityQueryVo)` | 根据ID和/或名称查找单一持久化对象。 |
| `commoditydataservice.GoodsManagementDataService.add(CommodityPo commodity)` | 添加单一化持久对象。          |
| `commoditydataservice.GoodsManagementDataService.modify(CommodityPo updateCommodity)` | 修改添加单一化持久对象。        |
| `commoditydataservice.GoodsManagementDataService.delete(CommodityPo commodity)` | 删除单一化持久对象。          |
| `logbl.LogBl.log(LogSeverity severity, String content)` | 记录日志。               |



**CommoditySortBlController**

提供的接口

| 接口名称                               | 语法                                       | 前置条件                 | 后置条件                  |
| ---------------------------------- | ---------------------------------------- | -------------------- | --------------------- |
| ProductManagementBlService.add     | `public ResultMessage add(CommoditySortVo newSort,CommoditySortVo parentSort);` | 商品分类信息输入合法，并且父类中无商品。 | 添加新的商品分类，持久化更对象的数据。   |
| ProductManagementBlService.modify  | `public ResultMessage modify(CommoditySortVo sort);` | 商品分类修改信息输入合法。        | 更改商品分类，持久化更新涉及的对象的数据。 |
| ProductManagementBlService.query   | `public CommoditySortVo[] query(CommoditySortQuerVo commoditySortQueryVo);` | 商品分类查询信息输入合法。        | 返回符合查询条件的数据。          |
| ProductManagementBlService.delete  | `public ResultMessage delete(CommoditySortVo sort);` | 商品分类删除信息输入合法。        | 删除商品分类，持久化更新涉及的对象的数据。 |
| ProductManagementBlService.display | `public CommoditySortVo[] display();`    | 已经创建一个CommoditySort。 | 显示所有商品分类。             |
| ProductManagementBlService.display | `public CommoditySortVo[] dispaly(CommoditySortVo commoditySort);` | 该父类存在。               | 显示父类下的所有子类。           |

需要的接口

| 接口名称                                     | 服务名             |
| ---------------------------------------- | --------------- |
| `commoditydataservice.ProductManagementDataService.query(CommoditySortQueryVo commoditySortQueryVo)` | 根据ID和/或名称模糊化查询。 |
| `commoditydataservice.ProductManagementDataService.add(CommodityPo commodity)` | 添加单一持久化对象。      |
| `commoditydataservice.ProductManagementDataService.modify(CommodityPo updateCommodity)` | 修改单一持久化对象。      |
| `commoditydataservice.ProductManagementDataService.delete(CommodityPo commodity)` | 删除单一持久化对象爱那个。   |
| `logbl.LogBl.log(LogSeverity severity, String content)` | 记录日志。           |

**CommodityInfo**

提供的接口

| 接口名称                             | 语法                                       | 前置条件         | 后置条件          |
| -------------------------------- | ---------------------------------------- | ------------ | ------------- |
| CommodityInfo.queryCommodity     | `public CommodityVo[] queryCommodity(CommodityQueryVo commodityQueryVo);` | 其他类需要商品信息。   | 返回所需商品的持久化对象。 |
| CommodityInfo.queryCommoditySort | `public CommoditySortVo[] queryCommoditySort(CommoditySortQueryVo commoditySortQueryVo);` | 其他类需要商品分类信息。 | 返回所需分类的持久化对象。 |

需要的接口

| 接口名称                                     | 服务名                 |
| ---------------------------------------- | ------------------- |
| `commodityBlService.ProductManagementBlService.query(CommoditySortQuerVo commoditySortQueryVo)` | 根据ID和/或名称模糊化查询商品分类。 |
| `commodityBlSerevice.GoodsManagementBlService.query(CommodityQueryVo commodityQueryVo)` | 根据ID和/或名称模糊化查询商品。   |

### 

### 2.2.2 inventorybl包

#### 2.2.2.1 概述

Inventorybl模块负责实现仓库的管理，对库存进行报损、报溢，报警，对库存进行盘点、查看，完成商品赠送等业务需求。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.2.2.2 整体架构

此包为业务逻辑层的一部分，它负责展示信息以及与用户的交互。它实现了inventoryui包所需要的inventoryblservice的所有接口，并依赖inventorydataservice包与data层进行交互。它同时公开了inventoryInfo接口用于给其他bl提供银行账户信息。

#### 2.2.2.3 设计

##### 2.2.2.3.1 设计图

![inventorybl](/img/设计图/inventorybl.png)

##### 2.2.2.3.2 各个类的职责

| 类名                           | 职责                             |
| ---------------------------- | ------------------------------ |
| InventoryCheckBlController   | 负责库存查看功能的实现。                   |
| InventoryGiftBlController    | 负责商品赠送功能的实现。                   |
| InventoryWarningBlController | 负责库存监控功能的实现。                   |
| InventoryBillInfo            | 负责实现为其他包提供查询获取报损、报溢、报警、赠送单据服务。 |

##### 2.2.2.3.3 内部类的接口规范

**InventoryCheckBlController**

提供的接口

| 接口名称                            | 语法                                       | 前置条件        | 后置条件                                     |
| ------------------------------- | ---------------------------------------- | ----------- | ---------------------------------------- |
| InventoryCheckBlService.check   | `public InventoryViewVo check(Date beginTime, Date endTime);` | 日期输入合法。     | 完成在此时间段内的出／入库数量／金额，销售／进货数量／金额，以及库存合计的查看。 |
| InventoryCheckBlService.picture | `public InventoryPictureVo picture();`   | 已经得到当日库存快照。 | 生成截至盘点时间的库存盘点。                           |
| InventoryCheckBlService.export  | `public ResultMessage export(File newfile);` | 已经完成库存盘点。   | 导出Excel到指定位置。                            |



需要的接口

| 接口名称                                     | 服务名         |
| ---------------------------------------- | ----------- |
| `inventorydataservice.InventoryCheckDataService.check(Date beginTime, Date endTime)` | 提供时间段内库存变化。 |
| `inventorydataservice.InventoryCheckDataService.picture(Date time)` | 提供当日库存快照。   |
| `logbl.LogBl.log(LogSeverity severity, String content)` | 记录日志。       |

##### 

**InventoryGiftBlController**

提供的接口

| 接口名称                                   | 语法                                       | 前置条件     | 后置条件        |
| -------------------------------------- | ---------------------------------------- | -------- | ----------- |
| InventoryGiftBlService.getGift         | `public InventoryGiftVo getGift(Data time);` | 输入合法。    | 提供符合条件的赠送单。 |
| InventoryGiftBlService.getId           | `public String getId();`                 | 当前存在赠送单。 | 提供当前赠送单ID。  |
| InventoryGiftBlService.getAllCommodity | `public CommodityVo[] getAllCommodity();` | 存在商品。    | 提供商品.       |
| InventoryGiftBlService.submit          | `public ResultMessage submit(InventoryGiftVo bill);` | 输入合法。    | 提交完成的赠送单。   |



需要的接口

| 接口名称                                     | 服务名           |
| ---------------------------------------- | ------------- |
| `inventorydataservice.InventoryGiftDataService.getGift(Date time)` | 提供满足促销条件的赠送单。 |
| `logbl.LogBl.log(LogSeverity severity, String content)` | 记录日志。         |
| `inventorydataservice.InventoryGiftDataService.getGift(Date time)` |               |



**InventoryWarningBlController**

提供的接口

| 接口名称                                     | 语法                                       | 前置条件              | 后置条件                  |
| ---------------------------------------- | ---------------------------------------- | ----------------- | --------------------- |
| InventoryWarningBlService.submit         | `public ResultMessage submit(InventoryBillVo bill);` | 单据所有属性有效。         | 单据已经保存到数据库，持久化信息已经保存。 |
| InventoryWarningBlService.saveAsDraft    | `public ResultMessage saveAsDraft(InventoryBillVo bill);` | 单据信息非空。           | 保存草稿，持久化信息已经保存。       |
| InventoryWarningBlService.modify         | `public ResultMessage modify(CommodityVo commodity，double modifyWarning);` | 该商品存在，且修改警戒值输入合法。 | 修改警戒值，持久化更新涉及的对象的数据。  |
| InventoryWarningBlService.getCurrentBill | `public InventoryBillVo getCurrentBill();` | 现有单据存在。           | 返回现有单据。               |
| InventoryWarningBlService.query          | `public InventoryBillVo []query(InventoryBillQueryVo inventoryBillQueryVo);` | 单据所有属性有效。         | 返回符合条件的单据。            |
| InventoryWarningBlService.getId          | `public String getId();`                 | 现有单据存在。           | 返回现有单据Id。             |
| InventoryWarningBService.getAllCommodity | `public CommodityVo[] getAllCommodity();` | 存在商品。             | 返回商品。                 |

需要的接口

| 接口名称                                     | 服务名       |
| ---------------------------------------- | --------- |
| `inventorydataservice.InventoryWarningDataService.submit(InventoryBillPo bill)` | 提交新单据。    |
| `inventorydataservice.InventoryWarningDataService.modify(CommodityPo commodity，double ModifyWarning)` | 修改警戒值。    |
| ` logbl.LogBl.log(LogSeverity severity, String content)` | 记录日志。     |
| `inventorydataservice.InventoryWarningDataService.query(InventoryBillQueryVo inventoryBillQueryVo)` | 查询符合条件单据。 |
| `commodityblservice.CommodityInfo.queryCommodity(CommodityQueryVo commodityQueryVo)` | 获取商品。     |



**InventoryBillInfo**

提供的接口

| 接口名称                             | 语法                                       | 前置条件       | 后置条件          |
| -------------------------------- | ---------------------------------------- | ---------- | ------------- |
| InventoryInfo.queryInventoryBill | `public InventoryBillVo[] queryInventoryBill(InventoryBillQueryVo inventoryBillQueryVo);` | 其他类需要单据信息。 | 返回所需单据的持久化对象。 |

需要的接口

| 接口名称                                     | 服务名               |
| ---------------------------------------- | ----------------- |
| `inventoryBldataservice.InventoryWarningBlService.query(InventoryBillQueryVo inventoryBillQueryVo)` | 根据ID和/或名称模糊化查询单据。 |

###  