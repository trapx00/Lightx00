package trapx00.lightx00.shared.po.admin;

public class UserAccountPo{
    String Id;
    String name;
    String accountName;
    String password;
    boolean hasRoot;
    UserAccountState state;

    public UserAccountPo(String id, String name, String accountName, String password, boolean hasRoot, UserAccountState state) {
        this.Id = id;
        this.name = name;
        this.accountName = accountName;
        this.password = password;
        this.hasRoot = hasRoot;
        this.state = state;
    }
}
