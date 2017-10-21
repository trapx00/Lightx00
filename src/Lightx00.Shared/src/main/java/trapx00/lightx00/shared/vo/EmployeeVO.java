package trapx00.lightx00.shared.vo;

import trapx00.lightx00.shared.po.EmployeePosition;

import java.util.Date;

public class EmployeeVo {
    String name;
    String id;
    Date workSince;
    String username;
    EmployeePosition position;

    public EmployeeVo(String name, String id, Date workSince, String username, EmployeePosition position) {
        this.name = name;
        this.id = id;
        this.workSince = workSince;
        this.username = username;
        this.position = position;
    }
}
