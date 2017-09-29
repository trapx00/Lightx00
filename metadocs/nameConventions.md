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
| 进货类单据  | PurchaseBill（继承Bill）       |
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
| 修改（更新） | Modify                     |
| 删除     | Delete                     |
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

## 功能点中英对照

| 中文           | 英文                        |
| ------------ | ------------------------- |
| 商品分类管理       | ProductCategoryManagement |
| 商品管理         | ProductManagement         |
| 库存查看         | StockQuery                |
| 库存盘点         | StockCheck                |
| 建立库存赠送单      | StockGiveaway             |
| 建立库存报损单      | StockLoss                 |
| 建立库存报警单      | StockWarning              |
| 库存管理人员响应进出货  | StockStuffResponse        |
| 客户管理         | ClientManagement          |
| 制定进货单        | PurchaseBill              |
| 制定进货退货单      | PurchaseRefundBill        |
| 制定销售单        | SaleBill                  |
| 制定销售退货单      | SaleRefundBill            |
| 进货销售人员响应审批消息 | SaleStuffResponse         |
| 账户管理         | AccountManagement         |
| 制定收款单        | ReceiptBill               |
| 制定付款单        | PaymentBill               |
| 制定现金费用单      | CashBill                  |
| 查看销售明细表      | SaleDetail                |
| 查看经营历程表      | TradeHistory              |
| 红冲           | RevertBill                |
| 查看经营情况表      | TradeSituation            |
| 期初建账         | InitialEstablishment      |
| 完成现实银行操作     | FinancialStuffResponse    |
| 审批单据         | BillApproval              |
| 制定促销策略       | Promotion                 |
| 查看日志         | LogInspection             |
| 管理用户账户       | UserAccountManagement     |
|              |                           |
|              |                           |

