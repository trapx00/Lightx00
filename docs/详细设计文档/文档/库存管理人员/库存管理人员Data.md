### 2.3.1 commoditydata包

#### 2.3.1.1 概述

commoditydata包负责库存管理人员商品管理、商品分类管理的业务逻辑实现代码。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.3.1.2 整体架构

此包为数据层的一部分，负责负责库存管理人员商品管理、商品分类管理的数据操作。它实现了commoditydataservice的所有接口。

#### 2.3.1.3 设计

##### 2.3.1.3.1 设计图

![commoditydata](/img/设计图/commoditydata.png)

##### 2.3.1.3.2 各个类的职责

| 类名                          | 职责                |
| --------------------------- | ----------------- |
| CommodityDataController     | 负责实现商品管理界面的功能实现   |
| CommoditySortDataController | 负责实现商品分类管理界面的功能实现 |

##### 2.3.1.3.3 各个类的内部接口

**CommodityDataController**

提供的接口

| 接口名称                              | 语法                                       | 前置条件          | 后置条件         |
| --------------------------------- | ---------------------------------------- | ------------- | ------------ |
| GoodsManagementDataService.add    | `public ResultMessage add(CommodityPo newCommodity);` | 同样的po在数据中不存在。 | 增加一条po数据。    |
| GoodsManagementDataService.modify | `public ResultMessage modify(CommodityPo updateCommodity);` | 同样的po在数据中存。   | 更新po。        |
| GoodsManagementDataService.query  | `public CommodityPo[] query(CommodityQueryVo query;` | 查询输入格式合法。     | 返回符合查询条件的数据。 |
| GoodsManagementDataService.delete | `public ResultMessage delete(CommodityPo commodity);` | 同样的po在数据中存在。  | 删除po。        |
| GoodsManagementDataService.init   | `public void init();`                    | 无。            | 初始化持久数据。     |

**CommoditySortDataController**

提供的接口

| 接口名称                                 | 语法                                       | 前置条件          | 后置条件         |
| ------------------------------------ | ---------------------------------------- | ------------- | ------------ |
| ProductManagementDataService.add     | `public ResultMessage add(CommoditySortPo newCSort,CommoditySortPo parentSort);` | 同样的po在数据中不存在。 | 增加一条po数据。    |
| ProductManagementDataService.modify  | `public ResultMessage modify(CommoditySortPo  CSort);` | 同样的po在数据中存。   | 更新po。        |
| ProductManagementDataService.query   | `public CommoditySortPo[] query(CommoditySortQueryVo,commoditySortQueryVo);` | 查询输入格式合法。     | 返回符合查询条件的数据。 |
| ProductManagementDataService.delete  | `public ResultMessage delete(CommoditySortPo  CSort);` | 同样的po在数据中存在。  | 删除po。        |
| ProductManagementDataService.display | `public CommoditySortPo[] display();`    | 无。	返回所有商品分类。  |              |
| ProductManagementDataService.display | `public CommoditySortPo[] dispaly(CommoditySortPo commoditySort);` | 同样的po在数据中存在。  | 返回父类下的所有子类。  |
| ProductManagementDataService.init    | `public void init();`                    | 无。            | 初始化持久数据。     |





### 2.3.2 inventorydata包

#### 2.3.7.1 概述

Inventorydata包负责库存的数据操作。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.3.7.2 整体架构

此包为数据层的一个部分，负责库存管理的数据操作。它实现了dataservice层的所有接口。

#### 2.3.7.3 设计

##### 2.3.7.3.1 设计图

![inventorydata](/img/设计图/inventorydata.png)

##### 2.3.7.3.2 各个类的职责

##### 

| 类名                             | 职责           |
| ------------------------------ | ------------ |
| InventoryCheckDataController   | 负责库存查看功能的实现。 |
| InventoryGiftDataController    | 负责商品赠送功能的实现。 |
| InventoryWarningDataController | 负责库存监控功能的实现。 |

##### 



##### 2.3.7.3.3 内部类的接口规范

**InventoryCheckDataController**

提供的接口

| 接口名称                              | 语法                                       | 前置条件          | 后置条件                         |
| --------------------------------- | ---------------------------------------- | ------------- | ---------------------------- |
| InventoryCheckDataService.check   | `public InventoryViewPo submit(Date beginTime, Date endTime);` | 当天有库存进出且输入有效。 | 返回对应的InventoryViewPo。        |
| InventoryCheckDataService.picture | `public InventoryPicturePo submit(Date time);` | 当天有库存快照。      | 返回对应的库存快照InventoryPicturePo。 |
| InventoryCheckDataService.init    | `public void init(); `                   | 无。            | 初始化持久数据。                     |


**InventoryGiftDataController**

提供的接口

| 接口名称                             | 语法                                       | 前置条件  | 后置条件                                 |
| -------------------------------- | ---------------------------------------- | ----- | ------------------------------------ |
| InventoryGiftDataService.getGift | `public InventoryGiftPo getGift(Date time);` | 输入有效。 | 若存在则返回符合条件的InventoryGiftPo，否则返回NULL。 |
| InventoryGiftDataService.init    | `public void init();`                    | 无。    | 初始化持久数据。                             |
| InventoryGiftDataService.submit  | `public ResultMessage submit(InventoryGiftPo inventoryGiftpo);` | 输入有效。 | 完成赠送单，返回完成是否成功。                      |

**InventoryWarningDataController**

提供的接口

| 接口名称                                    | 语法                                       | 前置条件         | 后置条件                                     |
| --------------------------------------- | ---------------------------------------- | ------------ | ---------------------------------------- |
| InventoryWarningDataService.submit      | `public ResultMessage submit(InventoryBillPo bill);` | 单据属性有效。      | 提交新单据，返回提交是否成功。                          |
| InventoryWarningDataService.modify      | `public ResultMessage modify(CommodityPo commodity，double ModifyWarning);` | 同样的po在数据中存在。 | 更新po,修改警戒值。                              |
| InventoryWarningDataService.getAlarm    | `public InventoryBillPo[] getAlarmByIds(String... ids);` | 输入有效。        | 返回InventoryBillPo对象集合，若ID为空或者null，返回空数组。 |
| InventoryWarningDataService.getOverflow | `public InventoryBillPo[] getOverflowByids(String... ids);	` | 输入有效。        | 返回InventoryBillPo对象集合，若ID为空或者null，返回空数组。 |
| InventoryWarningDataService.getLoss     | `public InventoryBillPo[] getLossByids(String... ids);` | 输入有效。        | 返回InventoryBillPo对象集合，若ID为空或者null，返回空数组。 |
| InventoryWarningDataService.init        | `public void init();`                    | 无。           | 初始化持久数据。                                 |


