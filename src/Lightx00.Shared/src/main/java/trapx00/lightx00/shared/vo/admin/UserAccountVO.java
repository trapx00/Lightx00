package trapx00.lightx00.shared.vo.admin;

import trapx00.lightx00.shared.po.admin.UserAccountState;

public class UserAccountVo {
    String id;
    String name;
    String accountName;
    String password;
    boolean hasRoot;
    UserAccountState state;

    public UserAccountVo(String id, String name, String accountName, String password, boolean hasRoot, UserAccountState state) {
        this.id = id;
        this.name = name;
        this.accountName = accountName;
        this.password = password;
        this.hasRoot = hasRoot;
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

    public boolean isHasRoot() {
        return hasRoot;
    }

    public void setHasRoot(boolean hasRoot) {
        this.hasRoot = hasRoot;
    }

    public UserAccountState getState() {
        return state;
    }

    public void setState(UserAccountState state) {
        this.state = state;
    }
}
