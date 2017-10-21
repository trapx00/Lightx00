package trapx00.lightx00.shared.po;

import java.util.Date;

public class EmployeePo {
    String name;
    String id;
    Date workSince;
    String username;
    String password;
    EmployeePosition position;

    public EmployeePo(String name, String id, Date workSince, String username,
                      String password, EmployeePosition position) {
        this.name = name;
        this.id = id;
        this.workSince = workSince;
        this.username = username;
        this.password = password;
        this.position = position;
    }
}
