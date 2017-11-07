package trapx00.lightx00.client.vo.financestaff;

import trapx00.lightx00.shared.po.employee.EmployeePosition;
import trapx00.lightx00.client.vo.EmployeeVo;

import java.util.Date;

public class FinanceStaffVo extends EmployeeVo {
    public FinanceStaffVo(String name, String id, Date workSince, String username) {
        super(name, id, workSince, username, EmployeePosition.FinanceStaff);
    }
}
