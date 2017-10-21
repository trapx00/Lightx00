package trapx00.lightx00.shared.po.inventorystaff;

import trapx00.lightx00.shared.po.EmployeePo;
import trapx00.lightx00.shared.po.EmployeePosition;

import java.util.Date;

public class InventoryStaffPo extends EmployeePo {
    public InventoryStaffPo(String name, String Id, Date workSince, String username, String password) {
        super(name, Id, workSince, username, password, EmployeePosition.InventoryStaff);
    }
}
