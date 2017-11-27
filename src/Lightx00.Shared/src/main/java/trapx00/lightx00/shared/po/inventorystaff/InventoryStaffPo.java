package trapx00.lightx00.shared.po.inventorystaff;

import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.shared.po.employee.EmployeePosition;

import java.util.Date;

public class InventoryStaffPo extends EmployeePo {
    public InventoryStaffPo(String name, String id, Date workSince, String username, String password) {
        super(name, id, workSince, username, password, EmployeePosition.InventoryStaff);
    }

    public InventoryStaffPo() {
    }
}
