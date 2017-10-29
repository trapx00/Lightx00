### 2.1.11 adminui包

#### 2.1.11.1 概述

adminui包负责管理员管理用户的用例的UI界面以及相应控制代码。具体功能需求和非功能需求可参见需求规格说明文档和体系结构设计文档。

#### 2.1.11.2 整体结构

adminui包为展示层的一部分，它负责展示信息以及与用户的交互。它依赖它对应的adminblservice包与bl层进行交互。由于它有填写单据的用例，为了实现草稿箱功能，它还需要实现ContinueWritable接口。它需要给财务人员提供选择职员的接口。

#### 2.1.11.3 设计

##### 2.1.11.3.1 设计图

| 类名                         | 职责                |
| -------------------------- | ----------------- |
| UserManagementUiConteoller | 负责管理职员信息界面的展示和功能。 |



##### 2.1.11.3.2 各个类的职责

**UserManagementUiController**

提供的接口

| 接口名称                             | 语法                                       | 前置条件           | 后置条件        |
| -------------------------------- | ---------------------------------------- | -------------- | ----------- |
| ContinueWritable.continueWriting | `public UserManagementUiController continueWriting(EmployeeVo bill);` | 输入有效的用于继续填写单据。 | 初始化传入单据的内容。 |
| adminui.AdminInfoUi              | `public EmployeeVo[] showEmployeeSelectDialog();` | 查询并选择有效的职员。    | 返回职员的详细信息。  |

需要的接口

| 接口名称                                     | 服务名          |
| ---------------------------------------- | ------------ |
| `adminblservice.UserManagement.add(EmployeeVo newAccount);` | 添加账户。        |
| `adminblservice.UserManagement.modify(EmployeeVo newAccount);` | 修改账户信息。      |
| `adminblservice.UserManagement.query(UserAccoutQueryVO query);` | 删除账户信息。      |
| `adminblservice.UserManagement.delete(EmployeeVo account);` | 查询账户。        |
| `adminblservice.AdminBlService.getId()`  | 获得当前用户账号的ID。 |

