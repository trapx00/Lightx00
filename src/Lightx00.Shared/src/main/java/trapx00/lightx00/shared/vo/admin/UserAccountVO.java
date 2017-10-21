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
}
