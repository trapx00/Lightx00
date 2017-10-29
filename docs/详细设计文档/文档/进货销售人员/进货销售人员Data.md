### 2.2.6 clientdata包

#### 2.2.6.1 概述

clientdata包负责提供客户信息的增删改查服务。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.2.6.2 整体架构

此包为数据层的一部分，负责进货销售人员人员关于管理客户的用例的数据操作。它实现了clientdataservice的所有接口。

#### 2.2.6.3 设计

##### 2.2.6.3.1 设计图

##### 2.2.6.3.2 各个类的职责

| 类名                   | 职责                 |
| -------------------- | ------------------ |
| ClientDataController | 负责实现客户信息的增删查改的数据操作 |

##### 2.2.6.3.3 内部类的接口规范

**ClientDataController**

提供的接口

| 接口名称                          | 语法                                       | 前置条件        | 后置条件          |
| ----------------------------- | ---------------------------------------- | ----------- | ------------- |
| ClientDataService.query       | `public ClientPO[] query(String query);` | 查询条件合法。     | 返回符合条件的用户信息。  |
| ClientDataService.getId       | `public String getId();`                 | 无。          | 返回新的客户ID。     |
| ClientDataService.saveAsDraft | `public ResultMessage saveAsDraft(ClientPO client);` | 客户数据非空。     | 持久化层保存草稿信息。   |
| ClientDataService.modify      | `public ResultMessage saveAsDraft(ClientPO client);` | 表单数据输入格式正确。 | 持久化层更新客户信息。   |
| ClientDataService.add         | `public ResultMessage add(ClientPO client);` | 表单数据输入格式正确。 | 持久化层更新客户信息。   |
| ClientDataService.delete      | `public ResultMessage delete(ClientPO[] client);` | 删除列表非空。     | 持久化层更新客户信息。   |
| ClientDataService.detail      | `public ClientPO detail(ClientPO[] client);` | 客户id非空。     | 持久化层返回客户详细信息。 |

### 2.2.6 saledata包

#### 2.2.6.1 概述

saledata包负责提供进货销售人员与销售有关的服务（制定销售单、销售退货单）。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.2.6.2 整体架构

此包为数据层的一部分，负责进货销售人员人员关于与销售有关的用例的数据操作（制定销售单、销售退货单）。它实现了saledataservice的所有接口。

#### 2.2.6.3 设计

##### 2.2.6.3.1 设计图

##### 2.2.6.3.2 各个类的职责

| 类名                           | 职责                         |
| ---------------------------- | -------------------------- |
| SaleBillDataController       | 负责实现销售单的提交、修改、增加、删除的数据操作   |
| SaleRefundBillDataController | 负责实现销售退货单的提交、修改、增加、删除的数据操作 |

##### 2.2.6.3.3 内部类的接口规范

**SaleBillDataController**

提供的接口

| 接口名称                            | 语法                                       | 前置条件        | 后置条件          |
| ------------------------------- | ---------------------------------------- | ----------- | ------------- |
| SaleBillDataService.submit      | `public ResultMessage submit(SaleBillPO saleBill);` | 表单数据输入格式正确。 | 持久化层新增表单信息。   |
| SaleBillDataService.saveAsDraft | `public ResultMessage saveAsDraft(SaleBillPO saleBill);` | 表单数据非空。     | 持久化层新增表单草稿信息。 |
| SaleBillDataService.getId       | `public String getId();`                 | 无。          | 持久化层新单据的ID。   |

**SaleRefundBillDataController**

提供的接口

| 接口名称                                  | 语法                                       | 前置条件        | 后置条件          |
| ------------------------------------- | ---------------------------------------- | ----------- | ------------- |
| SaleRefundBillDataService.submit      | `public ResultMessage submit(SaleRefundBillPO saleRefundBill);` | 表单数据输入格式正确。 | 持久化层新增表单信息。   |
| SaleRefundBillDataService.saveAsDraft | `public ResultMessage saveAsDraft(SaleRefundBillPO saleRefundBill);` | 表单数据非空。     | 持久化层新增表单草稿信息。 |
| SaleRefundBillDataService.getId       | `public String getId();`                 | 无。          | 持久化层新单据的ID。   |

### 2.2.6 inventorydata包

#### 2.2.6.1 概述

inventorydata包负责提供与库存有关的服务（制定进货单、进货退货单）。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.2.6.2 整体架构

此包为数据层的一部分，负责关于与库存有关的用例的数据操作（制定进货单、进货退货单）。它实现了inventorydataservice的所有接口。

#### 2.2.6.3 设计

##### 2.2.6.3.1 设计图

##### 2.2.6.3.2 各个类的职责

| 类名                               | 职责                         |
| -------------------------------- | -------------------------- |
| PurchaseBillDataController       | 负责实现进货单的提交、修改、增加、删除的数据操作   |
| PurchaseRefundBillDataController | 负责实现进货退货单的提交、修改、增加、删除的数据操作 |

##### 2.2.6.3.3 内部类的接口规范

**PurchaseBillDataController**

提供的接口

| 接口名称                                | 语法                                       | 前置条件        | 后置条件          |
| ----------------------------------- | ---------------------------------------- | ----------- | ------------- |
| PurchaseBillDataService.submit      | `public ResultMessage submit(PurchaseBillPO purchaseBill);` | 表单数据输入格式正确。 | 持久化层新增表单信息。   |
| PurchaseBillDataService.saveAsDraft | `public ResultMessage saveAsDraft(PurchaseBillPO purchaseBill);` | 表单数据非空。     | 持久化层新增表单草稿信息。 |
| PurchaseBillDataService.getId       | `public String getId();`                 | 无。          | 持久化层新单据的ID。   |

**PurchaseRefundBillDataController**

提供的接口

| 接口名称                                     | 语法                                       | 前置条件        | 后置条件          |
| ---------------------------------------- | ---------------------------------------- | ----------- | ------------- |
| PurchaseRefundBillDataService.submit     | `public ResultMessage submit(PurchaseRefundBillPO purchaseRefundBill);` | 表单数据输入格式正确。 | 持久化层新增表单信息。   |
| PurchaseRefundBillDataService.saveAsDraft | `public ResultMessage saveAsDraft(PurchaseRefundBillPO purchaseRefundBill);` | 表单数据非空。     | 持久化层新增表单草稿信息。 |
| PurchaseRefundBillDataService.getId      | `public String getId();`                 | 无。          | 持久化层新单据的ID。   |