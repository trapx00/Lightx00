package trapx00.lightx00.client.vo.inventorystaff;

import trapx00.lightx00.shared.po.employee.EmployeePosition;
import trapx00.lightx00.client.vo.EmployeeVo;

import java.util.Date;

public class InventoryStaffVo extends EmployeeVo {
    public InventoryStaffVo(String name, String Id, Date workSince, String username,String password) {
        super(name, Id, workSince, username, EmployeePosition.InventoryStaff,password);
    }

}
