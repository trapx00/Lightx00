class ClientPO {
    String id;
    ClientType clientType;
    int clientLevel;
    String name;
    String phone;
    String address;
    String zipCode;
    String email;
    double ReceivableQuota;
    double PayableQuota;
    SaleStaffPO DefaultOperator;
}

enum ClientType{
    Supplier,
    Retailer
}

class SaleStaffPO{
    SaleStaffType saleStaffType;
    
}

enum SaleStaffType{
    president,
    staff
}

class SaleBillBasePO{
    SaleBillType saleBillType;
}

enum SaleBillType{
    sell,
    sellRefund
}

class SaleBillPO extends SaleBillBasePO{
    String supplier;
    Employee DefaultOperator;
    SaleStaffPO operator;
    int repository;
    Product[] productList;
    double originTotal;
    double minusProfits;
    double token;
    double ultiTotal;
    String Comment;
}

class SaleRefundBillPO extends SaleBillBasePO{
    String supplier;
    Employee DefaultOperator;
    SaleStaffPO operator;
    int repository;
    Product[] productList;
    double originTotal;
    double minusProfits;
    double token;
    double ultiTotal;
    String Comment;
}

class PurchaseBillBasePO{

}

enum PurchaseBillType{
    purchase,
    purchaseRefund,
}

class PurchaseBillPO extends PurchaseBillBasePO{
    String supplier;
    int repository;
    SaleStaffPO operator;
    String Comment;
    double total;
    Product[] productList;
}

class PurchaseRefundBillPO extends PurchaseBillBasePO{
    String supplier;
    int repository;
    SaleStaffPO operator;
    String Comment;
    double total;
    Product[] productList;
}

