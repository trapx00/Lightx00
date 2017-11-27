package trapx00.lightx00.shared.po.admin;

import java.util.Date;

import com.j256.ormlite.table.DatabaseTable;
import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.shared.po.employee.EmployeePosition;


@DatabaseTable(tableName = "Admin")
public class AdminPo extends EmployeePo {

    public AdminPo(String name, String id, Date workSince, String username,
                   String password) {
        super(name, id, workSince, username, password, EmployeePosition.Admin);
    }

    public AdminPo() {
    }

}

