package trapx00.lightx00.shared.vo.salestaff;


import trapx00.lightx00.shared.po.client.ClientType;
import trapx00.lightx00.shared.po.salestaff.PurchaseBillType;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.EmployeeVo;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVo;

public class ClientVo {
    String id;
    ClientType clientType;
    int clientLevel;
    String name;
    String phone;
    String address;
    String zipCode;
    String email;
    double receivableQuota;
    double payableQuota;
    SaleStaffVo defaultOperator;

    public ClientVo(String id, ClientType clientType, int clientLevel, String name, String phone, String address, String zipCode, String email, double receivableQuota, double payableQuota, SaleStaffVo defaultOperator) {
        this.id = id;
        this.clientType = clientType;
        this.clientLevel = clientLevel;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.zipCode = zipCode;
        this.email = email;
        this.receivableQuota = receivableQuota;
        this.payableQuota = payableQuota;
        this.defaultOperator = defaultOperator;
    }
}
 


 

         
