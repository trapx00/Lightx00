package trapx00.lightx00.shared.vo.admin;

public class UserAccountQueryVo {
    String Id;
    String name;
    String accountName;
    String password;
    boolean hasRoot;

    public UserAccountQueryVo(String Id, String name, String accountName, String password, boolean hasRoot) {
        this.Id = Id;
        this.name = name;
        this.accountName = accountName;
        this.password = password;
        this.hasRoot = hasRoot;
    }
}
