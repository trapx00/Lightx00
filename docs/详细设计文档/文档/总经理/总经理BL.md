### 2.2.12 promotionbl包

#### 2.2.12.1 概述

promtionbl包负责总经理制定促销策略（包括组合商品降价、满额促销策略（赠送商品或者代金券）、客户促销策略（赠送礼品或者代金券或者价格这让））用例的业务逻辑实现代码。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.2.12.2 整体结构

此包为业务逻辑层的一部分，它负责业务逻辑的实现。它实现了promtionui包所需要的promotionblservice所有接口，并依赖对应的promotiondataservice包与data层进行交互。由于销售行为需要依赖促销策略，它还需要实现PromotionInfo接口。

#### 2.2.12.3 设计

##### 2.2.12.3.1 设计图

![promotionbl](../../img/设计图/promotionbl.png)

##### 2.2.12.3.2 各个类的职责

| 类名                              | 职责                                 |
| ------------------------------- | ---------------------------------- |
| PromotionInfoController         | 负责管理salebill查询可用促销策略的功能实现。         |
| ComSalePromotionBlController    | 负责管理填写组合商品降价促销策略的功能实现。             |
| TotalPricePromotionBlController | 负责管理填写满额促销策略（赠送礼品或者代金券）的功能实现。      |
| ClientPromotionBlController     | 负责管理填写客户促销策略（赠送礼品或者代金券或价格折让）的功能实现。 |

##### 2.2.12.3.3 内部类的接口规范

**PromotionInfoController**

提供的接口

| 接口名称                      | 语法                                       | 前置条件    | 后置条件           |
| ------------------------- | ---------------------------------------- | ------- | -------------- |
| promotionbl.PromotionInfo | `public PromotionVoBase[] getPromotion(SaleBillVo saleBill);` | 产生销售行为。 | 返回当前销售可用的促销策略。 |

需要的接口

| 接口名称                                     | 服务名         |
| ---------------------------------------- | ----------- |
| `promotiondataservice.ComSalePromotionDataService.queryPromotion(ComSalePromotionQueryVo query)` | 查找组合降价促销策略。 |
| `promotiondataservice.TotalPricePromotionDataService.queryPromotion(TotalPricePromotionQueryVo query)` | 查找满额促销策略。   |
| `promotiondataservice.ClientPromotionDataService.queryPromotion(ClientPromotionQueryVo query)` | 查找客户促销策略。   |

**ComSalePromotionBlController**

提供的接口

| 接口名称                                     | 语法                                       | 前置条件        | 后置条件                    |
| ---------------------------------------- | ---------------------------------------- | ----------- | ----------------------- |
| ComSalePromotionBlService.submit         | `public ResultMessage submit(ComSalePromotionVo promotion);` | 促销策略所有属性有效。 | 持久化促销策略信息已经保存。          |
| ComSalePromotionBlService.saveAsDraft    | `public ResultMessage saveAsDraft(ComSalePromotionVo promotion);` | 促销策略信息非空。   | 保存草稿，持久化信息已经保存。         |
| ComSalePromotionBlService.queryPromotion | `public ComSalePromotionVo[] queryPromotion(ComSalePromotionQueryVo query);` | 查询条件有效。     | 返回符合条件的促销策略。            |
| ComSalePromotionBlService.delete         | `public ResultMessage delete(String id);` | 选择删除促销策略。   | 返回删除是否成功，持久化更新涉及的对象的数据。 |
| ComSalePromotionBlService.getId          | `public String getId();`                 | 无。          | 返回当前促销策略的ID。            |

需要的接口

| 接口名称                                     | 服务名         |
| ---------------------------------------- | ----------- |
| `promotiondataservice.ComSalePromotionDataService.submit(ComSalePromotionVo promotion)` | 提交新促销策略。    |
| `promotiondataservice.ComSalePromotionDataService.queryPromotion(PromotionQueryVo query)` | 查找促销策略。     |
| `promotiondataservice.ComSalePromotionDataService.delete(String id)` | 删除单一持久化对象。  |
| `promotiondataservice.ComSalePromotionDataService.getId()` | 返回当前促销策略ID。 |
| `draftbl.DraftService.saveAsDraft(ComSalePromotionVo promotion)` | 保存草稿。       |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。       |

**TotalPricePromotionBlController**

提供的接口

| 接口名称                                     | 语法                                       | 前置条件        | 后置条件                |
| ---------------------------------------- | ---------------------------------------- | ----------- | ------------------- |
| TotalPricePromotionBlService.submit      | `public ResultMessage submit(TotalPricePromotionVo promotion);` | 促销策略所有属性有效。 | 持久化促销策略信息已经保存。      |
| TotalPricePromotionBlService.saveAsDraft | `public ResultMessage saveAsDraft(TotalPricePromotionVo promotion);` | 促销策略信息非空。   | 保存草稿，持久化信息已经保存。     |
| TotalPricePromotionBlService.queryPromotion | `public TotalPricePromotionVo[] queryPromotion(TotalPricePromotionQueryVo query);` | 查询条件有效。     | 返回符合条件的促销策略。        |
| TotalPricePromotionBlService.delete      | `public ResultMessage delete(String);`   | 选择删除促销策略。   | 返回删除是否成功，持久化信息已经保存。 |
| TotalPricePromotionBlService.getId       | `public String getId();`                 | 无。          | 返回当前促销策略的ID。        |

需要的接口

| 接口名称                                     | 服务名        |
| ---------------------------------------- | ---------- |
| `promotiondataservice.TotalPricePromotionDataService.submit(TotalPricePromotionVo promotion)` | 提交新促销策略。   |
| `promotiondataservice.TotalPricePromotionDataService.queryPromotion(TotalPricePromotionQueryVo query)` | 查找促销策略。    |
| `promotiondataservice.TotalPricePromotionDataService.delete(String id)` | 删除单一持久化对象。 |
| `promotiondataservice.TotalPricePromotionDataService.getId()` | 返回当前促销策略ID |
| `draftbl.DraftService.saveAsDraft(TotalPricePromotionVo promotion)` | 保存草稿。      |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。      |

**ClientPromotionBlController**

提供的接口

| 接口名称                                    | 语法                                       | 前置条件        | 后置条件                |
| --------------------------------------- | ---------------------------------------- | ----------- | ------------------- |
| ClientPromotionBlService.submit         | `public ResultMessage submit(ClientPromotionVo promotion);` | 促销策略所有属性有效。 | 持久化促销策略信息已经保存。      |
| ClientPromotionBlService.saveAsDraft    | `public ResultMessage saveAsDraft(ClientPromotionVo promotion);` | 促销策略信息非空。   | 保存草稿，持久化信息已经保存。     |
| ClientPromotionBlService.queryPromotion | `public ClientPromotionVo[] queryPromotion(ClientPromotionQueryVo query);` | 查询条件有效。     | 返回符合条件的促销策略。        |
| ClientPromotionBlService.delete         | `public ResultMessage delete(String id);` | 选择删除促销策略。   | 返回删除是否成功，持久化信息已经保存。 |
| ClientPromotionBlService.getId          | `public String getId();`                 | 无。          | 返回当前促销策略的ID。        |
| draftbl.DraftDeleteService              | `public ResultMessage deleteDraft(String id);` | 删除草稿。       | 返回删除结果。             |

需要的接口

| 接口名称                                     | 服务名        |
| ---------------------------------------- | ---------- |
| `promotiondataservice.ClientPromotionDataService.submit(ClientPromotionVo promotion)` | 提交新促销策略。   |
| `promotiondataservice.ClientPromotionDataService.queryPromotion(ClientPromotionQueryVo query)` | 查找促销策略。    |
| `promotiondataservice.ClientPromotionDataService.delete(String id)` | 删除单一持久化对象。 |
| `promotiondataservice.ClientPromotionDataService.getId()` | 返回当前促销策略ID |
| `draftbl.DraftService.saveAsDraft(ClientPromotionVo promotion)` | 保存草稿。      |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。      |

##### 2.2.12.3.4 业务逻辑层的动态模型

下图为填写组合降价促销策略时的顺序图，满额以及客户促销策略的顺序图参见此图。

![填写促销策略](../../img/顺序图/填写促销策略.png)

下图为填写组合商品降价促销策略时被中断保存草稿的顺序图，其他促销策略顺序图参见此图。

![保存促销策略草稿](../../img/顺序图/保存促销策略草稿.png)

下图是查询（筛选）组合商品降价促销策略的顺序图，其他促销策略顺序图参见此图。

![查询促销策略](../../img/顺序图/查询促销策略.png)

下图是删除组合商品降价促销策略的顺序图，其他促销策略顺序图参见此图。

![删除促销策略](../../img/顺序图/删除促销策略.png)

由于本包会对销售行为提供查询销售可用的促销策略接口，此功能实现顺序图如下

![BL层查询可用促销策略](../../img/顺序图/BL层查询可用促销策略.png)

### 2.2.13 approvalbl包

#### 2.2.13.1 概述

approvalbl包负责总经理审批单据用例的业务逻辑实现代码。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.2.13.2 整体架构

此包为业务逻辑层的一部分，它负责业务逻辑的实现。它实现了approvalui包所需要的approvalblservice的所有接口，并依赖approvaldataservice包与data层进行交互。由于审批单据需要修改单据属性，approvalbl还要依赖BillApprovalCompleteService修改单据状态。

#### 2.2.13.3 设计

##### 2.2.13.3.1 设计图

![approvalbl](../../img/设计图/approvalbl.png)



##### 2.2.13.3.2 各个类的职责

| 类名                | 职责                |
| ----------------- | ----------------- |
| AuditBlController | 负责管理审批单据界面的展示和功能。 |

##### 2.2.13.3.3 内部类的接口规范

**AuditBlController**

提供的接口

| 接口名称                            | 语法                                       | 前置条件          | 后置条件                  |
| ------------------------------- | ---------------------------------------- | ------------- | --------------------- |
| AuditBlService.query            | `public ResultMessage query (BillInfoQueryVo query);` | 有处于提交状态的单据单据。 | 返回符合条件的单据。            |
| AuditBlService.reject           | `public ResultMessage reject(BillInfoVo billInfo);` | 用户已经查看了单据内容。  | 拒绝通过审批，持久化更新涉及的对象的数据。 |
| AuditBlService.pass             | `public ResultMessage pass(BillInfoVo bill);` | 用户已经查看了单据内容。  | 通过审批，持久化更新涉及的对象的数据。   |
| ApprovalRequest.requestApproval | `public ResultMessage requestApproval(BillVo bill);` | 用户提交了单据。      | 保存单据并返回保存结果。          |

需要的接口

| 接口名称                                     | 服务名                |
| ---------------------------------------- | ------------------ |
| `approvaldataservice.AuditDataService.query(BillInfoQueryVo query)` | 得到待审批单据简要信息的持久化对象。 |
| `approvaldataservice.AuditDataService.reject(BillInfoVo billInfo)` | 拒绝通过审批。            |
| `approvaldataservice.AuditDataService.pass(BillInfoVo billInfo)` | 通过审批。              |
| `approvaldata.ApprovalRequest.requestApproval(BillVo bill)` | 保存提交审批的单据的简要信息。    |
| `approvalbl.BillApprovalCompleteService.approvalComplete(String billId,BillState state)` | 修改单据状态。            |
| `notificationbl.NotificationService.addNotification(NotificationVo notification);` | 每次审批结束后新增一条通知。     |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。              |

##### 2.2.13.3.4 业务逻辑层的动态模型

下图是审批通过的顺序图

![审批通过](../../img/顺序图/审批通过.png)

下图是审批不通过的顺序图

![审批通过](../../img/顺序图/审批通过.png)

由于本包对外提供申请提交接口，此功能实现顺序图如下

![BL层处理申请审批](../../img/顺序图/BL层处理申请审批.png)