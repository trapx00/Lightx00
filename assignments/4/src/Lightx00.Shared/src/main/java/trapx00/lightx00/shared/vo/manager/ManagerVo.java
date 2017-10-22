package trapx00.lightx00.shared.vo.manager;

import trapx00.lightx00.shared.po.employee.EmployeePosition;
import trapx00.lightx00.shared.vo.EmployeeVo;

import java.util.Date;

public class ManagerVo extends EmployeeVo{

    public ManagerVo(String name, String Id, Date workSince, String username) {
        super(name, Id, workSince, username, EmployeePosition.Manager);
    }
}