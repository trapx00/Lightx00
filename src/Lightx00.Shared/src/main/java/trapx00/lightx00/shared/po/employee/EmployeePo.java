package trapx00.lightx00.shared.po.employee;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

@DatabaseTable(tableName = "Employee")
public class EmployeePo {
    @DatabaseField
    private String name;
    @DatabaseField(id=true)
    private String id;
    @DatabaseField
    private Date workSince;
    @DatabaseField
    private String username;
    @DatabaseField
    private String password;
    @DatabaseField
    private EmployeePosition position;

    public EmployeePo(String name, String id, Date workSince, String username,
                      String password, EmployeePosition position) {
        this.name = name;
        this.id = id;
        this.workSince = workSince;
        this.username = username;
        this.password = password;
        this.position = position;
    }

    public EmployeePo() {
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
