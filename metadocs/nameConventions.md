# 命名规范

为了统一大家类图中的类名以及属性名，本文档会规定命名规范，希望大家统一命名规范。



## 一般

- 类名：每个单词首字母大写
- 属性名：第一个单词字母小写，第二个以及以后的单词小写
- 待续。。。

## 中英对照

这里会提供一些所有人会用到的属性和类的中英对照。不存在于此表中的值有的是某一个角色所特有（请自行定义命名规范），有的是缺少。如果是缺少，请自行增加并commit到metadocs分支。

| 中文名    | 英文名                        |
| ------ | -------------------------- |
| 商品     | Product                    |
| 编号     | ID（小写id）                   |
| 型号     | Model                      |
| 数量     | Amount                     |
| 进价     | PurchasePrice              |
| 零售价    | RetailPrice                |
| 库存     | Stock                      |
| 名称     | Name                       |
| 单据     | Bill                       |
| 账户     | Account                    |
| 银行账户   | BankAccount                |
| 备注     | Comment                    |
| 销售类单据  | SaleBill （继承Bill）          |
| 进货类单据  | ImportBill（继承Bill）         |
| 财务类单据  | FinancialBill              |
| 库存类单据  | StockBill                  |
| 操作员    | Operator（属性名）              |
| 职员     | Employee（类名）               |
| 库存管理人员 | StockStuff（继承Employee）     |
| 进货销售人员 | SaleStuff（继承Employee）      |
| 财务人员   | FinancialStuff（继承Employee） |
| 总经理    | GeneralManager（继承Employee） |
| 客户     | Client                     |
| 客户分类   | ClientType（枚举，包含以下两项）      |
| 进货商    | Supplier                   |
| 销售商    | Retailer                   |
| 客户级别   | Level（int类型，1-5）           |
| 应收     | Receivable                 |
| 应付     | Payable                    |
| 应收额度   | ReceivableQuota            |
| 默认业务员  | DefaultOperator            |
| 总价     | Total                      |
| 单价     | UnitPrice                  |
|        |                            |
|        |                            |
|        |                            |
|        |                            |
|        |                            |
|        |                            |
|        |                            |
|        |                            |
|        |                            |
|        |                            |
|        |                            |
|        |                            |
|        |                            |
|        |                            |
|        |                            |
|        |                            |

