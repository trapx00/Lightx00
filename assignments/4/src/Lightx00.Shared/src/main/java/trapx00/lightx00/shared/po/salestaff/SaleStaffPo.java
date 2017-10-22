package trapx00.lightx00.shared.po.salestaff;

import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.shared.po.employee.EmployeePosition;

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


