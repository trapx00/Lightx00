package trapx00.lightx00.shared.vo.salestaff;

import trapx00.lightx00.shared.po.EmployeePosition;
import trapx00.lightx00.shared.po.salestaff.SaleStaffType;
import trapx00.lightx00.shared.vo.EmployeeVo;

import java.util.Date;

public class SaleStaffVo extends EmployeeVo {
    SaleStaffType saleStaffType;

    public SaleStaffType getSaleStaffType() {
        return saleStaffType;
    }

    public void setSaleStaffType(SaleStaffType saleStaffType) {
        this.saleStaffType = saleStaffType;
    }

    public SaleStaffVo(String name, String id, Date workSince, String username, SaleStaffType saleStaffType) {
        super(name, id, workSince, username, EmployeePosition.SaleStaff);
        this.saleStaffType = saleStaffType;
    }
}
