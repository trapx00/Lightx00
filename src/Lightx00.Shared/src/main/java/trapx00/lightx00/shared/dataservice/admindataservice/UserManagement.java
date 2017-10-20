package trapx00.lightx00.shared.dataservice.admindataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.admin.UserAccountPO;

public interface UserManagement {
    UserAccountPO[] query(String ID, String name, String accountName, String password, boolean hasRoot);
    ResultMessage add(UserAccountPO account);
    ResultMessage modify(UserAccountPO account);
    ResultMessage delete(UserAccountPO account);
}
