package trapx00.lightx00.shared.dataservice.admindataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.admin.UserAccountPo;

public interface UserManagementDataService {
    UserAccountPo[] query(String id, String name, String accountName, String password, boolean hasRoot);

    ResultMessage add(UserAccountPo account);

    ResultMessage modify(UserAccountPo account);

    ResultMessage delete(UserAccountPo account);
}
