package trapx00.lightx00.shared.vo.admin;

import trapx00.lightx00.shared.po.EmployeePosition;
import trapx00.lightx00.shared.vo.EmployeeVo;

import java.util.Date;

public class AdminVo extends EmployeeVo {
    public AdminVo(String name, String id, Date workSince, String username) {
        super(name, id, workSince, username, EmployeePosition.Admin);
    }
}
