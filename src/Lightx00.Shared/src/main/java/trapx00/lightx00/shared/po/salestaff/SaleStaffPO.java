package trapx00.lightx00.shared.po.salestaff;

import trapx00.lightx00.shared.po.EmployeePo;
import trapx00.lightx00.shared.po.EmployeePosition;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;

import java.util.Date;

public class SaleStaffPo extends EmployeePo {
    SaleStaffType saleStaffType;

    public SaleStaffPo(String name, String Id, Date workSince, String username, String password, SaleStaffType saleStaffType) {
        super(name, Id, workSince, username, password, EmployeePosition.SaleStaff);
        this.saleStaffType = saleStaffType;
    }
}


