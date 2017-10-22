package trapx00.lightx00.shared.vo.admin;

import trapx00.lightx00.shared.po.employee.EmployeePosition;

import java.util.Date;

public class UserAccountQueryVo {
    private String name;
    private String id;
    private EmployeePosition position;

    public UserAccountQueryVo(String name,String id,Date workSince,String username,EmployeePosition position){
        this.name = name;
        this.id = id;
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public EmployeePosition getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }

}
