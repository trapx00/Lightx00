### 2.1.11 adminui包

#### 2.1.11.1 概述

adminui包负责管理员管理用户的用例的UI界面以及相应控制代码。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.1.11.2 整体结构

adminui包为展示层的一部分，它负责展示信息以及与用户的交互。它依赖它对应的adminblservice包与bl层进行交互。它需要给财务人员提供选择职员的接口。

#### 2.1.11.3 设计


##### 2.1.11.3.1 设计图


![adminui](../../img/设计图/adminui.png)

##### 2.1.11.3.2 各个类的职责

| 类名                         | 职责                |
| -------------------------- | ----------------- |
| UserManagementUiController | 负责管理职员信息界面的展示和功能。 |

##### 2.1.11.3.3 内部类的接口规范

**UserManagementUiController**

提供的接口

| 接口名称                | 语法                                       | 前置条件        | 后置条件       |
| ------------------- | ---------------------------------------- | ----------- | ---------- |
| adminui.AdminInfoUi | `public EmployeeVo[] showEmployeeSelectDialog();` | 查询并选择有效的职员。 | 返回职员的详细信息。 |

需要的接口

| 接口名称                                     | 服务名          |
| ---------------------------------------- | ------------ |
| `adminblservice.UserManagementBlService.add(EmployeeVo newAccount)` | 添加账户。        |
| `adminblservice.UserManagementBlService.modify(EmployeeVo newAccount)` | 修改账户信息。      |
| `adminblservice.UserManagementBlService.query(UserAccoutQueryVO query)` | 查询账户信息。      |
| `adminblservice.UserManagementBlService.delete(EmployeeVo account)` | 删除账户。        |
| `adminblservice.UserManagementBlService.getId()` | 获得当前用户账号的ID。 |

