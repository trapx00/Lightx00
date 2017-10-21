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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EmployeePosition getPosition() {
        return position;
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }
}
