package trapx00.lightx00.client.blservice.adminblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.admin.UserAccountQueryVo;
import trapx00.lightx00.shared.vo.admin.UserAccountVo;

public interface UserManagementBlService {

    ResultMessage add(UserAccountVo newUserAccount);

    ResultMessage modify(UserAccountVo newUserAccount);

    ResultMessage query(UserAccountQueryVo query);

    ResultMessage delete(UserAccountVo account);
}
