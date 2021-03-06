### 2.3.11 admindata包

#### 2.3.11.1 概述

admindata包负责保存管理员管理用户的用例的数据操作。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.3.11.2 整体结构

admindata包为数据层的一部分，它负责数据的存储以及与bl层的交互。它实现所有adminbl包需要的接口。

#### 2.3.11.3 设计

##### 2.3.11.3.1 设计图

![admindata](/Users/ricering/ERPnju/docs/详细设计文档/img/设计图/admindata.png)

##### 2.3.11.3.2 各个类的职责

| 类名                           | 职责               |
| ---------------------------- | ---------------- |
| UserManagementDataConteoller | 负责保存管理职员信息操作的数据。 |

**UserManagementUiController**

提供的接口

| 接口名称                                   | 语法                                       | 前置条件         | 后置条件                           |
| -------------------------------------- | ---------------------------------------- | ------------ | ------------------------------ |
| admindataservice.UserManagement.query  | `public UserAccoutPO[] query(String ID, String name,String accountName, String password,boolean hasRoot);` | 查询条件合法。      | 返回满足条件的账户PO。某一项为null的意思是此项无限制。 |
| admindataservice.UserManagement.add    | `public ResultMessage add(UserAccountPO account);` | 新账户信息合法且无冲突。 | 新账户信息已经添加，持久化信息已经保存。           |
| admindataservice.UserManagement.modify | `public ResultMessage modify(UserAccountPO account); ` | 新账户信息合法且无冲突。 | 账户信息已经修改，持久化信息已经保存。            |
| admindataservice.UserManagement.delete | `public ResultMessage delete(UserAccountPO account);` | 新账户信息合法且无冲突。 | 选定账户信息已经删除，持久化信息已经保存。          |
| admindataservice.UserManagement.getId  | `public String getId();`                 | 无。           | 返回当前账户的ID。                     |

