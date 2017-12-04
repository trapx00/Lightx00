package trapx00.lightx00.client.vo.admin;

import trapx00.lightx00.shared.po.employee.EmployeePosition;
import trapx00.lightx00.client.vo.EmployeeVo;

import java.util.Date;

public class AdminVo extends EmployeeVo {

    public AdminVo(String name, String id, Date workSince, String username,String password) {
        super(name, id, workSince, username, EmployeePosition.Admin,password);
    }
}
