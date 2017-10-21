package trapx00.lightx00.shared.po.admin;

import trapx00.lightx00.shared.po.EmployeePo;

public class UserAccountPo {
    String id;
    String name;
    String accountName;
    String password;
    String employeeId;
    UserAccountState state;

    public UserAccountPo(String id, String name, String accountName, String password, String employeeId,
                         UserAccountState state) {
        this.id = id;
        this.name = name;
        this.accountName = accountName;
        this.password = password;
        this.employeeId = employeeId;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public UserAccountState getState() {
        return state;
    }

    public void setState(UserAccountState state) {
        this.state = state;
    }
}
