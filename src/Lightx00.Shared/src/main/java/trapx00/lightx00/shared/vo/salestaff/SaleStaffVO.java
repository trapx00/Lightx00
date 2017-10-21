package trapx00.lightx00.shared.vo.salestaff;

import trapx00.lightx00.shared.po.EmployeePosition;
import trapx00.lightx00.shared.po.salestaff.SaleStaffType;
import trapx00.lightx00.shared.vo.EmployeeVo;

import java.util.Date;

public class SaleStaffVo extends EmployeeVo {
    SaleStaffType saleStaffType;

    public SaleStaffVo(String name, String Id, Date workSince, String username, SaleStaffType saleStaffType) {
        super(name, Id, workSince, username, EmployeePosition.SaleStaff);
        this.saleStaffType = saleStaffType;
    }
}
