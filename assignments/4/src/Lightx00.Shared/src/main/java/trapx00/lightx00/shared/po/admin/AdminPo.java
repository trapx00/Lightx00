package trapx00.lightx00.shared.po.admin;

import java.util.Date;
import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.shared.po.employee.EmployeePosition;



public class AdminPo extends EmployeePo {
    public AdminPo(String name, String id, Date workSince, String username,
                   String password, EmployeePosition position) {
        super(name, id, workSince, username, password, EmployeePosition.Admin);
    }
}

