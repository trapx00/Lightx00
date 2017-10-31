### 2.1.12 promotionui包

#### 2.1.12.1 概述

promtionui包负责总经理制定促销策略（包括组合商品降价、满额赠送商品、满额赠送代金券、客户赠送礼品、客户赠送代金券以及客户价格这让）用例的UI界面以及相应控制代码。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.1.12.2 整体结构

此包为展示层的一部分，它负责展示信息以及与用户的交互。它依赖对应的promotiondataservice包与bl层进行交互。由于它具有填写促销策略的功能，为了实现草稿箱和编辑功能，它需要实现ContinueWritable接口。涉及商品的促销策略需要选择商品，它还依赖commodityui包所提供的选择商品的接口。

#### 2.1.12.3 设计

##### 2.1.12.3.1 设计图

![promotionui](../../img/设计图/promotionui.png)

##### 2.1.12.3.2 各个类的职责

| 类名                           | 职责                         |
| ---------------------------- | -------------------------- |
| PromotionUiController        | 负责管理各促销策略控制器的职责。           |
| CommodityOnSaleUiController  | 负责管理填写组合商品降价促销策略界面的展示和功能。  |
| TotalPriceCouponUiController | 负责管理填写满额赠送代金券促销策略界面的展示和功能。 |
| TotalPriceGiftUiController   | 负责管理填写满额赠送礼品促销策略界面的展示和功能。  |
| ClientCouponUiController     | 负责管理填写客户赠送代金券促销策略界面的展示和功能。 |
| ClientGiftUiController       | 负责管理填写客户赠送礼品促销策略界面的展示和功能。  |
| ClientOnSaleUiController     | 负责管理填写客户价格折让促销策略界面的展示和功能。  |

##### 2.1.12.3.3 内部类的接口规范

**PromotionUiController**

提供的接口

| 接口名称                             | 语法                                       | 前置条件             | 后置条件          |
| -------------------------------- | ---------------------------------------- | ---------------- | ------------- |
| ContinueWritable.continueWriting | `public CommodityOnSaleUiController continueWriting(PromotionVoBase promotion);` | 输入有效的用于继续填写促销策略。 | 初始化传入促销策略的内容。 |

需要的接口

| 接口名称                                     | 服务名              |
| ---------------------------------------- | ---------------- |
| `promotionblservice.PromotionManagementBlService.submit(PromotionVoBase promotion) ` | 提交促销策略。          |
| `promotionblservice.PromotionManagementBlService.saveAsDraft(PromotionVoBase promotion)` | 保存促销策略草稿。        |
| `promotionblservice.PromotionManagementBlService.queryPromotion(PromotionQueryVO query)` | 根据不同的筛选条件查找促销策略。 |
| `promotionblservice.PromotionManagementBlService.delete(PromotionVoBase promotion)` | 删除单一持久化对象。       |
| `promotionblservice.PromotionManaementBlService.getId()` | 获得当前促销策略的ID。     |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。            |

**CommodityOnSaleUiController**

提供的接口

| 接口名称                             | 语法                                       | 前置条件             | 后置条件          |
| -------------------------------- | ---------------------------------------- | ---------------- | ------------- |
| ContinueWritable.continueWriting | `public CommodityOnSaleUiController continueWriting(CommodityOnSaleVo promotion);` | 输入有效的用于继续填写促销策略。 | 初始化传入促销策略的内容。 |

需要的接口

| 接口名称                                     | 服务名              |
| ---------------------------------------- | ---------------- |
| `commodityui.CommodityInfoUi.showCommoditySelectDialog()` | 选择商品。            |
| `promotionblservice.PromotionManagementBlService.submit(CommodityOnSaleVo promotion) ` | 提交促销策略。          |
| `promotionblservice.PromotionManagementBlService.saveAsDraft(CommodityOnSaleVo promotion)` | 保存促销策略草稿。        |
| `promotionblservice.PromotionManagementBlService.queryPromotion(PromotionQueryVO query)` | 根据不同的筛选条件查找促销策略。 |
| `promotionblservice.PromotionManagementBlService.delete(CommodityOnSaleVo promotion)` | 删除单一持久化对象。       |
| `promotionblservice.PromotionManaementBlService.getId()` | 获得当前促销策略的ID。     |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。            |

**TotalPriceCouponUiController**

提供的接口

| 接口名称                             | 语法                                       | 前置条件             | 后置条件          |
| -------------------------------- | ---------------------------------------- | ---------------- | ------------- |
| ContinueWritable.continueWriting | `public TotalPriceCouponUiController continueWriting(TotalPriceCouponVo promotion);` | 输入有效的用于继续填写促销策略。 | 初始化传入促销策略的内容。 |

需要的接口

| 接口名称                                     | 服务名              |
| ---------------------------------------- | ---------------- |
| `promotionblservice.PromotionManagementBlService.submit(TotalPriceCouponVo promotion) ` | 提交促销策略。          |
| `promotionblservice.PromotionManagementBlService.saveAsDraft(TotalPriceCouponVo promotion)` | 保存促销策略草稿。        |
| `promotionblservice.PromotionManagementBlService.queryPromotion(PromotionQueryVO query)` | 根据不同的筛选条件查找促销策略。 |
| `promotionblservice.PromotionManagementBlService.delete(TotalPriceCouponVo promotion)` | 删除单一持久化对象。       |
| `promotionblservice.PromotionManaementBlService.getId()` | 获得当前促销策略的ID。     |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。            |

**TotalPriceGiftUiController**

提供的接口

| 接口名称                             | 语法                                       | 前置条件             | 后置条件          |
| -------------------------------- | ---------------------------------------- | ---------------- | ------------- |
| ContinueWritable.continueWriting | `public TotalPriceGiftUiController continueWriting(TotalPriceGiftVo promotion);` | 输入有效的用于继续填写促销策略。 | 初始化传入促销策略的内容。 |

需要的接口

| 接口名称                                     | 服务名              |
| ---------------------------------------- | ---------------- |
| `commodityui.CommodityInfoUi.showCommoditySelectDialog()` | 选择商品。            |
| `promotionblservice.PromotionManagementBlService.submit(TotalPriceGiftVo promotion) ` | 提交促销策略。          |
| `promotionblservice.PromotionManagementBlService.saveAsDraft(TotalPriceGiftVo promotion)` | 保存促销策略草稿。        |
| `promotionblservice.PromotionManagementBlService.queryPromotion(PromotionQueryVO query)` | 根据不同的筛选条件查找促销策略。 |
| `promotionblservice.PromotionManagementBlService.delete(TotalPriceGiftVo promotion)` | 删除单一持久化对象。       |
| `promotionblservice.PromotionManaementBlService.getId()` | 获得当前促销策略的ID。     |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。            |

**ClientCouponUiController**

提供的接口

| 接口名称                             | 语法                                       | 前置条件             | 后置条件          |
| -------------------------------- | ---------------------------------------- | ---------------- | ------------- |
| ContinueWritable.continueWriting | `public ClientCouponUiController continueWriting(ClientCouponVo promotion);` | 输入有效的用于继续填写促销策略。 | 初始化传入促销策略的内容。 |

需要的接口

| 接口名称                                     | 服务名              |
| ---------------------------------------- | ---------------- |
| `promotionblservice.PromotionManagementBlService.submit(ClientCouponVo promotion) ` | 提交促销策略。          |
| `promotionblservice.PromotionManagementBlService.saveAsDraft(ClientCouponVo promotion)` | 保存促销策略草稿。        |
| `promotionblservice.PromotionManagementBlService.queryPromotion(PromotionQueryVO query)` | 根据不同的筛选条件查找促销策略。 |
| `promotionblservice.PromotionManagementBlService.delete(ClientCouponVo promotion)` | 删除单一持久化对象。       |
| `promotionblservice.PromotionManaementBlService.getId()` | 获得当前促销策略的ID。     |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。            |

**ClientGiftUiController**

提供的接口

| 接口名称                             | 语法                                       | 前置条件             | 后置条件          |
| -------------------------------- | ---------------------------------------- | ---------------- | ------------- |
| ContinueWritable.continueWriting | `public ClientGiftUiController continueWriting(ClientGiftVo promotion);` | 输入有效的用于继续填写促销策略。 | 初始化传入促销策略的内容。 |

需要的接口

| 接口名称                                     | 服务名              |
| ---------------------------------------- | ---------------- |
| `commodityui.CommodityInfoUi.showCommoditySelectDialog()` | 选择商品。            |
| `promotionblservice.PromotionManagementBlService.submit(ClientGiftVo promotion) ` | 提交促销策略。          |
| `promotionblservice.PromotionManagementBlService.saveAsDraft(ClientGiftVo promotion)` | 保存促销策略草稿。        |
| `promotionblservice.PromotionManagementBlService.queryPromotion(PromotionQueryVO query)` | 根据不同的筛选条件查找促销策略。 |
| `promotionblservice.PromotionManagementBlService.delete(ClientGiftVo promotion)` | 删除单一持久化对象。       |
| `promotionblservice.PromotionManaementBlService.getId()` | 获得当前促销策略的ID。     |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志             |

**ClientOnSaleUiController**

提供的接口

| 接口名称                             | 语法                                       | 前置条件             | 后置条件          |
| -------------------------------- | ---------------------------------------- | ---------------- | ------------- |
| ContinueWritable.continueWriting | `public ClientOnSaleUiController continueWriting(ClientOnSaleVo promotion);` | 输入有效的用于继续填写促销策略。 | 初始化传入促销策略的内容。 |

需要的接口

| 接口名称                                     | 服务名              |
| ---------------------------------------- | ---------------- |
| `promotionblservice.PromotionManagementBlService.submit(ClientOnSaleVo promotion) ` | 提交促销策略。          |
| `promotionblservice.PromotionManagementBlService.saveAsDraft(ClientOnSaleVo promotion)` | 保存促销策略草稿。        |
| `promotionblservice.PromotionManagementBlService.queryPromotion(PromotionQueryVO query)` | 根据不同的筛选条件查找促销策略。 |
| `promotionblservice.PromotionManagementBlService.delete(ClientOnSaleVo promotion)` | 删除单一持久化对象。       |
| `promotionblservice.PromotionManaementBlService.getId()` | 获得当前促销策略的ID。     |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志             |



### 2.1.13 approvalui包

#### 2.1.13.1 概述

approvalui包负责总经理单据审批用例的UI界面以及响应控制代码。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.1.13.2 整体结构

此包为展示层的一部分，它负责展示信息以及与用户的交互。它依赖对应的approvalblservice包与bl层进行交互。

#### 2.1.13.3 设计

##### 2.1.13.3.1 设计图

![approvalui](../../img/设计图/approvalui.png)

##### 2.1.13.3.2 各个类的职责

| 类名                | 职责                |
| ----------------- | ----------------- |
| AuditUiController | 负责管理审批单据界面的展示和功能。 |

##### 2.2.13.3.3 内部类的接口规范

**AuditUiController**

提供的接口

无

需要的接口

| 接口名称                                     | 服务名     |
| ---------------------------------------- | ------- |
| `approvalblservice.AuditBlService.query(BillQueryVO query)` | 查询单据信息。 |
| `approvalblservice.AuditBlService.reject(BillVO bill)` | 拒绝通过审批。 |
| `approvalblservice.AuditBlService.pass(BillVO bill)` | 通过审批。   |

