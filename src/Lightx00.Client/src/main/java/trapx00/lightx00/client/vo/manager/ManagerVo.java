package trapx00.lightx00.client.vo.manager;

import trapx00.lightx00.shared.po.employee.EmployeePosition;
import trapx00.lightx00.client.vo.EmployeeVo;

import java.util.Date;

public class ManagerVo extends EmployeeVo {

    public ManagerVo(String name, String id, Date workSince, String username) {
        super(name, id, workSince, username, EmployeePosition.Manager);
    }
}