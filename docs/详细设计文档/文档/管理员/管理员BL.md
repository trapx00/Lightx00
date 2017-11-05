### 2.2.11 adminbl包

#### 2.2.11.1 概述

adminbl包负责管理员管理用户的用例的业务逻辑实现代码。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.2.11.2 整体架构

此包为业务逻辑层的一部分，它负责展示信息以及与用户的交互。它实现了adminui包所需要的adminblservice的所有接口，并依赖admindataservice包与data层进行交互。

#### 2.2.11.3 设计

##### 2.2.11.3.1 设计图

![adminbl](../../img/设计图/adminbl.png)

##### 2.2.11.3.2 各个类的职责

| 类名                        | 职责           |
| ------------------------- | ------------ |
| UserMangementBlController | 负责职员账户的增删改查。 |

##### 2.2.11.3.3 内部类的接口规范

**UserManagementBlController**

提供的接口

| 接口名称                           | 语法                                       | 前置条件                  | 后置条件                  |
| ------------------------------ | ---------------------------------------- | --------------------- | --------------------- |
| UserManagementBlService.add    | `public ResultMessage add(EmployeeVO newAccount);` | 新账户信息合法且无冲突，用户具有最高权限。 | 新账户信息已经添加，持久化信息已经保存。  |
| UserManagementBlService.modify | `public ResultMessage modify(EmployeeVO newAccount);` | 新账户信息合法且无冲突，用户具有最高权限。 | 账户信息已经修改，持久化信息已经保存。   |
| UserManagementBlService.query  | `public EmployeeVO[] query(UserAccoutQueryVO query);` | 查询条件合法。               | 返回符合查询条件的数据。          |
| UserManagementBlService.delete | `public ResultMessage delete(EmployeeVO account);` | 选择的账户合法，用户具有最高权限      | 选定账户信息已经删除，持久化信息已经保存。 |
| UserManagementBlService.getId  | `public String getId();`                 | 新建一个账户。               | 返回当前账户的ID。            |

需要的接口

| 接口名称                                     | 服务名            |
| ---------------------------------------- | -------------- |
| `admindataservice.UserManagementDataServicec.query(EmployeeQueryVo query)` | 根据ID和/或名称查询账户。 |
| `admindataservice.UserManagementDataService.add(EmployeetPO account)` | 添加账户。          |
| `admindataservice.UserManagementDataService.modify(EmployeePO account)` | 修改账户信息。        |
| `admindataservice.UserManagementDataService.delete(EmployeePO account)` | 删除账户信息。        |
| `admindataservice.UserManagementDataService.getId();` | 返回当前账户的ID。     |
| `logbl.LogService.log(LogSeverity severity, String content);` | 记录日志           |

##### 2.2.11.3.4 业务逻辑层的动态模型

下图为增加用户账户顺序图

![增加用户账户](../../img/顺序图/增加用户账户.png)

下图为删除用户账户顺序图

![删除用户账户](../../img/顺序图/删除用户账户.png)

下图为查询用户账户顺序图

![查询用户账户](../../img/顺序图/查询用户账户.png)

由于此包对外提供选择职员的接口，此功能实现顺序图如下

![BL层查询职员](../../img/顺序图/BL层查询职员.png)