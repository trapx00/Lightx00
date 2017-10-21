package trapx00.lightx00.shared.vo.inventorystaff;

import trapx00.lightx00.shared.po.EmployeePosition;
import trapx00.lightx00.shared.vo.EmployeeVo;

import java.util.Date;

public class InventoryStaffVo extends EmployeeVo {
    public InventoryStaffVo(String name, String Id, Date workSince, String username) {
        super(name, Id, workSince, username, EmployeePosition.InventoryStaff);
    }

}
