class ClientPO {
    String id;
    ClientType clientType;
    ClientLevel clientLevel;
    String name;
    String phone;
    String address;
    String zipCode;
    String email;
    double ReceivableQuota;
    double PayableQuota;
    SaleStaff DefaultOperator;
}

enum ClientType{
    Supplier,
    Retailer
}

enum ClientLevel{
    One,
    Two,
    Three,
    Four,
    Five
}

class SaleStaff{

}

class SaleBill{
    
}