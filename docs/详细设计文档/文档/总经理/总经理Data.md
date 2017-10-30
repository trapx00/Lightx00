### 2.3.12 promotiondata包

#### 2.3.12.1 概述

promtiondata包负责总经理制定促销策略（包括组合商品降价、满额赠送商品、满额赠送代金券、客户赠送礼品、客户赠送代金券以及客户价格这让）用例的数据操作。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.3.12.2 整体结构

此包为数据层的一部分，它负责数据存储以及与bl层的交互。它依赖对应的promotiondataservice包与bl层进行交互。由于它具有填写促销策略的功能，为了实现草稿箱和编辑功能，它还需要实现ContinueWritable接口。

#### 2.3.12.3 设计

##### 2.3.12.3.1 设计图

![promotiondata](/Users/ricering/ERPnju/docs/详细设计文档/img/设计图/promotiondata.png)

##### 2.3.12.3.2 各个类的职责

| 类名                             | 职责                      |
| ------------------------------ | ----------------------- |
| PromotionDataControllerBase    | 管理促销策略数据操作的基类。          |
| CommodityOnSaleDataController  | 负责管理填写组合商品降价促销策略的数据操作。  |
| TotalPriceCouponDataController | 负责管理填写满额赠送代金券促销策略的数据操作。 |
| TotalPriceGiftDataController   | 负责管理填写满额赠送礼品促销策略的数据操作。  |
| ClientCouponDataController     | 负责管理填写客户赠送代金券促销策略的数据操作。 |
| ClientGiftDataController       | 负责管理填写客户赠送礼品促销策略的数据操作。  |
| ClientOnSaleDataController     | 负责管理填写客户价格折让促销策略的数据操作。  |

**PromotionDataControllerBase**

| 接口名称                                 | 语法                                       | 前置条件                     | 后置条件                    |
| ------------------------------------ | ---------------------------------------- | ------------------------ | ----------------------- |
| PromotionDataService.submit          | `public ResultMessage submit(PromotionPoBase promotion);` | 促销策略所有属性有效，与已有促销策略不产生冲突。 | 保存组合商品降价促销策略持久化对象数据。    |
| PromotionDataService.queryPromotion; | `public PromotionPOBase[] queryPromotion(PromotionQueryVO query);` | 输入有效，其中值为null的字段表示无限制。   | 返回符合筛选条件的Promotion对象数组。 |
| PromotionDataService.delete          | `public ResultMessage delete(PromotionPoBase promotion);` | 无。                       | 系统修改促销策略状态，更新并保存持久化信息。  |
| PromotionDataService.getId           | `public String getId();`                 | 无。                       | 返回当前促销策略对象的ID。          |

**CommodityOnSaleDataController**

提供的接口

| 接口名称                                 | 语法                                       | 前置条件                     | 后置条件                    |
| ------------------------------------ | ---------------------------------------- | ------------------------ | ----------------------- |
| PromotionDataService.submit          | `public ResultMessage submit(CommodityOnSalePo promotion);` | 促销策略所有属性有效，与已有促销策略不产生冲突。 | 保存组合商品降价促销策略持久化对象数据。    |
| PromotionDataService.queryPromotion; | `public PromotionPOBase[] queryPromotion(PromotionQueryVO query);` | 输入有效，其中值为null的字段表示无限制。   | 返回符合筛选条件的Promotion对象数组。 |
| PromotionDataService.delete          | `public ResultMessage delete(CommodityOnSalePo promotion);` | 无。                       | 系统修改促销策略状态，更新并保存持久化信息。  |
| PromotionDataService.getId           | `public String getId();`                 | 无。                       | 返回当前促销策略对象的ID。          |

**TotalPriceCouponDataController**

| 接口名称                                 | 语法                                       | 前置条件                     | 后置条件                    |
| ------------------------------------ | ---------------------------------------- | ------------------------ | ----------------------- |
| PromotionDataService.submit          | `public ResultMessage submit(TotalPriceCouponPo promotion);` | 促销策略所有属性有效，与已有促销策略不产生冲突。 | 保存组合商品降价促销策略持久化对象数据。    |
| PromotionDataService.queryPromotion; | `public PromotionPOBase[] queryPromotion(PromotionQueryVO query);` | 输入有效，其中值为null的字段表示无限制。   | 返回符合筛选条件的Promotion对象数组。 |
| PromotionDataService.delete          | `public ResultMessage delete(TotalPriceCouponPo promotion);` | 无。                       | 系统修改促销策略状态，更新并保存持久化信息。  |
| PromotionDataService.getId           | `public String getId();`                 | 无。                       | 返回当前促销策略对象的ID。          |

**TotalPriceGiftDataController**

提供的接口

| 接口名称                                 | 语法                                       | 前置条件                     | 后置条件                    |
| ------------------------------------ | ---------------------------------------- | ------------------------ | ----------------------- |
| PromotionDataService.submit          | `public ResultMessage submit(TotalPriceGiftPo promotion);` | 促销策略所有属性有效，与已有促销策略不产生冲突。 | 保存组合商品降价促销策略持久化对象数据。    |
| PromotionDataService.queryPromotion; | `public PromotionPOBase[] queryPromotion(PromotionQueryVO query);` | 输入有效，其中值为null的字段表示无限制。   | 返回符合筛选条件的Promotion对象数组。 |
| PromotionDataService.delete          | `public ResultMessage delete(TotalPriceGiftPo promotion);` | 无。                       | 系统修改促销策略状态，更新并保存持久化信息。  |
| PromotionDataService.queryCommodity; | `public CommodityPO[] queryCommodity(CommodityQueryVO query);` | 输入有效，其中值为null的字段表示无限制。   | 返回符合筛选条件的Commoidty对象数组。 |
| PromotionDataService.getId           | `public String getId();`                 | 无。                       | 返回当前促销策略对象的ID。          |

**ClientCouponDataController**

| 接口名称                                 | 语法                                       | 前置条件                     | 后置条件                    |
| ------------------------------------ | ---------------------------------------- | ------------------------ | ----------------------- |
| PromotionDataService.submit          | `public ResultMessage submit(ClientCouponPo promotion);` | 促销策略所有属性有效，与已有促销策略不产生冲突。 | 保存组合商品降价促销策略持久化对象数据。    |
| PromotionDataService.queryPromotion; | `public PromotionPOBase[] queryPromotion(PromotionQueryVO query);` | 输入有效，其中值为null的字段表示无限制。   | 返回符合筛选条件的Promotion对象数组。 |
| PromotionDataService.delete          | `public ResultMessage delete(ClientCouponPo promotion);` | 无。                       | 系统修改促销策略状态，更新并保存持久化信息。  |
| PromotionDataService.getId           | `public String getId();`                 | 无。                       | 返回当前促销策略对象的ID。          |

**ClientGiftDataController**

| 接口名称                                 | 语法                                       | 前置条件                     | 后置条件                    |
| ------------------------------------ | ---------------------------------------- | ------------------------ | ----------------------- |
| PromotionDataService.submit          | `public ResultMessage submit(ClientGiftPo promotion);` | 促销策略所有属性有效，与已有促销策略不产生冲突。 | 保存组合商品降价促销策略持久化对象数据。    |
| PromotionDataService.queryPromotion; | `public PromotionPOBase[] queryPromotion(PromotionQueryVO query);` | 输入有效，其中值为null的字段表示无限制。   | 返回符合筛选条件的Promotion对象数组。 |
| PromotionDataService.delete          | `public ResultMessage delete(ClientGiftPo promotion);` | 无。                       | 系统修改促销策略状态，更新并保存持久化信息。  |
| PromotionDataService.getId           | `public String getId();`                 | 无。                       | 返回当前促销策略对象的ID。          |

**ClientOnSaleDataController**

| 接口名称                                 | 语法                                       | 前置条件                     | 后置条件                    |
| ------------------------------------ | ---------------------------------------- | ------------------------ | ----------------------- |
| PromotionDataService.submit          | `public ResultMessage submit(ClientOnSalePo promotion);` | 促销策略所有属性有效，与已有促销策略不产生冲突。 | 保存组合商品降价促销策略持久化对象数据。    |
| PromotionDataService.queryPromotion; | `public PromotionPOBase[] queryPromotion(PromotionQueryVO query);` | 输入有效，其中值为null的字段表示无限制。   | 返回符合筛选条件的Promotion对象数组。 |
| PromotionDataService.delete          | `public ResultMessage delete(ClientOnSalePo promotion);` | 无。                       | 系统修改促销策略状态，更新并保存持久化信息。  |
| PromotionDataService.getId           | `public String getId();`                 | 无。                       | 返回当前促销策略对象的ID。          |

### 2.3.13 approvaldata包

#### 2.3.13.1 概述

approvaldata包负责总经理审批单据用例的数据操作。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.3.13.2 整体架构

此包为数据层的一部分，负责总经理审批单据时的数据操作。它实现了approvalblservice的所有接口。

#### 2.3.13.3 设计

##### 2.3.13.3.1 设计图

![approvaldata](/Users/ricering/ERPnju/docs/详细设计文档/img/设计图/approvaldata.png)

##### 2.3.13.3.2 各个类的职责

| 类名                  | 职责           |
| ------------------- | ------------ |
| AuditDataController | 负责管理审批单据的数据。 |

**AuditDataController**

提供的接口

| 接口名称                       | 语法                                       | 前置条件              | 后置条件            |
| -------------------------- | ---------------------------------------- | ----------------- | --------------- |
| ApprovalDataService.query  | `public BillVO[] query(BillQueryVo query)` | po中存在处于提交状态的单据数据。 | 返回待审批单据。        |
| ApprovalDataService.reject | `public ResultMessage reject(BillPO bill);` | 无。                | 修改并保存单据持久化对象数据。 |
| ApprovalDataService.pass   | `public ResultMessage pass(BillPO bill);` | 无。                | 修改并保存单据持久化对象数据。 |
| ApprovalDataService.save   | `public ResultMessage save(BillPo bill);` | 有单据被提交。           | 返回保存结果。         |

