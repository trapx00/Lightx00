package trapx00.lightx00.shared.vo.salestaff;


import trapx00.lightx00.shared.po.client.ClientType;
import trapx00.lightx00.shared.po.salestaff.PurchaseBillType;
import trapx00.lightx00.shared.vo.BillVO;
import trapx00.lightx00.shared.vo.EmployeeVO;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVO;

public class ClientVO {
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
    SaleStaffVO defaultOperator;
}
 


 

         
