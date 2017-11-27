package trapx00.lightx00.shared.po.financestaff;

import java.util.Date;

import com.j256.ormlite.table.DatabaseTable;
import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.shared.po.employee.EmployeePosition;

@DatabaseTable(tableName = "FinanceStaff")
public class FinanceStaffPo extends EmployeePo {
    public FinanceStaffPo(String name, String id,
                          Date workSince, String username, String password) {
        super(name, id, workSince, username, password, EmployeePosition.FinanceStaff);
    }

    public FinanceStaffPo() {
    }
}


