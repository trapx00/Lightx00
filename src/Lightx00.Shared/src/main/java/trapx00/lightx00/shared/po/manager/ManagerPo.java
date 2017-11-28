package trapx00.lightx00.shared.po.manager;

import com.j256.ormlite.table.DatabaseTable;
import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.shared.po.employee.EmployeePosition;

import java.util.Date;

@DatabaseTable(tableName = "Manager")
public class ManagerPo extends EmployeePo {
    public ManagerPo(String name, String id, Date workSince, String username, String password) {
        super(name, id, workSince, username, password, EmployeePosition.Manager);
    }

    public ManagerPo() {
    }
}

