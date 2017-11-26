### 2.3.12 promotiondata包

#### 2.3.12.1 概述

promtiondata包负责总经理制定促销策略（包括组合商品降价、满额促销策略（赠送商品或者代金券）、客户促销策略（赠送礼品或者代金券或者价格这让））用例的数据操作。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.3.12.2 整体结构

此包为数据层的一部分，它负责数据存储以及与bl层的交互。它依赖对应的promotiondataservice包与bl层进行交互。

#### 2.3.12.3 设计

##### 2.3.12.3.1 设计图

![promotiondata](../../img/设计图/promotiondata.png)

##### 2.3.12.3.2 各个类的职责

| 类名                                | 职责                                 |
| --------------------------------- | ---------------------------------- |
| ComSalePromotionDataController    | 负责管理填写组合商品降价促销策略的数据操作。             |
| TotalPricePromotionDataController | 负责管理填写满额促销策略（赠送礼品或者代金券）的数据操作。      |
| ClientPromotionDataController     | 负责管理填写客户促销策略（赠送礼品或者代金券或价格折让）的数据操作。 |

##### 2.3.12.3.3 内部类的接口规范

**ComSalePromotionDataController**

提供的接口

| 接口名称                                     | 语法                                       | 前置条件                     | 后置条件                    |
| ---------------------------------------- | ---------------------------------------- | ------------------------ | ----------------------- |
| ComSalePromotionDataService.submit       | `public ResultMessage submit(ComSalePromotionPo promotion);` | 促销策略所有属性有效，与已有促销策略不产生冲突。 | 保存组合商品降价促销策略持久化对象数据。    |
| ComSalePromotionDataService.queryPromotion; | `public ComSalePromotionPo[] queryPromotion(ComSalePromotionQueryVo query);` | 输入有效，其中值为null的字段表示无限制。   | 返回符合筛选条件的Promotion对象数组。 |
| ComSalePromotionDataService.delete       | `public ResultMessage delete(String id);` | 无。                       | 系统修改促销策略状态，更新并保存持久化信息。  |
| ComSalePromotionDataService.getId        | `public String getId();`                 | 无。                       | 返回当前促销策略对象的ID。          |

**TotalPricePromotionDataController**

| 接口名称                                     | 语法                                       | 前置条件                     | 后置条件                    |
| ---------------------------------------- | ---------------------------------------- | ------------------------ | ----------------------- |
| TotalPricePromotionDataService.submit    | `public ResultMessage submit(TotalPricePromotionPo promotion);` | 促销策略所有属性有效，与已有促销策略不产生冲突。 | 保存组合商品降价促销策略持久化对象数据。    |
| TotalPricePromotionDataService.queryPromotion | `public TotalPricePromotionPo[] queryPromotion(TotalPricePromotionQueryVo query);` | 输入有效，其中值为null的字段表示无限制。   | 返回符合筛选条件的Promotion对象数组。 |
| TotalPricePromotionDataService.delete    | `public ResultMessage delete(String id);` | 无。                       | 系统修改促销策略状态，更新并保存持久化信息。  |
| TotalPricePromotionDataService.getId     | `public String getId();`                 | 无。                       | 返回当前促销策略对象的ID。          |

**ClientPromotionDataController**

提供的接口

| 接口名称                                     | 语法                                       | 前置条件                     | 后置条件                    |
| ---------------------------------------- | ---------------------------------------- | ------------------------ | ----------------------- |
| ClientPromotionDataService.submit        | `public ResultMessage submit(ClientPromotionPo promotion);` | 促销策略所有属性有效，与已有促销策略不产生冲突。 | 保存组合商品降价促销策略持久化对象数据。    |
| ClientPromotionDataService.queryPromotion | `public ClientPromotionPo[] queryPromotion(ClientPromotionQueryVO query);` | 输入有效，其中值为null的字段表示无限制。   | 返回符合筛选条件的Promotion对象数组。 |
| ClientPromotionDataService.delete        | `public ResultMessage delete(String id);` | 无。                       | 系统修改促销策略状态，更新并保存持久化信息。  |
| ClientPromotionDataService.getId         | `public String getId();`                 | 无。                       | 返回当前促销策略对象的ID。          |

### 2.3.13 approvaldata包

#### 2.3.13.1 概述

approvaldata包负责总经理审批单据用例的数据操作。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.3.13.2 整体架构

此包为数据层的一部分，负责总经理审批单据时的数据操作。它实现了approvalblservice的所有接口。

#### 2.3.13.3 设计

##### 2.3.13.3.1 设计图

![approvaldata](../../img/设计图/approvaldata.png)

##### 2.3.13.3.2 各个类的职责

| 类名                  | 职责           |
| ------------------- | ------------ |
| AuditDataController | 负责管理审批单据的数据。 |

##### 2.3.13.3.3 内部类的接口规范

**AuditDataController**

提供的接口

| 接口名称                                | 语法                                       | 前置条件              | 后置条件                |
| ----------------------------------- | ---------------------------------------- | ----------------- | ------------------- |
| ApprovalDataService.query           | `public BillInfoPO[] query(BillInfoQueryVo query)` | po中存在处于提交状态的单据数据。 | 返回待审批单据简要信息。        |
| ApprovalDataService.reject          | `public ResultMessage reject(BillInfoPo billInfo);` | 无。                | 修改并保存单据简要信息持久化对象数据。 |
| ApprovalDataService.pass            | `public ResultMessage pass(BillInfoPo billInfo);` | 无。                | 修改并保存单据简要信息持久化对象数据。 |
| ApprovalDataService.requestApproval | `public ResultMessage requestApproval(BillPo bill);` | 有单据被提交。           | 返回保存结果。             |

