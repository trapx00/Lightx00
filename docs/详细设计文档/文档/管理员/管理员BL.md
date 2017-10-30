### 2.2.11 adminbl包

#### 2.2.11.1 概述

adminbl包负责管理员管理用户的用例的业务逻辑实现代码。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.2.11.2 整体架构

此包为业务逻辑层的一部分，它负责展示信息以及与用户的交互。它实现了adminui包所需要的adminblservice的所有接口，并依赖admindataservice包与data层进行交互。

#### 2.2.11.3 设计

##### 2.2.11.3.1 设计图

![adminbl](/Users/ricering/ERPnju/docs/详细设计文档/img/设计图/adminbl.png)

##### 2.2.11.3.2 各个类的职责

| 类名                        | 职责           |
| ------------------------- | ------------ |
| UserMangementBlController | 负责职员账户的增删改查。 |

##### 2.2.11.3.3 内部类的接口规范

**UserManagementBlController**

提供的接口

| 接口名称                                 | 语法                                       | 前置条件                  | 后置条件                  |
| ------------------------------------ | ---------------------------------------- | --------------------- | --------------------- |
| adminblservice.UserManagement.add    | `public ResultMessage add(UserAccoutVO newAccount);` | 新账户信息合法且无冲突，用户具有最高权限。 | 新账户信息已经添加，持久化信息已经保存。  |
| adminblservice.UserManagement.modify | `public ResultMessage modify(UserAccoutVO newAccount);` | 新账户信息合法且无冲突，用户具有最高权限。 | 账户信息已经修改，持久化信息已经保存。   |
| adminblservice.UserManagement.query  | `public UserAccoutVO[] query(UserAccoutQueryVO query);` | 查询条件合法。               | 返回符合查询条件的数据。          |
| adminblservice.UserManagement.delete | `public ResultMessage delete(UserAccoutVO account);` | 选择的账户合法，用户具有最高权限      | 选定账户信息已经删除，持久化信息已经保存。 |
| adminblservice.UserManagement.getId  | `public String getId();`                 | 新建一个账户。               | 返回当前账户的ID。            |

需要的接口

| 接口名称                                     | 服务名            |
| ---------------------------------------- | -------------- |
| `admindataservice.UserManagement.query(String ID, String name,Stirng accountName, String password,boolean hasRoot)` | 根据ID和/或名称查询账户。 |
| `admindataservice.UserManagement.add(UserAccoutPO account)` | 添加账户。          |
| `admindataservice.UserManagement.modify(UserAccoutPO account)` | 修改账户信息。        |
| `admindataservice.UserManagement.delete(UserAccoutPO account)` | 删除账户信息。        |
| `admindataservice.UserManagement.getId();` | 返回当前账户的ID。     |
| `logblservice.Logger.log(LogSeverity severity, String content);` | 记录日志           |

