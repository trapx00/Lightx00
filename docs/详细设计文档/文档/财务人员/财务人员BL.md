### 2.2.6 financebl包

#### 2.2.6.1 概述

financeui包负责财务人员除了银行账户管理外的用例（制定收款单、制定付款单、制定现金费用单、查看经营情况表、查看经营历程表、查看销售情况表、红冲以及期初建账）的业务逻辑实现代码。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.2.6.2 整体架构

此包为业务逻辑层的一部分，它负责展示信息以及与用户的交互。它实现了financeui包所需要的financeblservice的所有接口，并依赖financedataservice包与data层进行交互。

#### 2.2.6.3 设计

##### 2.2.6.3.1 设计图

![financebl](/img/设计图/financebl.png)

##### 2.2.6.3.2 各个类的职责

| 类名 | 职责 |
|-----| -----|
| PaymentBillBlController | 负责管理付款单的提交、保存草稿以及激活操作。|
| ReceivalBillBlController | 负责管理收款单的提交、保存草稿以及激活操作。|
| CashBillBlController | 负责管理现金费用单的提交、保存草稿以及激活操作。 |
| SystemSnapshotBlController | 负责管理期初建账的提交、保存草稿以及激活操作。 |
| SaleDetailBlController | 负责查看销售明细表的功能实现。|
| TradeHistoryBlController | 负责经营历程表的功能实现。 |
| TradeSituationBlController | 负责经营情况表的功能实现。|
| ExpenseCalculation | 在经营情况表用例里负责计算支出。|
| IncomeCalculation | 在经营情况表用例里负责计算收入。|


##### 2.2.6.3.3 内部类的接口规范

**PaymentBillBlController**

提供的接口

| 接口名称                                     | 语法                                       | 前置条件                         | 后置条件                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------- | ------------------------------------- |
| PaymentBillBlService.submit     | `public ResultMessage submit(PaymentBillVo bill);` | 单据所有属性有效。                    | 单据已经保存到数据库，持久化信息已经保存。                 |
| PaymentBillBlService.saveAsDraft | `public ResultMessage saveAsDraft(PaymentBillVo bill);` | 单据信息非空。                      | 保存草稿，持久化信息已经保存。                       |
| PaymentBillBlService.getId      | `public String getId(); ` | 无。 | 获得新单据的ID。|
| NotificationActivation.activate          | `public ResultMessage activate(PaymentBillVo bill);` | 单据有效且状态为审批通过。                | 系统修改对应银行账户和客户信息，修改单据状态为已入账，持久化信息已经保存。 |
| NotificationActivation.abandon           | `public ResultMessage abandon(PaymentBillVo bill);` | 单据有效且状态为审批完成。                | 系统修改单据状态为已经废弃，持久化信息已经保存。              |

需要的接口

| 接口名称                                     | 服务名          |
| ---------------------------------------- | ------------ |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。|
| `draftbl.DraftService.saveAsDraft(PaymentBillVo bill)` | 保存草稿。|
| `financedataservice.PaymentBillDataService.submit(PaymentBillPo bill)` | 提交新单据。       |
| `financedataservice.PaymentBillDataService.activate(PaymentBillPo bill) ` | 使单据入账。       |
| `financedataservice.PaymentBillDataService.abandon(PaymentBillPo bill)` | 废弃单据。        |
| `financedataservice.PaymentBillDataService.getId()` | 获得新单据的ID。|

**ReceivalBillBlController**

提供的接口

| 接口名称                                     | 语法                                       | 前置条件                         | 后置条件                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------- | ------------------------------------- |
| ReceivalBillBlService.submit     | `public ResultMessage submit(ReceivalBillVo bill);` | 单据所有属性有效。                    | 单据已经保存到数据库，持久化信息已经保存。                 |
| ReceivalBillBlService.saveAsDraft | `public ResultMessage saveAsDraft(ReceivalBillVo bill);` | 单据信息非空。                      | 保存草稿，持久化信息已经保存。                       |
| ReceivalBillBlService.getId      | `public String getId(); ` | 无。 | 获得新单据的ID。|
| NotificationActivation.activate          | `public ResultMessage activate(ReceivalBillVo bill);` | 单据有效且状态为审批通过。                | 系统修改对应银行账户和客户信息，修改单据状态为已入账，持久化信息已经保存。 |
| NotificationActivation.abandon           | `public ResultMessage abandon(ReceivalBillVo bill);` | 单据有效且状态为审批完成。                | 系统修改单据状态为已经废弃，持久化信息已经保存。              |

需要的接口

| 接口名称                                     | 服务名          |
| ---------------------------------------- | ------------ |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。|
| `draftbl.DraftService.saveAsDraft(ReceivalBillVo bill)` | 保存草稿。|
| `financedataservice.ReceivalBillDataService.submit(ReceivalBillPo bill)` | 提交新单据。       |
| `financedataservice.ReceivalBillDataService.activate(ReceivalBillPo bill) ` | 使单据入账。       |
| `financedataservice.ReceivalBillDataService.abandon(ReceivalBillPo bill)` | 废弃单据。        |
| `financedataservice.ReceivalBillDataService.getId()` | 获得新单据的ID。|

**CashBillBlController**

提供的接口

| 接口名称                                     | 语法                                       | 前置条件                         | 后置条件                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------- | ------------------------------------- |
| CashBillBlService.submit     | `public ResultMessage submit(CashBillVo bill);` | 单据所有属性有效。                    | 单据已经保存到数据库，持久化信息已经保存。                 |
| CashBillBlService.saveAsDraft | `public ResultMessage saveAsDraft(CashBillVo bill);` | 单据信息非空。                      | 保存草稿，持久化信息已经保存。                       |
| CashBillBlService.getId      | `public String getId(); ` | 无。 | 获得新单据的ID。|
| NotificationActivation.activate          | `public ResultMessage activate(CashBillVo bill);` | 单据有效且状态为审批通过。                | 系统修改对应银行账户和客户信息，修改单据状态为已入账，持久化信息已经保存。 |
| NotificationActivation.abandon           | `public ResultMessage abandon(CashBillVo bill);` | 单据有效且状态为审批完成。                | 系统修改单据状态为已经废弃，持久化信息已经保存。              |

需要的接口

| 接口名称                                     | 服务名          |
| ---------------------------------------- | ------------ |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。|
| `draftbl.DraftService.saveAsDraft(CashBillVo bill)` | 保存草稿。|
| `financedataservice.CashBillDataService.submit(CashBillPo bill)` | 提交新单据。       |
| `financedataservice.CashBillDataService.activate(CashBillPo bill)` | 使单据入账。       |
| `financedataservice.CashBillDataService.abandon(CashBillPo bill)` | 废弃单据。        |
| `financedataservice.CashBillDataService.getId()` | 获得新单据的ID。|


**InitialEstablishmentBlController**

提供的接口

| 接口名称                                     | 语法                                       | 前置条件                         | 后置条件                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------- | ------------------------------------- |
| InitialEstablishmentBlService.submit     | `public ResultMessage submit(SystemSnapshotVo bill);` | 单据所有属性有效。                    | 单据已经保存到数据库，持久化信息已经保存。                 |
| InitialEstablishmentBlService.saveAsDraft | `public ResultMessage saveAsDraft(SystemSnapshotVo bill);` | 单据信息非空。                      | 保存草稿，持久化信息已经保存。                       |
| InitialEstablishmentBlService.getId      | `public String getId(); ` | 无。 | 获得新单据的ID。|
| NotificationActivation.activate          | `public ResultMessage activate(SystemSnapshotVo bill);` | 单据有效且状态为审批通过。                | 系统修改对应银行账户和客户信息，修改单据状态为已入账，持久化信息已经保存。 |
| NotificationActivation.abandon           | `public ResultMessage abandon(SystemSnapshotVo bill);` | 单据有效且状态为审批完成。                | 系统修改单据状态为已经废弃，持久化信息已经保存。              |

需要的接口

| 接口名称                                     | 服务名          |
| ---------------------------------------- | ------------ |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。|
| `draftbl.DraftService.saveAsDraft(SystemSnapshotVo bill)` | 保存草稿。|
| `inventorybl.InventoryBillInfo.getAllInventoryBill()` | 取得所有库存类单据。|
| `commoditybl.CommodityInfo.getAllCommodity()` | 取得所有商品信息。|
| `commoditybl.CommodityInfo.getAllCommoditySort()` | 取得所有商品分类信息。|
| `bankaccountbl.BankAccountInfo.getAllBankAccount()` | 取得所有银行账户信息。|
| `financedataservice.InitialEstablishmentDataService.submit(SystemSnapshotPo snapshot)` | 提交新单据。       |
| `financedataservice.InitialEstablishmentDataService.activate(SystemSnapshotPo snapshot)` | 系统记入账。       |
| `financedataservice.InitialEstablishmentDataService.abandon(SystemSnapshotPo snapshot)` | 废弃单据。        |
| `financedataservice.InitialEstablishmentDataService.getId()` | 获得新单据的ID。|

**SaleDetailBlController**

提供的接口

| 接口名称                                     | 语法                                       | 前置条件                         | 后置条件                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------- | ------------------------------------- |
| SaleDetailBlService.query        | `public SaleDetailVo query(SaleDetailQueryVo query);` | 输入的query不为空。其中值为null的字段为不限制。 | 返回销售明细表。                              |
| SaleDetailBlService.export       | `public ResultMessage export(SaleDetailVo detail);` | 表不为空且有效。                     | 导出单据。                                 |

需要的接口

| 接口名称                                     | 服务名          |
| ---------------------------------------- | ------------ |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。|
| `salebl.SaleBillInfo.querySaleBill(SaleBillQueryVo query)` | 查询销售单。|
| `salebl.SaleBillInfo.querySaleRefundBill(SaleBillQueryVo query)` | 查询销售退货单。|


**TradeHistoryBlController**

提供的接口

| 接口名称                                     | 语法                                       | 前置条件                         | 后置条件                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------- | ------------------------------------- |
| TradeHistoryBlService.query      | `public TradeHistoryVo query(TradeHistoryQueryVo query);` | 输入的query不为空。其中值为null字段的为不限制。 | 返回符合条件的单据。                            |
| TradeHistoryBlService.export     | `public ResultMessage export(TradeHistoryVo bills);` | bills参数不为空且有效。               | 导出报表。                                 |
| FinanceBillInfo.query | `public FinanceBillVo[] queryFinanceBill(FinanceBillQueryVo query);` | 无。 | 返回符合条件的财务单据。若某一条目为null则为无限制。| 

需要的接口

| 接口名称                                     | 服务名          |
| ---------------------------------------- | ------------ |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。|
| `financedataservice.TradeHistoryDataService.query(FinanceBillQueryVo query)` | 根据条件查找财务类单据。    |
| `salebl.SaleBillInfo.querySaleBill(SaleBillQueryVo query)` | 查询销售单。|
| `salebl.SaleBillInfo.querySaleRefundBill(SaleRefundBillQueryVo query)` | 查询销售退货单。|
| `salebl.SaleBillInfo.queryPurchaseBill(PurchaseBillQueryVo query)` | 查询进货单。|
| `salebl.SaleBillInfo.queryPurchaseRefundBill(PurchaseRefundBillQueryVo query)` | 查询进货退货单。|
| `inventorybl.InventoryBillInfo.getAllInventoryBill()` | 查询库存类单据。|

**TradeSituationBlController**


提供的接口

| 接口名称                                     | 语法                                       | 前置条件                         | 后置条件                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------- | ------------------------------------- |
| TradeSituationBlService.query    | `public TradeSituationVo query(Date start, Date end);` | 输入时间段有效。                     | 返回时间段内的经营情况。                          |
| TradeSituationBlService.export   | `public ResultMessage export(TradeSituationVo situation);` | 选定表格非空。                      | 导出报表。                                 |

需要的接口

| 接口名称                                     | 服务名          |
| ---------------------------------------- | ------------ |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。|
| `financebl.ExpenseCalculation.calculate(Date start, Date end)` | 计算支出。|
| `financebl.IncomeCalculation.calculate(Date start, Date end)` | 计算收入。|


**ExpenseCalculation**

提供的接口

| 接口名称                                     | 语法                                       | 前置条件                         | 后置条件                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------- | ------------------------------------- |
| ExpenseCalculation.calculate | `public TradeSituationExpenseVo calculate (Date start, Date end);` | 输入的时间段有效。 | 计算支出。|



**IncomeCalculation**

提供的接口

| 接口名称                                     | 语法                                       | 前置条件                         | 后置条件                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------- | ------------------------------------- |
| IncomeCalculation.calculate | `public TradeSituationIncomeVo calculate(Date start, Date end);` | 输入的时间段有效。 | 计算收入。|

需要的接口

| 接口名称                                     | 服务名          |
| ---------------------------------------- | ------------ |
| `salebl.SaleBillInfo.querySaleBill(SaleBillQueryVo query)` | 查询销售单。|
| `salebl.SaleBillInfo.querySaleRefundBill(SaleRefundBillQueryVo query)` | 查询销售退货单。|
| `salebl.SaleBillInfo.queryPurchaseBill(PurchaseBillQueryVo query)` | 查询进货单。|
| `salebl.SaleBillInfo.queryPurchaseRefundBill(PurchaseRefundBillQueryVo query)` | 查询进货退货单。|
| `inventorybl.InventoryBillInfo.getAllInventoryBill()` | 查询库存类单据。|

### 2.2.7 bankaccountbl包

#### 2.2.7.1 概述

bankaccountbl包负责银行账户管理的的业务逻辑实现代码。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.2.7.2 整体架构

此包为业务逻辑层的一部分，它负责展示信息以及与用户的交互。它实现了bankaccountui包所需要的bankaccountblservice的所有接口，并依赖bankaccountdataservice包与data层进行交互。它同时公开了BankAccountInfo接口用于给其他bl提供银行账户信息。

#### 2.2.7.3 设计

##### 2.2.7.3.1 设计图

![bankaccountui](/img/设计图/bankaccountbl.png)

##### 2.2.7.3.2 各个类的职责

| 类名 | 职责 |
|-----| -----|
| BankAccountBlController | 负责管理银行账户管理功能的实现。|

##### 2.2.7.3.3 内部类的接口规范

**BankAccountBlController**

提供的接口

| 接口名称                                     | 语法                                       | 前置条件                  | 后置条件                   |
| ---------------------------------------- | ---------------------------------------- | --------------------- | ---------------------- |
| BankAccountManagementBlService.add | `public ResultMessage add(BankAccountVo newAccount);` | 新账户信息合法且无冲突，用户具有最高权限。 | 新银行账户信息已经添加，持久化信息已经保存。 |
| BankAccountManagementBlService.modify | `public ResultMessage modify(BankAccountVo newAccount);` | 新账户信息合法且无冲突，用户具有最高权限。 | 银行账户信息已经修改，持久化信息已经保存。  |
| BankAccountManagementBlService.query | `public BankAccountVo[] query(BankAccountQueryVo query);` | 查询条件合法。               | 返回符合查询条件的数据。           |
| BankAccountManagementBlService.delete | `public ResultMessage delete(BankAccountVo account);` | 选择的账户合法，用户具有最高权限。     | 选定账户信息已经删除，持久化信息已经保存。  |
| BankAccountInfo.queryBankAccount | `public BankAccountVo[] queryBankAccount(BankAccoutQueryVo query);` | 无。 | 返回符合查询条件的数据。|


需要的接口


| 接口名称                                     | 服务名            |
| ---------------------------------------- | -------------- |
| `bankaccountdataservice.BankAccountManagementDataService.query(BankAccountQueryVo query);` | 根据ID和/或名称查询账户。 |
| `bankaccountdataservice.BankAccountManagementDataService.add(BankAccountPo account);` | 添加账户。          |
| `bankaccountdataservice.BankAccountManagementDataService.modify(BankAccountPo account);` | 修改账户信息。        |
| `bankaccountdataservice.BankAccountManagementDataService.delete(BankAccountPo account);` | 删除账户信息。        |
| `logbl.LogService.log(LogSeverity severity, String content)` | 记录日志。|