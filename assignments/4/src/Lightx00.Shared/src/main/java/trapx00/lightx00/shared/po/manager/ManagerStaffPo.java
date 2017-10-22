package trapx00.lightx00.shared.po.manager;

import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.shared.po.employee.EmployeePosition;

import java.util.Date;

public class ManagerStaffPo extends EmployeePo {
    public ManagerStaffPo(String name, String id, Date workSince, String username, String password) {
        super(name, id, workSince, username, password, EmployeePosition.Manager);
    }
}

