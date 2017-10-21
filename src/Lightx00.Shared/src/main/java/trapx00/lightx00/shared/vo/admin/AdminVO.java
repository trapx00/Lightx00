package trapx00.lightx00.shared.vo.admin;

import trapx00.lightx00.shared.po.EmployeePosition;
import trapx00.lightx00.shared.vo.EmployeeVo;

import java.util.Date;

public class AdminVo extends EmployeeVo {
    public AdminVo(String name, String Id, Date workSince, String username) {
        super(name, Id, workSince, username, EmployeePosition.Admin);
    }
}
