##### 2.2.12 promotionbl包

#### 2.2.12.1 概述

promtionbl包负责总经理制定促销策略（包括组合商品降价、满额赠送商品、满额赠送代金券、客户赠送礼品、客户赠送代金券以及客户价格这让）用例的业务逻辑实现代码。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.2.12.2 整体结构

此包为业务逻辑层的一部分，它负责业务逻辑的实现。它实现了promotionPromotionBlService包所需要的promotionblservice所有接口，并依赖对应的promotiondataservice包与data层进行交互。由于销售行为需要依赖促销策略，它还需要实现PromotionInfo接口。

#### 2.2.12.3 设计

##### 2.2.12.3.1 设计图

##### ![promotionbl](/Users/ricering/ERPnju/docs/详细设计文档/img/设计图/promotionbl.png)

##### 2.2.12.3.2 各个类的职责

| 类名                           | 职责                      |
| ---------------------------- | ----------------------- |
| PromotionBlControllerBase    | 填写促销策略的功能实现的基类。         |
| CommodityOnSaleBlController  | 负责管理填写组合商品降价促销策略的功能实现。  |
| TotalPriceCouponBlController | 负责管理填写满额赠送代金券促销策略的功能实现。 |
| TotalPriceGiftBlController   | 负责管理填写满额赠送礼品促销策略的功能实现。  |
| ClientCouponBlController     | 负责管理填写客户赠送代金券促销策略的功能实现。 |
| ClientGiftBlController       | 负责管理填写客户赠送礼品促销策略的功能实现。  |
| ClientOnSaleBlController     | 负责管理填写客户价格折让促销策略的功能实现。  |

**PromotionBlControllerBase**

提供的接口

| 接口名称                              | 语法                                       | 前置条件                                | 后置条件                    |
| --------------------------------- | ---------------------------------------- | ----------------------------------- | ----------------------- |
| PromotionBlService.submit         | `public ResultMessage submit(PromotionVOBase newPromotion);` | 促销策略所有属性有效。                         | 持久化促销策略信息已经保存。          |
| PromotionBlService.saveAsDraft    | `public ResultMessage saveAsDraft(PromotionVOBase promotion);` | 促销策略信息非空。                           | 保存草稿，持久化信息已经保存。         |
| PromotionBlService.queryPromotion | `public PromotionVOBase[] queryPromotion(PromotionQueryVO query);` | 输入的query不为空，其中值为null字段的为不限制，筛选条件有效。 | 返回符合条件的促销策略。            |
| PromotionBlService.delete         | `public ResultMessage delete(PromotionPOBase promotion);` | 选择删除促销策略。                           | 返回删除是否成功，持久化更新涉及的对象的数据。 |
| PromotionBlService.getId          | `public String getId();`                 | 新建促销策略。                             | 返回当前促销策略的ID。            |
| PromotionBlService.promotionInfo  | `public PromotionVoBase[] queryPromotion(SaleBillVo saleBill);` | 产生销售行为。                             | 返回可用的促销策略。              |

需要的接口

| 接口名称                                     | 服务名              |
| ---------------------------------------- | ---------------- |
| `promotiondataservice.PromotionManagementDataService.submit(PromotionPOBase promotion)` | 提交新促销策略。         |
| `promotiondataservice.PromotionManagementDataService.queryPromotion(PromotionQueryVO query)` | 根据不同的筛选条件查找促销策略。 |
| `promotiondataservice.PromotionManagementDataService.delete(PromotionPOBase promotion)` | 删除单一持久化对象。       |
| `promotiondataservice.PromotionManagementDataService.getId()` | 返回当前促销策略ID。      |
| `draftbl.DraftService.saveAsDraft(PaymentBillVo bill)` | 保存草稿。            |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。            |

**CommodityOnSaleBlController**

提供的接口

| 接口名称                              | 语法                                       | 前置条件                                | 后置条件                    |
| --------------------------------- | ---------------------------------------- | ----------------------------------- | ----------------------- |
| PromotionBlService.submit         | `public ResultMessage submit(CommodityOnSaleVo newPromotion);` | 促销策略所有属性有效。                         | 持久化促销策略信息已经保存。          |
| PromotionBlService.saveAsDraft    | `public ResultMessage saveAsDraft(CommodityOnSaleVo promotion);` | 促销策略信息非空。                           | 保存草稿，持久化信息已经保存。         |
| PromotionBlService.queryPromotion | `public PromotionVOBase[] queryPromotion(PromotionQueryVO query);` | 输入的query不为空，其中值为null字段的为不限制，筛选条件有效。 | 返回符合条件的促销策略。            |
| PromotionBlService.delete         | `public ResultMessage delete(CommodityOnSalePo promotion);` | 选择删除促销策略。                           | 返回删除是否成功，持久化更新涉及的对象的数据。 |
| PromotionBlService.queryCommodity | `public CommodityVO[] queryCommodity(CommodityQueryVO query);` | 输入的query不为空，其中值为null字段的为不限制，筛选条件有效。 | 返回符合条件的商品。              |
| PromotionBlService.getId          | `public String getId();`                 | 新建促销策略。                             | 返回当前促销策略的ID。            |
| PromotionBlService.promotionInfo  | `public CommodityOnSaleVo[] queryPromotion(SaleBillVo saleBill);` | 产生销售行为。                             | 返回可用的促销策略。              |

需要的接口

| 接口名称                                     | 服务名              |
| ---------------------------------------- | ---------------- |
| `promotiondataservice.PromotionManagementDataService.submit(PromotionPOBase promotion)` | 提交新促销策略。         |
| `promotiondataservice.PromotionManagementDataService.queryPromotion(PromotionQueryVO query)` | 根据不同的筛选条件查找促销策略。 |
| `promotiondataservice.PromotionManagementDataService.delete(PromotionPOBase promotion)` | 删除单一持久化对象。       |
| `promotiondataservice.PromotionManagementDataService.getId()` | 返回当前促销策略ID。      |
| `draftbl.DraftService.saveAsDraft(PaymentBillVo bill)` | 保存草稿。            |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。            |

**TotalPriceCouponBlController**

提供的接口

| 接口名称                              | 语法                                       | 前置条件                                | 后置条件                    |
| --------------------------------- | ---------------------------------------- | ----------------------------------- | ----------------------- |
| PromotionBlService.submit         | `public ResultMessage submit(TotalPriceCouponVo newPromotion);` | 促销策略所有属性有效。                         | 持久化促销策略信息已经保存。          |
| PromotionBlService.saveAsDraft    | `public ResultMessage saveAsDraft(TotalPriceCouponVo promotion);` | 促销策略信息非空。                           | 保存草稿，持久化信息已经保存。         |
| PromotionBlService.queryPromotion | `public PromotionVOBase[] queryPromotion(PromotionQueryVO query);` | 输入的query不为空，其中值为null字段的为不限制，筛选条件有效。 | 返回符合条件的促销策略。            |
| PromotionBlService.delete         | `public ResultMessage delete(TotalPriceCouponPo promotion);` | 选择删除促销策略。                           | 返回删除是否成功，持久化更新涉及的对象的数据。 |
| PromotionBlService.getId          | `public String getId();`                 | 新建促销策略。                             | 返回当前促销策略的ID。            |
| PromotionBlService.promotionInfo  | `public PromotionVoBase[] queryPromotion(SaleBillVo saleBill);` | 产生销售行为。                             | 返回可用的促销策略。              |

需要的接口

| 接口名称                                     | 服务名              |
| ---------------------------------------- | ---------------- |
| `promotiondataservice.PromotionManagementDataService.submit(PromotionPOBase promotion)` | 提交新促销策略。         |
| `promotiondataservice.PromotionManagementDataService.queryPromotion(PromotionQueryVO query)` | 根据不同的筛选条件查找促销策略。 |
| `promotiondataservice.PromotionManagementDataService.delete(PromotionPOBase promotion)` | 删除单一持久化对象。       |
| `promotiondataservice.PromotionManagementDataService.getId()` | 返回当前促销策略ID。      |
| `draftbl.DraftService.saveAsDraft(PaymentBillVo bill)` | 保存草稿。            |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。            |

**TotalPriceGiftBlController**

提供的接口

| 接口名称                              | 语法                                       | 前置条件                                | 后置条件                    |
| --------------------------------- | ---------------------------------------- | ----------------------------------- | ----------------------- |
| PromotionBlService.submit         | `public ResultMessage submit(TotalPriceGiftVo newPromotion);` | 促销策略所有属性有效。                         | 持久化促销策略信息已经保存。          |
| PromotionBlService.saveAsDraft    | `public ResultMessage saveAsDraft(TotalPriceGiftVo promotion);` | 促销策略信息非空。                           | 保存草稿，持久化信息已经保存。         |
| PromotionBlService.queryPromotion | `public PromotionVOBase[] queryPromotion(PromotionQueryVO query);` | 输入的query不为空，其中值为null字段的为不限制，筛选条件有效。 | 返回符合条件的促销策略。            |
| PromotionBlService.delete         | `public ResultMessage delete(TotalPriceGiftPo promotion);` | 选择删除促销策略。                           | 返回删除是否成功，持久化更新涉及的对象的数据。 |
| PromotionBlService.queryCommodity | `public CommodityVO[] queryCommodity(CommodityQueryVO query);` | 输入的query不为空，其中值为null字段的为不限制，筛选条件有效。 | 返回符合条件的商品。              |
| PromotionBlService.getId          | `public String getId();`                 | 新建促销策略。                             | 返回当前促销策略的ID。            |
| PromotionBlService.promotionInfo  | `public PromotionVoBase[] queryPromotion(SaleBillVo saleBill);` | 产生销售行为。                             | 返回可用的促销策略。              |

需要的接口

| 接口名称                                     | 服务名              |
| ---------------------------------------- | ---------------- |
| `promotiondataservice.PromotionManagementDataService.submit(PromotionPOBase promotion)` | 提交新促销策略。         |
| `promotiondataservice.PromotionManagementDataService.queryPromotion(PromotionQueryVO query)` | 根据不同的筛选条件查找促销策略。 |
| `promotiondataservice.PromotionManagementDataService.delete(PromotionPOBase promotion)` | 删除单一持久化对象。       |
| `promotiondataservice.PromotionManagementDataService.getId()` | 返回当前促销策略ID。      |
| `draftbl.DraftService.saveAsDraft(PaymentBillVo bill)` | 保存草稿。            |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。            |

**ClientCouponBlController**

提供的接口

| 接口名称                              | 语法                                       | 前置条件                                | 后置条件                    |
| --------------------------------- | ---------------------------------------- | ----------------------------------- | ----------------------- |
| PromotionBlService.submit         | `public ResultMessage submit(ClientCouponVo newPromotion);` | 促销策略所有属性有效。                         | 持久化促销策略信息已经保存。          |
| PromotionBlService.saveAsDraft    | `public ResultMessage saveAsDraft(ClientCouponVo promotion);` | 促销策略信息非空。                           | 保存草稿，持久化信息已经保存。         |
| PromotionBlService.queryPromotion | `public PromotionVOBase[] queryPromotion(PromotionQueryVO query);` | 输入的query不为空，其中值为null字段的为不限制，筛选条件有效。 | 返回符合条件的促销策略。            |
| PromotionBlService.delete         | `public ResultMessage delete(ClientCouponPo promotion);` | 选择删除促销策略。                           | 返回删除是否成功，持久化更新涉及的对象的数据。 |
| PromotionBlService.getId          | `public String getId();`                 | 新建促销策略。                             | 返回当前促销策略的ID。            |
| PromotionBlService.promotionInfo  | `public PromotionVoBase[] queryPromotion(SaleBillVo saleBill);` | 产生销售行为。                             | 返回可用的促销策略。              |

需要的接口

| 接口名称                                     | 服务名              |
| ---------------------------------------- | ---------------- |
| `promotiondataservice.PromotionManagementDataService.submit(PromotionPOBase promotion)` | 提交新促销策略。         |
| `promotiondataservice.PromotionManagementDataService.queryPromotion(PromotionQueryVO query)` | 根据不同的筛选条件查找促销策略。 |
| `promotiondataservice.PromotionManagementDataService.delete(PromotionPOBase promotion)` | 删除单一持久化对象。       |
| `promotiondataservice.PromotionManagementDataService.getId()` | 返回当前促销策略ID。      |
| `draftbl.DraftService.saveAsDraft(PaymentBillVo bill)` | 保存草稿。            |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。            |

**ClientGiftBlController**

提供的接口

| 接口名称                              | 语法                                       | 前置条件                                | 后置条件                    |
| --------------------------------- | ---------------------------------------- | ----------------------------------- | ----------------------- |
| PromotionBlService.submit         | `public ResultMessage submit(ClientGiftVo newPromotion);` | 促销策略所有属性有效。                         | 持久化促销策略信息已经保存。          |
| PromotionBlService.saveAsDraft    | `public ResultMessage saveAsDraft(ClientGiftVo promotion);` | 促销策略信息非空。                           | 保存草稿，持久化信息已经保存。         |
| PromotionBlService.queryPromotion | `public PromotionVOBase[] queryPromotion(PromotionQueryVO query);` | 输入的query不为空，其中值为null字段的为不限制，筛选条件有效。 | 返回符合条件的促销策略。            |
| PromotionBlService.delete         | `public ResultMessage delete(ClientGiftPo promotion);` | 选择删除促销策略。                           | 返回删除是否成功，持久化更新涉及的对象的数据。 |
| PromotionBlService.queryCommodity | `public CommodityVO[] queryCommodity(CommodityQueryVO query);` | 输入的query不为空，其中值为null字段的为不限制，筛选条件有效。 | 返回符合条件的商品。              |
| PromotionBlService.getId          | `public String getId();`                 | 新建促销策略。                             | 返回当前促销策略的ID。            |
| PromotionBlService.promotionInfo  | `public PromotionVoBase[] queryPromotion(SaleBillVo saleBill);` | 产生销售行为。                             | 返回可用的促销策略。              |

需要的接口

| 接口名称                                     | 服务名              |
| ---------------------------------------- | ---------------- |
| `promotiondataservice.PromotionManagementDataService.submit(PromotionPOBase promotion)` | 提交新促销策略。         |
| `promotiondataservice.PromotionManagementDataService.queryPromotion(PromotionQueryVO query)` | 根据不同的筛选条件查找促销策略。 |
| `promotiondataservice.PromotionManagementDataService.delete(PromotionPOBase promotion)` | 删除单一持久化对象。       |
| `promotiondataservice.PromotionManagementDataService.getId()` | 返回当前促销策略ID。      |
| `draftbl.DraftService.saveAsDraft(PaymentBillVo bill)` | 保存草稿。            |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。            |

**ClientOnSaleBlController**

提供的接口

| 接口名称                              | 语法                                       | 前置条件                                | 后置条件                    |
| --------------------------------- | ---------------------------------------- | ----------------------------------- | ----------------------- |
| PromotionBlService.submit         | `public ResultMessage submit(ClientOnSaleVo newPromotion);` | 促销策略所有属性有效。                         | 持久化促销策略信息已经保存。          |
| PromotionBlService.saveAsDraft    | `public ResultMessage saveAsDraft(ClientOnSaleVo promotion);` | 促销策略信息非空。                           | 保存草稿，持久化信息已经保存。         |
| PromotionBlService.queryPromotion | `public PromotionVOBase[] queryPromotion(PromotionQueryVO query);` | 输入的query不为空，其中值为null字段的为不限制，筛选条件有效。 | 返回符合条件的促销策略。            |
| PromotionBlService.delete         | `public ResultMessage delete(ClientOnSalePo promotion);` | 选择删除促销策略。                           | 返回删除是否成功，持久化更新涉及的对象的数据。 |
| PromotionBlService.getId          | `public String getId();`                 | 新建促销策略。                             | 返回当前促销策略的ID。            |
| PromotionBlService.promotionInfo  | `public PromotionVoBase[] queryPromotion(SaleBillVo saleBill);` | 产生销售行为。                             | 返回可用的促销策略。              |

需要的接口

| 接口名称                                     | 服务名              |
| ---------------------------------------- | ---------------- |
| `promotiondataservice.PromotionManagementDataService.submit(PromotionPOBase promotion)` | 提交新促销策略。         |
| `promotiondataservice.PromotionManagementDataService.queryPromotion(PromotionQueryVO query)` | 根据不同的筛选条件查找促销策略。 |
| `promotiondataservice.PromotionManagementDataService.delete(PromotionPOBase promotion)` | 删除单一持久化对象。       |
| `promotiondataservice.PromotionManagementDataService.getId()` | 返回当前促销策略ID。      |
| `draftbl.DraftService.saveAsDraft(PaymentBillVo bill)` | 保存草稿。            |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。            |



### 2.2.13 approvalbl包

#### 2.2.13.1 概述

approvalbl包负责总经理审批单据用例的业务逻辑实现代码。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.2.13.2 整体架构

此包为业务逻辑层的一部分，它负责业务逻辑的实现。它实现了approvalui包所需要的approvalblservice的所有接口，并依赖approvaldataservice包与data层进行交互。

#### 2.2.13.3 设计

##### 2.2.13.3.1 设计图

![approvalbl](/Users/ricering/ERPnju/docs/详细设计文档/img/设计图/approvalbl.png)



##### 2.2.13.3.2 各个类的职责

| 类名                | 职责                |
| ----------------- | ----------------- |
| AuditBlController | 负责管理审批单据界面的展示和功能。 |

**AuditBlController**

提供的接口

| 接口名称                           | 语法                                       | 前置条件          | 后置条件                  |
| ------------------------------ | ---------------------------------------- | ------------- | --------------------- |
| AuditBlService.query           | `public ResultMessage  show (BillQueryVO query);` | 有处于提交状态的单据单据。 | 返回符合条件的单据。            |
| AuditBlService.reject          | `public ResultMessage reject(BillVO bill);` | 用户已经查看了单据内容。  | 拒绝通过审批，持久化更新涉及的对象的数据。 |
| AuditBlService.pass            | `public ResultMessage pass(BillVO bill);` | 用户已经查看了单据内容。  | 通过审批，持久化更新涉及的对象的数据。   |
| ApprovalRequest.requestMessage | `public ResultMessage requestMessage(BillVo bill);` | 用户提交了单据。      | 保存单据并返回保存结果。          |

需要的接口

| 接口名称                                     | 服务名          |
| ---------------------------------------- | ------------ |
| `approvaldataservice.AuditDataService.query(BillQueryVo query)` | 得到待审批的持久化对象。 |
| `approvaldataservice.AuditDataService.reject(BillPO bill)` | 拒绝通过审批。      |
| `approvaldataservice.AuditDataService.pass(BillPO bill)` | 通过审批。        |
| `approvaldataservice.ApprovalRequest(BillPo bill)` | 保存提交的单据。     |
| `notificationbl.NotificationService.addNotification(NotificationVo notification);` | 新增一条通知。      |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。        |

