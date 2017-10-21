package trapx00.lightx00.shared.po.financestaff;

import java.util.Date;
import trapx00.lightx00.shared.po.EmployeePo;
import trapx00.lightx00.shared.po.EmployeePosition;
import trapx00.lightx00.shared.po.bill.BillPo;


public class FinanceStaffPo extends EmployeePo {
    public FinanceStaffPo(String name, String id,
                          Date workSince, String username, String password) {
        super(name, id, workSince, username, password, EmployeePosition.FinanceStaff);
    }


}


