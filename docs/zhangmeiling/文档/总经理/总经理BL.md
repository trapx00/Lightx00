### 2.2.12 promotionbl包

#### 2.2.12.1 概述

promtionbl包负责总经理制定促销策略（包括组合商品降价、满额赠送商品、满额赠送代金券、客户赠送礼品、客户赠送代金券以及客户价格这让）用例的UI界面以及相应控制代码。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.2.12.2 整体结构

此包为业务逻辑层的一部分，它负责展示信息以及与用户的交互。它依赖对应的promotiondataservice包与bl层进行交互。由于它具有填写促销策略的功能，为了实现草稿箱和编辑功能，它还需要实现ContinueWritable接口。

#### 2.2.12.3 设计

##### 2.2.12.3.1 设计图



##### 2.2.12.3.2 各个类的职责

| 类名                           | 职责                         |
| ---------------------------- | -------------------------- |
| CommodityOnSaleBlController  | 负责管理填写组合商品降价促销策略界面的展示和功能。  |
| TotalPriceCouponBlController | 负责管理填写满额赠送代金券促销策略界面的展示和功能。 |
| TotalPriceGiftBlController   | 负责管理填写满额赠送礼品促销策略界面的展示和功能。  |
| ClientCouponBlController     | 负责管理填写客户赠送代金券促销策略界面的展示和功能。 |
| ClientGiftBlController       | 负责管理填写客户赠送礼品促销策略界面的展示和功能。  |
| ClientOnSaleBlController     | 负责管理填写客户价格折让促销策略界面的展示和功能。  |

**CommodityOnSaleUiController**

提供的接口

| 接口名称                             | 语法                                       | 前置条件             | 后置条件          |
| -------------------------------- | ---------------------------------------- | ---------------- | ------------- |
| ContinueWritable.continueWriting | `public CommodityOnSaleUiController continueWriting(CommodityOnSaleVo promotion);` | 输入有效的用于继续填写促销策略。 | 初始化传入促销策略的内容。 |

需要的接口

| 接口名称                                     | 服务名          |
| ---------------------------------------- | ------------ |
| `commodityui.CommodityInfoUi.showCommoditySelectDialog()` | 选择商品。        |
| `promotionblservice.PromotionBlServiec.submit(PromotionVoBase promotion) ` | 提交促销策略。      |
| `promotionblservice.PromotionBlServiec.saveAsDraft(PromotionVoBase promotion)` | 保存促销策略草稿。    |
| `promotionblservice.PromotionBlService.getId()` | 获得当前促销策略的ID。 |

**TotalPriceCouponUiController**

提供的接口

| 接口名称                             | 语法                                       | 前置条件             | 后置条件          |
| -------------------------------- | ---------------------------------------- | ---------------- | ------------- |
| ContinueWritable.continueWriting | `public TotalPriceCouponUiController continueWriting(TotalPriceCouponVo promotion);` | 输入有效的用于继续填写促销策略。 | 初始化传入促销策略的内容。 |

需要的接口

| 接口名称                                     | 服务名          |
| ---------------------------------------- | ------------ |
| `promotionblservice.PromotionBlServiec.submit(PromotionVoBase promotion) ` | 提交促销策略。      |
| `promotionblservice.PromotionBlServiec.saveAsDraft(PromotionVoBase promotion)` | 保存促销策略草稿。    |
| `promotionblservice.PromotionBlService.getId()` | 获得当前促销策略的ID。 |

**TotalPriceGiftUiController**

提供的接口

| 接口名称                             | 语法                                       | 前置条件             | 后置条件          |
| -------------------------------- | ---------------------------------------- | ---------------- | ------------- |
| ContinueWritable.continueWriting | `public TotalPriceGiftUiController continueWriting(TotalPriceGiftVo promotion);` | 输入有效的用于继续填写促销策略。 | 初始化传入促销策略的内容。 |

需要的接口

| 接口名称                                     | 服务名          |
| ---------------------------------------- | ------------ |
| `commodityui.CommodityInfoUi.showCommoditySelectDialog()` | 选择商品。        |
| `promotionblservice.PromotionBlServiec.submit(PromotionVoBase promotion) ` | 提交促销策略。      |
| `promotionblservice.PromotionBlServiec.saveAsDraft(PromotionVoBase promotion)` | 保存促销策略草稿。    |
| `promotionblservice.PromotionBlService.getId()` | 获得当前促销策略的ID。 |



**ClientCouponUiController**

提供的接口

| 接口名称                             | 语法                                       | 前置条件             | 后置条件          |
| -------------------------------- | ---------------------------------------- | ---------------- | ------------- |
| ContinueWritable.continueWriting | `public ClientCouponUiController continueWriting(ClientCouponVo promotion);` | 输入有效的用于继续填写促销策略。 | 初始化传入促销策略的内容。 |

需要的接口

| 接口名称                                     | 服务名          |
| ---------------------------------------- | ------------ |
| `promotionblservice.PromotionBlServiec.submit(PromotionVoBase promotion) ` | 提交促销策略。      |
| `promotionblservice.PromotionBlServiec.saveAsDraft(PromotionVoBase promotion)` | 保存促销策略草稿。    |
| `promotionblservice.PromotionBlService.getId()` | 获得当前促销策略的ID。 |

**ClientGiftUiController**

提供的接口

| 接口名称                             | 语法                                       | 前置条件             | 后置条件          |
| -------------------------------- | ---------------------------------------- | ---------------- | ------------- |
| ContinueWritable.continueWriting | `public ClientGiftUiController continueWriting(ClientGiftVo promotion);` | 输入有效的用于继续填写促销策略。 | 初始化传入促销策略的内容。 |

需要的接口

| 接口名称                                     | 服务名          |
| ---------------------------------------- | ------------ |
| `commodityui.CommodityInfoUi.showCommoditySelectDialog()` | 选择商品。        |
| `promotionblservice.PromotionBlServiec.submit(PromotionVoBase promotion) ` | 提交促销策略。      |
| `promotionblservice.PromotionBlServiec.saveAsDraft(PromotionVoBase promotion)` | 保存促销策略草稿。    |
| `promotionblservice.PromotionBlService.getId()` | 获得当前促销策略的ID。 |



**ClientOnSaleUiController**

提供的接口

| 接口名称                             | 语法                                       | 前置条件             | 后置条件          |
| -------------------------------- | ---------------------------------------- | ---------------- | ------------- |
| ContinueWritable.continueWriting | `public ClientOnSaleUiController continueWriting(ClientOnSaleVo promotion);` | 输入有效的用于继续填写促销策略。 | 初始化传入促销策略的内容。 |

需要的接口

| 接口名称                                     | 服务名          |
| ---------------------------------------- | ------------ |
| `promotionblservice.PromotionBlServiec.submit(PromotionVoBase promotion) ` | 提交促销策略。      |
| `promotionblservice.PromotionBlServiec.saveAsDraft(PromotionVoBase promotion)` | 保存促销策略草稿。    |
| `promotionblservice.PromotionBlService.getId()` | 获得当前促销策略的ID。 |



### 2.2.13 approvalbl包

#### 2.2.13.1 概述

#### 2.2.13.2 整体结构

#### 2.2.13.3 设计

##### 2.2.13.3.1 设计图



##### 2.2.13.3.2 各个类的职责

| 类名                | 职责                |
| ----------------- | ----------------- |
| AuditBlController | 负责管理审批单据界面的展示和功能。 |

**AuditBlController**

提供的接口

需要的接口

| 接口名称 | 服务名  |
| ---- | ---- |
|      |      |
|      |      |
|      |      |

