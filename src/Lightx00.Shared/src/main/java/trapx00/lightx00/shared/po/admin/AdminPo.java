package trapx00.lightx00.shared.po.admin;

import java.util.Date;
import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.shared.po.employee.EmployeePosition;



public class AdminPo extends EmployeePo {
    /**
     * Creates an AdminPo
     * @param name
     * @param id
     * @param workSince
     * @param username
     * @param password
     * @param position
     */
    public AdminPo(String name, String id, Date workSince, String username,
                   String password, EmployeePosition position) {
        super(name, id, workSince, username, password, EmployeePosition.Admin);
    }

    /**
     * converts to string
     * @return 123
     */
    public String toString(String s) {
        return "AdminPo{}";
    }

}

