package trapx00.lightx00.shared.vo;

import java.util.Date;
import trapx00.lightx00.shared.po.employee.EmployeePosition;

public class EmployeeVo {
    private String name;
    private String id;
    private Date workSince;
    private String username;
    private EmployeePosition position;
    private boolean root;

    public EmployeeVo(String name, String id, Date workSince, String username,
                      EmployeePosition position) {
        this.name = name;
        this.id = id;
        this.workSince = workSince;
        this.username = username;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getWorkSince() {
        return workSince;
    }

    public void setWorkSince(Date workSince) {
        this.workSince = workSince;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public EmployeePosition getPosition() {
        return position;
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }

    public boolean isRoot() {
        return root;
    }

    public void setRoot(boolean root) {
        this.root = root;
    }
}
