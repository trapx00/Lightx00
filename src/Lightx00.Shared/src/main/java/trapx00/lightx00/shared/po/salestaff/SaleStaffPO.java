package trapx00.lightx00.shared.po.salestaff;

import trapx00.lightx00.shared.po.EmployeePo;
import trapx00.lightx00.shared.po.EmployeePosition;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;

import java.util.Date;

public class SaleStaffPo extends EmployeePo {
    private SaleStaffType saleStaffType;

    public SaleStaffType getSaleStaffType() {
        return saleStaffType;
    }

    public void setSaleStaffType(SaleStaffType saleStaffType) {
        this.saleStaffType = saleStaffType;
    }

    public SaleStaffPo(String name, String id, Date workSince, String username, String password, SaleStaffType saleStaffType) {
        super(name, id, workSince, username, password, EmployeePosition.SaleStaff);
        this.saleStaffType = saleStaffType;
    }
}


